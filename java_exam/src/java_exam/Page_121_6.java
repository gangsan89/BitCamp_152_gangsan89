package java_exam;
/**
 * ��Ʈ�� POS�ý��ۿ��� �ǸŻ�ǰ�� ������ ���ڵ�� �о� �Ѿ��� ����ϴ� ���α׷��� �ۼ��϶�.
 * ��ǰ ������ Ű���� �Է����� (��ĳ��)���ڵ� ������ ��ü�ϵ��� �Ѵ�.
 * ��ǰ ���ݴ�� 'q'�� �Է��ϸ� ���ݱ��� �Է� �ݾ��� ���� ����ϰ� �����Ѵ�.
 * 
 * �ѱݾ� total
 * ��ǰ���� value
 * 'q'�� �Է��ϸ� ���� while
 * 
 */
import java.util.Scanner;

public class Page_121_6 {
		
	public static void main(String[] args) {
		int total=0;
		int value;
		/*
		 * Scanner scan = new Scanner(System.in); System.out.println("��ǰ ������ �Է����ּ���: ");
		 * String sc = scan.nextLine();
		 */
				
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("��ǰ ������ �Է����ּ���: ");
			String sc = scan.nextLine();
			if(sc.equals("q")) {
				System.out.println("�� �ݾ���: "+total);
				break;
			}else {
			value = Integer.parseInt(sc);
			total += value;
			}
		}
		
	}//main end
}//class end
