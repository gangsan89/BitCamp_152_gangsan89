package ½º·¹µå;

public class MyThread1To100 extends Thread {
	public MyThread1To100() {
		
	}
	public MyThread1To100(String name) {
		super(name);
	}
	@Override
	public void run() {
		 String name = currentThread().getName();
		 for( int i= 1; i<=5 ; i++ ) {
			 System.out.println(name+" : "+i);
		 }
	}
	
	
}
