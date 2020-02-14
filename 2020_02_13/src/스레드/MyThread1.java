package 스레드;

public class MyThread1 extends Thread {
	public MyThread1(String threadName) {
		super(threadName);
	}
	
	@Override
	public void run() {
		System.out.println("아아아아~");
		System.out.println("현재 스레드의 이름: "+ currentThread());
	}
	
}
