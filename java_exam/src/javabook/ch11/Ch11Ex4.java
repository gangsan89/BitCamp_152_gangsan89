package javabook.ch11;

public class Ch11Ex4 extends Thread{
	public void run() {
		System.out.println("스레드에서 출력");
	}
	
	public static void main(String[] args) {
		Ch11Ex4 app = new Ch11Ex4();
		app.start();
		System.out.println("프로그램 종료");
	}
}
