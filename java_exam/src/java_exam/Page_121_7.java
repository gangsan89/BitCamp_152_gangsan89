package java_exam;
/**
 * ���� ���� �� ���� �����
 * ���� ���� ���� �� ������ 1, 2, 3 
 * ��ǻ�Ͱ� ������ ���������� �����͸� �����
 * �ټ����� ������ ���� �� �� �ִ� �迭�� �����
 * 1,2,3 �����͸� ���� �ʱ�ȭ �Ѵ�
 * ������ �� 5ȸ ����, ��ǻ�ʹ� �迭 �� �����͸� ���ʴ�� ���
 * ����Ƚ�� / ��Ƚ���� �Բ� �Է� �޽����� ����Ѵ�
 * Ű����� 1, 2, 3, �� �ϳ��� �Է��ϰ� ��ǻ�Ϳ� Ű����� �Է��� ���� ���Ͽ� ���� �̰���� �˷��ش�
 * ������ �����ϸ� ���� �̰���� ǥ���Ѵ�.
 * 
 * 5��3������
 * ���� 1
 * ���� 2
 * �� 3
 * �迭 0~4���� �����
 * �������� ���ڹ��
 * Ű����� ������ �Է¹ޱ�
 * ����Ƚ��/��Ƚ�� / �Է¸޽��� /���� ���
 * 5�� 3�������� ���� �̱�
 * 
 * int Scissors 1
 * int rock 2
 * int Paper 3
 * ������ �ʴ� ���� static
 * 
 * �Է¹޴� ó����
 * ����ϴ� ó����
 * 
 * �迭 5ĭ ����� 
 * �迭�� ���� ����ֱ�
 * ����
 * ������� ��� for��
 * 
 * 5�Ǳ��� �ݺ��ϴ� �ݺ���
 * ���а�� ó����
 * ������
 * 
 */

//import java.util.Random;
import java.util.Scanner;

public class Page_121_7 {
	
		public int sci = 1; //����
		private int rock = 2; //����
		private int paper = 3; //��
		private int input; // ������ �Է��� ��
		private int com; // ��ǻ�Ͱ� ����� ��
		
		Scanner scan = new Scanner(System.in);
		int rnd=0;
		int[] arr = new int[5];
		//int arr[5] = {1,2,3};
		
		/**
		 * �迭�� �������� �־��ش�.
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