package 정리;

import java.util.List;
import java.util.ArrayList;

public class OverTest {

	public static void main(String[] args) {
		AA ref = new AA(); 
		SubAA ref2 = new SubAA(); 
		ref.m1(); //AA 클래스의 m1  // 얘를 정적결합 static binding 라고 한다 ref.m1() .으로 누군가를 호출하는걸 바인딩
		ref2.m1(); //SubAA 클래스의 m1 // 얘를 정적결합 static binding 라고 한다.
		
		AA refX = new SubAA(); // 업캐스팅, 거꾸로 되어있으면 다운캐스팅 
		refX.m1(); // 동적 결합 dynamic binding 이라고 한다 실행하는 시점에서 불러와지는거?
		refX = new SubAASub();
		refX.m1();
		refX = new AA();
		
		refX.m1();
		//호출하는 문장도 같고, 래퍼런스도 똑같지만 래퍼런스가 참조하는 애가 누군지에 따라서 다른애를 불러오는것
		//이게 오버라이드다, 이게 다형성 
		List refff = new ArrayList();
		refff.add("dasdasd");
		//refff = new List();
	}
}
