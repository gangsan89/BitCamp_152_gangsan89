package 정리;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class OverTest_Param2 {
	static public void callAA(AA ref) {
		System.out.println("callAA(AA ref) ");
		ref.m1();
	}


	public static void main(String[] args) {
		
		callAA( new SubAA() );
		System.out.println("/////////");
		
		callAA( new BBAA() );
		
		System.out.println("//////////////");
		System.out.println(new Date());
		System.out.println(new BBAA());
		System.err.printf("%d",10);
		
		AA aaa = new SubAA(); //업캐스팅
		AA aa22 = new BBAA();
		SubAA rrr = (SubAA)aaa;
			rrr = (SubAA)aa22; //SubAA랑 BBAA는 형제지 상하관계가 아니기 때문에 서로 가져다 쓸수가없다
			
		int qq = 10;
		Integer ii = new Integer(qq);
		
		ii = qq;
		qq = new Integer(99);
		// 원시자료형 = 래퍼클래스 wrapper class 가 래퍼런스 클래스로 바꿔줌
	}
}
