package ��¥;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test {
	public static void main(String[] args) {
		int year = 2020;
		//1. ���ǽ����� ������� ���������� ����غ�����
		//2020���� �����Դϴ�
		if( (year%4)==0 ) {
			if( (year%100) !=0 || (year%400)==0) {
			System.out.println(year+"���� �����Դϴ�.");
			} else {
				System.out.println(year+"���� ����Դϴ�.");
			}
		}else {
			System.out.println(year+"���� ����Դϴ�.");
		}
		
		System.out.println("///////////////");
		//2.GregorianCallender �� ����ؼ� �������� ������� ����ϱ�
		GregorianCalendar calendar = new GregorianCalendar();
		
		if(calendar.isLeapYear(year)) {
			System.out.println(year+"���� �����Դϴ�");
		}else {
			System.out.println(year+"���� ����Դϴ�.");
		}
		
		
	}
}
