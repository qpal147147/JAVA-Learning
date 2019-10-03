import java.util.*;
 
class Triangle{
    static public void main(String[] args){
        Scanner scn = new Scanner(System.in);//Enter data
        while(scn.hasNext()){
            int times = scn.nextInt();//save data
            for(int i = 1;i<=times;i++){//height
                for(int space = times-i;space>0;space--)System.out.print(" ");//print space
                for(int j = i;j>0;j--)System.out.print(j);//print left
                for(int k = 2;k<=i;k++)System.out.print(k);//pring right
                System.out.println();
 
        }
    }
}
/*
stdin
9

stdout
		1
       212
      32123
     4321234
    543212345
   65432123456
  7654321234567
 876543212345678
98765432123456789
*/