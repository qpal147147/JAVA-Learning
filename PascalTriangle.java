import java.util.*;
import static java.lang.System.out;
 
class Test {
	//recursion
	static int Pascal(int x,int y) {
		if (y==0)return 0;
		else if(y==1)return 1;
		else if(x == y-1)return 1;
		else return Pascal(x-1,y-1) + Pascal(x-1,y);
	}
 
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int times = scn.nextInt();
 
		out.println("Print all");
 
			for(int x = 0;x<=times;x++) {
				for(int y = 1;y<=x+1;y++) {
					out.print(Pascal(x,y) + " ");
				}
				out.println();
			}
 
		out.println("Print designated");
 
		times = scn.nextInt();
 
		for(int x = 1;x<=times+1;x++) {
			out.print(Pascal(times,x) + " ");
		}
	}
}

/*
stdin
5
10

stdout
Print all
1 
1 1 
1 2 1 
1 3 3 1 
1 4 6 4 1 
1 5 10 10 5 1 
Print designated
1 10 45 120 210 252 210 120 45 10 1 
*/