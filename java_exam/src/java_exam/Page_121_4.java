package java_exam;

import java.util.Scanner;

public class Page_121_4 {
		
	public static void main(String[] args) {
		
		int cash;//���ҵ�
		String creditRating;//�ſ���
		String customer;//������
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���ҵ�(����): ");
		cash=scan.nextInt();
		scan.nextLine();
			
		
		if(cash >= 5000 ) {
			System.out.println("���� ���̽ʴϱ�?(Y/N) ");
			customer = scan.nextLine();
			
			switch(customer) {
			case "y": case "Y" :
				System.out.println("����ī�� �߱��� �����մϴ�.");
				break;
			default : 
				System.out.println("����ī�� �߱��� �Ұ����մϴ�.");
				break;
			}
		}else {
			System.out.println("�ſ���(A~F): ");
			creditRating = scan.nextLine();
			switch(creditRating) {
			case "A": case "a": case "B": case "b":
				System.out.println("���� ���̽ʴϱ�?(Y/N) ");
				customer = scan.nextLine();
				switch(customer) {
				case "y": case "Y" :
					System.out.println("����ī�� �߱��� �����մϴ�.");
					break;
				default : 
					System.out.println("����ī�� �߱��� �Ұ����մϴ�.");
					break;
				}
			}
		}//else end
	}//main end
	
	
}//class end
