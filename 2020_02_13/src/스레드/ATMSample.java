package ������;

import java.util.Scanner;

/**
 * �󸶸� ����?? ������� ������ ó�� ����
 * ����
 * ����ó���޼ҵ�
 * @author bitcamp
 *
 */
public class ATMSample implements Runnable {
	private int balance = 1000000;
	private String custName;
	private Scanner input = new Scanner(System.in);
	/**
	 * �Ű������� �޾��ִ� ��ŭ ���� ����
	 * howMuch : ��ݾ�
	 * ��ݾ��� �ܾװ� ���ؼ� �����ϸ� ���� ����
	 * �߶��� -= �Ͽ��ġ
	 * �ܾ��� �����ϸ� �ܾ��� �����մϴ� �޽��� ���
	 */
	synchronized private void withDraw(int howMuch) {
		if(balance >= howMuch ) {
			//������� ���� �ܾ��� �� ���Ҵ��� Ȯ�ν��������
			balance -= howMuch;
			System.out.println("\n"+custName+"\n�ܾ�: " + (balance+howMuch) + 
					"\n ���: " +howMuch+ "\n���� �� �ܾ�: "+balance);
		}else {
			System.err.println("�� ���� ���ٸ� �ֹ����� ���̳� \n �������Ӹ�");
		}notifyAll(); //���⼭ ������ Ǯ����~
	}
	/**
	 * ������ �󸶸� ������ ������ �Ѱ�, �ݾ� �������ְ� (withDrawȣ��)
	 * ������(thread) �ݺ�, �ܾ��� 0���� �� ������
	 */
	@Override
	public void run() {
		
		while( balance > 0 ) {
			synchronized (this) {
				try {
					custName = Thread.currentThread().getName();
					System.out.println("\n���� "+custName+" �� ���� "+balance+"��ŭ �������̿�");
					System.out.println("�ʰ� ���� �̴´ٿ� �� ��ǥ�� �Ǵ�. \n�󸶻���? ");
					withDraw(input.nextInt());
					wait(); // ��� ����!!
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}

	}

}
