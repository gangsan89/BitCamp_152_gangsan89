package use;

import ������run���������ִ�.MyRunnable;

public class MyRunnableUse {
	public static void main(String[] args) {
		MyRunnable target = new MyRunnable();
		//���ʺ��� ���������� ó���Ҷ� ���ʺ��� ����Ѵ�
		
		Thread thread = new Thread(target,"�ߴ� ù��°��");
		target.start
		thread.start();
		
		Thread thread2 = new Thread(target,"�߰� �ι�°��");
		thread2.start();
		System.out.println(thread.currentThread());
		
	}
}
