package java_exam;

import java.util.Scanner;

public class Page_121_3 {
	public static void main(String[] args) {
		int card=10000;
		String scanMoney;
		int useMoney;
		
		while(card >= 0) {	
			Scanner scan = new Scanner(System.in);
			System.out.println("�����ݾ�: ");
			scanMoney = scan.nextLine();
			useMoney = Integer.parseInt(scanMoney);
			
			if (card < useMoney) {
				System.out.println("�ܾ��� ������ ���� ī�带 ��� �� �� �����ϴ�!!");
				break;
			}else {
				card -= useMoney;
			}
		}
	}
}
