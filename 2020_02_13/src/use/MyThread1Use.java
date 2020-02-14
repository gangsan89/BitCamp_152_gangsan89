package use;

import 스레드.MyThread1;

public class MyThread1Use {
	public static void m() {
		Thread thread = new MyThread1("잠온다");
		thread.start();
	}
	public static void main(String[] args) {
		Thread thread = new MyThread1("오우~예");
		//기초클래스의 래퍼런스는 서브클래스의 인스턴스를 참조하고 있습니다 라는 말
		thread.start();
		m();
		System.out.println(Thread.currentThread());
	}
}
/**
Thread[main,5,main]
아아아아~
현재 스레드의 이름: Thread[오우~예,5,main]
*/