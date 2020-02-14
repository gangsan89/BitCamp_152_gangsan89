package use;

import 스레드.MyThread1To100;

public class MyThread1To100Use {
	public static void main(String[] args) {
		Thread thread=new MyThread1To100("#1");
		Thread thread2=new MyThread1To100("#2번");
		Thread thread3=new MyThread1To100("#3번이");
		Thread thread4=new MyThread1To100("#4번이다");
		Thread thread5=new MyThread1To100("#5번이다잉");
		
		thread.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		
	}
}
