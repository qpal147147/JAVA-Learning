import java.util.*;
 
class Test {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
 
		while(scn.hasNext()) {
			String number = scn.next();
			for(char c:number.toCharArray())
				System.out.print(c + " ");
			System.out.println();
		}
	}
}