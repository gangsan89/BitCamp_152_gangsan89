package 정리;
class AA { // 전부 오버로딩 된거다
		void m1() {//#1
			System.out.println("기초클래스의 m1");
		}

		void m1(int a) {//#2
			System.out.println(a);
		}

		void m1(int a, int b) {//#3
			System.out.println(a+b);
		}

		void m1(int a, int b, int c) {//#4
			System.out.println(a+b+c);
		}

		void m1(String a) {//#5

		}

	}