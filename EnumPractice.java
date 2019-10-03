import java.util.*;
import static java.lang.System.out;
 
enum Day{
	Monday("星期一",1),
	Tuesday("星期二",2),
	Wednesday("星期三",3),
	Thursday("星期四",4),
	Friday("星期五",5),
	Saturday("星期六",6),
	Sunday("星期日",7);
 
	private String date = "";
	private int v;
 
	Day(String date,int v){
		this.date = date;
		this.v = v;
	}
 
	public String toString(){
		return ",Date:" + date + ",day:" + v;
	}
}
 
class Test{
	public static void main(String[] args){
		for(Day c:Day.values()){
			out.println("English:" + c.name() + c);
		}
	}
}