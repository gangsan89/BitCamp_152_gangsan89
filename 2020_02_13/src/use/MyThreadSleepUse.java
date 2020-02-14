package use;

import 스레드.MyThreadSleep;

public class MyThreadSleepUse {
	public static void main(String[] args) {
		Thread thread = new MyThreadSleep("#1");
		Thread thread2 = new MyThreadSleep("#2번");
		Thread thread3 = new MyThreadSleep("#3번이");
		Thread thread4 = new MyThreadSleep("#4번이야");
		thread.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
		
		
		
	}
}
