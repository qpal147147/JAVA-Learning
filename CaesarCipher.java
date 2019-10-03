import java.util.*;
import static java.lang.System.out;
 
 
 
 
class CaeserPassword {
		  public static void main(String[] args) {
			 Scanner scn = new Scanner(System.in); 
			 char password[] = scn.nextLine().toCharArray();//Enter encryption data
 
			 int n = scn.nextInt();//Enter displacement
 
			 out.print("Encryption result:");
			 caesar(password,n);
			 for(char c:password) out.print(c);
 
			 out.print("\nDecrypt result:");
			 ReverseCaesar(password,n);
			 for(char c:password) out.print(c);
		  }
		  //Encryption
		  static public void caesar(char password[],int n) {
			  for(int i = 0;i<password.length;i++) {
				  if('A'<=password[i] && password[i]<='Z') {
					  password[i] += n%26;
					  if(password[i] < 'A')password[i] +=26;
					  else if(password[i] > 'Z')password[i] -= 26;
				  }
				  else if('a'<=password[i] && password[i]<='z') {
					  password[i] += n%26;
					  if(password[i]<'a')password[i] +=26;
					  else if(password[i]>'z')password[i] -= 26;
				  }
			  }
		  }
		  //Decrypt
		  static public void ReverseCaesar(char password[],int n) {
			  caesar(password,0-n);
		  }
}
/*
stdin
I love Java, and I love you.
4
stdout
Encryption result:M pszi Neze, erh M pszi csy.
Decrypt result:I love Java, and I love you.
*/