package 날짜;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test {
	public static void main(String[] args) {
		int year = 2020;
		//1. 조건식으로 평년인지 윤년인지를 출력해보세요
		//2020년은 윤년입니다
		if( (year%4)==0 ) {
			if( (year%100) !=0 || (year%400)==0) {
			System.out.println(year+"년은 윤년입니다.");
			} else {
				System.out.println(year+"년은 평년입니다.");
			}
		}else {
			System.out.println(year+"년은 평년입니다.");
		}
		
		System.out.println("///////////////");
		//2.GregorianCallender 를 사용해서 윤년인지 평년인지 출력하기
		GregorianCalendar calendar = new GregorianCalendar();
		
		if(calendar.isLeapYear(year)) {
			System.out.println(year+"년은 윤년입니다");
		}else {
			System.out.println(year+"년은 평년입니다.");
		}
		
		
	}
}
