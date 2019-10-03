import java.text.*;
import java.util.*;
 
class TestTimer{
	public static void main(String[] args){
		Timer t = new Timer();				//Creat Timer object
		System.out.println(new Date());	//Print format time now
		t.schedule(new DemoTimer(),1000,2000); //after 1s start,2s run again
	}
}
 
class DemoTimer extends TimerTask{  
	int i = 0;
 
	public void run(){		//run code
		if (i++ < 5)  System.out.println(new Date());//set 5 times
		else {
			this.cancel(); //pause timer
			System.exit(0);//exit code
		}
	}
}