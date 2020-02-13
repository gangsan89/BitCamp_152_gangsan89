package 난수;

import java.util.Random;

public class Test {
	public static void main(String[] args) {
		
		for( int i=0; i<100; i++) {
			System.out.println(Math.random());
		}
		System.out.println("//////////////");
		for( int i=0; i<100; i++) {
			System.out.println((int)(Math.random()*10)+1);
		}
		
		System.out.println("//////////");
		System.out.println(Math.round(5.6)); // int 정수 형으로 반올림,반내림
		System.out.println(Math.round(5.4));
		System.out.println();
		System.out.println(Math.rint(5.6)); // double 형으로 반올림,반내림
		System.out.println(Math.rint(5.4));
		System.out.println();
		System.out.println(Math.ceil(5.6)); // double 형으로 무조건 올림
		System.out.println(Math.ceil(5.4));
		System.out.println();
		System.out.println(Math.floor(5.6)); // double 형으로 내림
		System.out.println(Math.floor(5.4));
		
		System.out.println("//////////////");
		Random random = new Random();
		
		for(int i=1; i<10; i++) {
			System.out.println(random.nextInt(10)  );
		}
		
		
		
	}
}
