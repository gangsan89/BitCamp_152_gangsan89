package java_exam;
/**
 * 마트의 POS시스템에서 판매상품의 가격을 바코드로 읽어 총액을 계산하는 프로그램을 작성하라.
 * 상품 가격은 키보드 입력으로 (스캐너)바코드 리딩을 대체하도록 한다.
 * 상품 가격대신 'q'를 입력하면 지금까지 입력 금액의 합을 출력하고 종료한다.
 * 
 * 총금액 total
 * 상품가격 value
 * 'q'를 입력하면 종료 while
 * 
 */
import java.util.Scanner;

public class Page_121_6 {
		
	public static void main(String[] args) {
		int total=0;
		int value;
		/*
		 * Scanner scan = new Scanner(System.in); System.out.println("상품 가격을 입력해주세요: ");
		 * String sc = scan.nextLine();
		 */
				
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("상품 가격을 입력해주세요: ");
			String sc = scan.nextLine();
			if(sc.equals("q")) {
				System.out.println("총 금액은: "+total);
				break;
			}else {
			value = Integer.parseInt(sc);
			total += value;
			}
		}
		
	}//main end
}//class end
