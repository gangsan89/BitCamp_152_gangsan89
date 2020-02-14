package java_exam;

import java.util.Scanner;

public class Page_121_5 {
		
	public static void main(String[] args) {
		int password;
		Scanner scan = new Scanner(System.in);
		System.out.println("비밀번호를 입력하세요: ");
		password = scan.nextInt();
		password <<= 2;
		System.out.println(password);
		
	}//main end
	
	
}//class end
