package 스레드;

import java.util.Scanner;

/**
 * 얼마를 인출?? 인출금을 가지고 처리 ㄱㄱ
 * 연산
 * 인출처리메소드
 * @author bitcamp
 *
 */
public class ATMSample implements Runnable {
	private int balance = 1000000;
	private String custName;
	private Scanner input = new Scanner(System.in);
	/**
	 * 매개변수가 받아주는 만큼 인출 ㄱㄱ
	 * howMuch : 출금액
	 * 출금액을 잔액과 비교해서 가능하면 인출 ㄱㄱ
	 * 발란스 -= 하우머치
	 * 잔액이 부족하면 잔액이 부족합니다 메시지 출력
	 */
	synchronized private void withDraw(int howMuch) {
		if(balance >= howMuch ) {
			//인출금을 빼고 잔액이 얼마 남았는지 확인시켜줘야함
			balance -= howMuch;
			System.out.println("\n"+custName+"\n잔액: " + (balance+howMuch) + 
					"\n 출금: " +howMuch+ "\n인출 후 잔액: "+balance);
		}else {
			System.err.println("넌 내가 빙다리 핫바지로 보이냐 \n 돈없어임마");
		}notifyAll(); //여기서 정지가 풀린다~
	}
	/**
	 * 고객에게 얼마를 인출할 것인지 붇고, 금액 인출해주고 (withDraw호출)
	 * 고객마다(thread) 반복, 잔액이 0원이 될 때까지
	 */
	@Override
	public void run() {
		
		while( balance > 0 ) {
			synchronized (this) {
				try {
					custName = Thread.currentThread().getName();
					System.out.println("\n어이 "+custName+" 넌 돈이 "+balance+"만큼 있을것이여");
					System.out.println("너가 돈을 뽑는다에 내 명세표를 건다. \n얼마뺄래? ");
					withDraw(input.nextInt());
					wait(); // 모두 정지!!
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}

	}

}
