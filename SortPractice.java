import java.util.*;
import static java.lang.System.out;
 
class Test {
		  public static void main(String[] args) {
			  List list = Arrays.asList(5,9,4,7,0,25,8,100,66,49,31,52,73,88);
			  out.println("Before sort\n" + list);
 
			  Collections.sort(list);
			  out.println("Use \"Collections.sort\" fuction Rise sort\n" + list);
 
			  Collections.sort(list,new Recerse());
			  out.println("Use \"Collections.sort\" implements Comparator Down sort\n" + list);
 
			  list.sort(new Recerse());
			  out.println("Use \"list.sort\" implements Comparator Down sort\n" + list);
		  }
}
class Recerse implements Comparator<Integer>{
 
	@Override
	public int compare(Integer i1, Integer i2) {
		return -1 * (i1.compareTo(i2));	
	}
 
}
/*
Before sort
[5, 9, 4, 7, 0, 25, 8, 100, 66, 49, 31, 52, 73, 88]
Use "Collections.sort" fuction Rise sort
[0, 4, 5, 7, 8, 9, 25, 31, 49, 52, 66, 73, 88, 100]
Use "Collections.sort" implements Comparator Down sort
[100, 88, 73, 66, 52, 49, 31, 25, 9, 8, 7, 5, 4, 0]
Use "list.sort" implements Comparator Down sort
[100, 88, 73, 66, 52, 49, 31, 25, 9, 8, 7, 5, 4, 0]
*/