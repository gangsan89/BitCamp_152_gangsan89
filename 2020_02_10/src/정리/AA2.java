package 정리;
public class AA2 { // 전부 오버로딩 된거다
	/*
	 * void m1() {//#1 System.out.println("기초클래스의 m1"); }
	 */
		public void m1(int...a) { //varargs = variable Arguments의 약자 가변매개변수 라고 하는건데 
								//Overloading을 줄이기 위해서 나왔다 
								//하는일이 같으면 이렇게 잡는다, 하는일이 다르면 이렇게 잡으면 안된다
			System.out.println("int...a");
			for(int d : a) {
				System.out.println(d);
			}
		}
	/*
	 * void m1(int a) {//#2 System.out.println(a); }
	 * 
	 * void m1(int a, int b) {//#3 System.out.println(a+b); }
	 * 
	 * void m1(int a, int b, int c) {//#4 System.out.println(a+b+c); }
	 */

		public void m1(String a) {//#5

		}

	}