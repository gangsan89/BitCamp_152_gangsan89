package use;

import ������.MyThread1;

public class MyThread1Use {
	public static void m() {
		Thread thread = new MyThread1("��´�");
		thread.start();
	}
	public static void main(String[] args) {
		Thread thread = new MyThread1("����~��");
		//����Ŭ������ ���۷����� ����Ŭ������ �ν��Ͻ��� �����ϰ� �ֽ��ϴ� ��� ��
		thread.start();
		m();
		System.out.println(Thread.currentThread());
	}
}
/**
Thread[main,5,main]
�ƾƾƾ�~
���� �������� �̸�: Thread[����~��,5,main]
*/