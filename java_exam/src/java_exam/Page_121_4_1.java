package java_exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
/**
 * 클래스로 묶어서 
 * 입력 - 외부
 * 처리 - 내부
 * 출력 - 외부
 * 
 * 멤버변수 4가지 
 * 	연소득
 * 	신용등급
 * 	기존고객
 * 	발급상태
 * 
 * 1입력 - 키보드
 * 	연소득 
 * 	신용등급
 * 	기존고객
 * 	발급상태
 * 2 처리
 * 
 * 3 출력
 * 	
 * @author bitcamp
 *
 */
public class Page_121_4_1 {
	private int annualIncome; //연소득 0
	private char creditRating; // 신용등급 0
	private boolean isMember; //기존고객 false
	private String issuanceStatus; //발급상태 null 각 이렇게 초기화가 됨
	
	private BufferedReader reader;
	
	public Page_121_4_1() {
		reader = new BufferedReader( new InputStreamReader(System.in) );
	}
	public void consoleInput() {
		try {
		System.out.println("연소득? "); 
		annualIncome = Integer.parseInt( reader.readLine() );
		
		System.out.println("A, B, C, D, F 중에 입력하세요.");
		System.out.println("신용등급? ");
		
		String s =reader.readLine();
		if(s.length()==1 &&	s.equalsIgnoreCase("A")||s.equalsIgnoreCase("B")||
				s.equalsIgnoreCase("C") ) {
			creditRating = s.toUpperCase().charAt(0);
		}else {
			reInput("A, B, C, D, F 중에 입력하세요.");
			
		}
		
		System.out.println("기존고객은 T, 신규고객은 F");
		System.out.println("기존고객? ");
		s = reader.readLine();
		if(s.length()==1 && s.equalsIgnoreCase("T")|| s.equalsIgnoreCase("f") ) {
						
			isMember=true;
		}else {
			reInput("기존고객은 T, 신규고객은 F");
			
		}
		membershipCondition();
		
		}catch (IOException e) {
			System.out.println("입력을 받아서 exception이 풀림");
		}catch (NumberFormatException e) {
			reInput("숫자를 입력해주세요.");
			
		}catch (Exception e) {
			reInput("예상하지 못한 예외");
			
		}
	}
	
	private void reInput(String msg) {
		System.out.println(msg);
		consoleInput();
	}
	protected void membershipCondition() {
		if(annualIncome >=50000000 || creditRating >='B') {
			if(isMember)issuanceStatus = "발급대상"; 
		}	
			else issuanceStatus = "발급대상제외";
		
	}
	public void consoleOutput() {
		System.out.println("연소득 신용등급 기존고객 발급상태");
		System.out.printf("%12d %5c %8b %10s \n", 
				annualIncome, creditRating, isMember, issuanceStatus);
	}
		
	
	
	
}//class end
