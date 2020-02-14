package java_exam;
/**
 * 가위 바위 보 게임 만들기
 * 가위 바위 보는 각 정수형 1, 2, 3 
 * 컴퓨터가 제시할 가위바위보 데이터를 만든다
 * 다섯개의 정수를 저장 할 수 있는 배열을 만들고
 * 1,2,3 데이터를 섞어 초기화 한다
 * 게임은 총 5회 진행, 컴퓨터는 배열 안 데이터를 차례대로 출력
 * 현재횟수 / 총횟수와 함께 입력 메시지를 출력한다
 * 키보드로 1, 2, 3, 중 하나를 입력하고 컴퓨터와 키보드로 입력한 값을 비교하여 누가 이겼는지 알려준다
 * 게임을 종료하면 누가 이겼는지 표시한다.
 * 
 * 5판3선승제
 * 가위 1
 * 바위 2
 * 보 3
 * 배열 0~4까지 만들고
 * 랜덤으로 숫자배분
 * 키보드로 유저값 입력받기
 * 현재횟수/총횟수 / 입력메시지 /승패 출력
 * 5판 3선승제로 승자 뽑기
 * 
 * int Scissors 1
 * int rock 2
 * int Paper 3
 * 변하지 않는 정수 static
 * 
 * 입력받는 처리자
 * 출력하는 처리자
 * 
 * 배열 5칸 만들기 
 * 배열에 숫자 집어넣기
 * 섞기
 * 순서대로 출력 for문
 * 
 * 5판까지 반복하는 반복문
 * 승패계산 처리자
 * 랜덤문
 * 
 */

//import java.util.Random;
import java.util.Scanner;

public class Page_121_7 {
	
		public int sci = 1; //가위
		private int rock = 2; //바위
		private int paper = 3; //보
		private int input; // 유저가 입력한 값
		private int com; // 컴퓨터가 출력한 값
		
		Scanner scan = new Scanner(System.in);
		int rnd=0;
		int[] arr = new int[5];
		//int arr[5] = {1,2,3};
		
		/**
		 * 배열에 랜덤값을 넣어준다.
		 */
		public void Page_121_7() {
			
		}
		public int rndNum(int rnd) {
			rnd = (int)(Math.random() * 2+1)+1;
			//System.out.println(rnd);
			return rnd;
		}
		
		}
	
		
		
		
		
		
		
		
		
		
}//class end
