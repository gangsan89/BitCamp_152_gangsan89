package java_exam;

import java.util.Scanner;

public class Page_121_4 {
		
	public static void main(String[] args) {
		
		int cash;//연소득
		String creditRating;//신용등급
		String customer;//기존고객
		
		Scanner scan = new Scanner(System.in);
		System.out.println("연소득(만원): ");
		cash=scan.nextInt();
		scan.nextLine();
			
		
		if(cash >= 5000 ) {
			System.out.println("기존 고객이십니까?(Y/N) ");
			customer = scan.nextLine();
			
			switch(customer) {
			case "y": case "Y" :
				System.out.println("제휴카드 발급이 가능합니다.");
				break;
			default : 
				System.out.println("제휴카드 발급이 불가능합니다.");
				break;
			}
		}else {
			System.out.println("신용등급(A~F): ");
			creditRating = scan.nextLine();
			switch(creditRating) {
			case "A": case "a": case "B": case "b":
				System.out.println("기존 고객이십니까?(Y/N) ");
				customer = scan.nextLine();
				switch(customer) {
				case "y": case "Y" :
					System.out.println("제휴카드 발급이 가능합니다.");
					break;
				default : 
					System.out.println("제휴카드 발급이 불가능합니다.");
					break;
				}
			}
		}//else end
	}//main end
	
	
}//class end
