package java_exam;

import java.util.Scanner;

public class Page_121_3 {
	public static void main(String[] args) {
		int card=10000;
		String scanMoney;
		int useMoney;
		
		while(card >= 0) {	
			Scanner scan = new Scanner(System.in);
			System.out.println("결제금액: ");
			scanMoney = scan.nextLine();
			useMoney = Integer.parseInt(scanMoney);
			
			if (card < useMoney) {
				System.out.println("잔액이 부족해 교통 카드를 사용 할 수 없습니다!!");
				break;
			}else {
				card -= useMoney;
			}
		}
	}
}
