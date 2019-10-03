import java.util.*;
 
class HorseRacing {
		public static void main(String[] args) {
			Thread t1 = new Thread(new Horse1());	//參數為要執行之執行緒
			Thread t2 = new Thread(new Horse2());
			Thread t3 = new Thread(new Horse3());
 
			t1.start();
			t2.start();
			t3.start();
 
			try{					//等待執行緒跑完主程式才結束
				t1.join();
				t2.join();
				t3.join();
 
			}catch(Exception e){
				System.out.println("被中斷");
			}
 
			System.out.println("主程式結束");
		  }
}
 
class Horse1 implements Runnable{  //實作Runnable
	public void run() {				//覆寫run方法  要執行的任務
		try {
			Thread.sleep(3000);		//停滯三秒
			System.out.println("H1到達終點");
		} catch (InterruptedException e) {
			System.out.print("被中斷");
		}
	}
}
 
class Horse2 implements Runnable{
	public void run() {
		try {
			Thread.sleep(3000);
			System.out.println("H2到達終點");
		} catch (InterruptedException e) {
			System.out.print("被中斷");
		}
	}
}
 
class Horse3 implements Runnable{
	public void run() {
		try {
			Thread.sleep(3000);
			System.out.println("H3到達終點");
		} catch (InterruptedException e) {
			System.out.print("被中斷");
		}
	}
}

/*
stdout
H2到達終點
H1到達終點
H3到達終點
主程式結束
*/