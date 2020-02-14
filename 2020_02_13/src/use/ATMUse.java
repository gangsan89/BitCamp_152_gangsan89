package use;

import java.util.ArrayList;
import java.util.List;

import 스레드.ATMSample;

public class ATMUse {
	public static void main(String[] args) {
		Runnable target = new ATMSample(); //ATMSample의 기초클래스가 Runnable 이라 가능
		List<Thread> threads = new ArrayList<Thread>();
		threads.add(new Thread(target, "엄마"));
		threads.add(new Thread(target, "아빠"));
		threads.add(new Thread(target, "아들"));
		threads.add(new Thread(target, "딸"));
		
		for(Thread t : threads) {
			t.start();
		}
		
	}
}
