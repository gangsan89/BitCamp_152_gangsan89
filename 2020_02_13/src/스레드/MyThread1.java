package ������;

public class MyThread1 extends Thread {
	public MyThread1(String threadName) {
		super(threadName);
	}
	
	@Override
	public void run() {
		System.out.println("�ƾƾƾ�~");
		System.out.println("���� �������� �̸�: "+ currentThread());
	}
	
}
