package use;

import 실행할run을가지고있는.MyRunnable;

public class MyRunnableUse {
	public static void main(String[] args) {
		MyRunnable target = new MyRunnable();
		//러너블은 공통적으로 처리할때 러너블을 사용한다
		
		Thread thread = new Thread(target,"야는 첫번째다");
		target.start
		thread.start();
		
		Thread thread2 = new Thread(target,"야가 두번째고");
		thread2.start();
		System.out.println(thread.currentThread());
		
	}
}
