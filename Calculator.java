import java.util.*;

class Test{
	public static void main(String args[]) {
		System.out.println(calculator(toPostfix("736/(43-20)*23+64"))); //ans:800
	}
	
	public static String toPostfix(String s) {
		char arr[] = s.toCharArray(); 
		LinkedList<Character> stack = new LinkedList<Character>(); //opStack
		StringBuilder output = new StringBuilder(); //save Postfix
		
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] == '(') stack.add(arr[i]);
			else if("+-*/".indexOf(arr[i]) != -1) { //found op
				while(!stack.isEmpty() && (priority(arr[i]) <= priority(stack.getLast()))) { //Stack not empty and priority of last >= currently priority 
					output.append(stack.removeLast());
				}
				stack.add(arr[i]);
			}
			else if(arr[i] == ')') {
				while(stack.getLast() != '(') {
					output.append(stack.removeLast());
				}
				stack.removeLast();
			}
			else { // is number
				if(i+1 != arr.length) {//not final char
					if("0123456789".indexOf(arr[i+1]) == -1) { //next char not number, Judging ten digits or more
						output.append(arr[i]);
						output.append(" ");
					}
					else output.append(arr[i]);// is ten digits or more
				}
				else output.append(arr[i]);
			}
		}
		
		while(!stack.isEmpty()) output.append(stack.removeLast());
		return output.toString();
	}
	public static int math(char op,int n1,int n2) { //operation
		if(op == '+') return n1+n2;
		else if(op == '-') return n1 - n2;
		else if(op == '*') return n1*n2;
		else return n1/n2;
	}
	public static int calculator(String s) {
		LinkedList<Integer> stack = new LinkedList<Integer>(); // number stack
		char arr[] = s.toCharArray();
		
		for(int i = 0;i<arr.length;i++) {
			if("+-*/".indexOf(arr[i]) != -1) { //found op
				int n2 = stack.removeLast();
				int n1 = stack.removeLast();
				
				stack.add(math(arr[i],n1,n2));
			}
			else {
				if(!stack.isEmpty()) { //judging first char
					if("0123456789".indexOf(arr[i-1]) != -1) { //judging ten digit or more
						if(arr[i] != ' ') { //and not whitespace
							int number = stack.removeLast()*10 + Integer.parseInt(String.valueOf(arr[i]));//Previous number*10 + Present number
							stack.add(number);
						}
					}
					else {
						if(arr[i] != ' ') stack.add(Integer.parseInt(String.valueOf(arr[i])));
					}
				}
				else stack.add(Integer.parseInt(String.valueOf(arr[i])));
			}
		}
		
		return stack.getLast();
	}
	public static int priority(char c) { // op priority
		if(c == '*' || c == '/')return 2;
		else if(c == '+' || c== '-')return 1;
		else return 0;
	}
}