package ������;

public class MyThreadSleep extends Thread {
	public MyThreadSleep() {
		
	}
	public MyThreadSleep(String name) {
		super(name);
	}
	@Override
	public void run() {
		 String name = currentThread().getName();
		 for( int i= 1; i<=5 ; i++ ) {
			 System.out.println(name+" : "+i);
			 try {
				 System.out.println(name+"������ ���� ��");
				sleep(1000);
				System.out.println(name+"������ 1�� ���� ��");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	}
	
	
}
