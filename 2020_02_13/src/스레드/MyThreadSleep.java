package 스레드;

public class MyThreadSleep extends Thread {
	public MyThreadSleep() {
		
	}
	public MyThreadSleep(String name) {
		super(name);
	}
	@Override
	public void run() {
		 String name = currentThread().getName();
		 for( int i= 1; i<=5 ; i++ ) {
			 System.out.println(name+" : "+i);
			 try {
				 System.out.println(name+"스레드 슬립 전");
				sleep(1000);
				System.out.println(name+"스레드 1초 슬립 후");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	}
	
	
}
