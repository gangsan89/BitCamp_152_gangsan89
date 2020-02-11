package 정리;
class SubAA extends AA{
		@Override //이렇게 해서 에러나면 오버로드, 아니면 오버라이드 된거다
		void m1() {//#1 6번째라고 하고 싶지만 #1번의 것을 가리고 있는거다
			System.out.println("SubAA의 m1()");
		}
		//@Override Overload 이건 기초클래스에 더블형이 존재하지 않아서 에러나서 오버로드 된거다 
		void m1(double a) {//#6
			
		}
		
		void m1(int[] a) {//#7 
			int sum=0;
			for( int data : a ) {
				sum += data;
			}
			for( int data : a ) {
				System.out.println(data+", ");
			}
			System.out.println(sum);
		}
		void out() {
			m1(); //this.m1(); 가까운것부터 가져오니 내가가진 m1(){}을 부르게 된다
			super.m1(); // 기초클래스의 m1(){} 을 가져오고 싶으면 이렇게 써라
		}
	}