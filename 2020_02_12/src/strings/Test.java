package strings;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		String s1 = new String();
		System.out.println( s1.contains("������") );
		s1.startsWith("����");
		
		List<String> list = new ArrayList<String>();
		list.add("����� ������ ����� 223");
		list.add("����� ������ �ڰ  56-119");
		list.add("���ֽ� ���걸 ÷���߾ӷ� 68���� 131");
		list.add("���ֽ� ���걸 ����� 883-2 ");
		list.add("����� ���걸 ����� 223");
		
		for( int i=0; i<list.size(); i++) {
			if(list.get(i).contains("�����")) {
				System.out.println((i+1)+"��°"+list.get(i));
			}
		}
		System.out.println("/////////////////");
		for( int i=0; i<list.size(); i++) {
			if(list.get(i).startsWith("�����")) {
				System.out.println((i+1)+"��°"+list.get(i));
			}
		}
		System.out.println("//////////////");
		for( int i=0; i<list.size(); i++) {
			if(list.get(i).endsWith("3")) {
				System.out.println((i+1)+"��°"+list.get(i));
			}
		}
		
		System.out.println("////////////////");
		String str2="kim,lee,jang";
		String[] splitStr = str2.split(",");
		for(String s : splitStr ) {
			System.out.println(s);
		}
		
				
		System.out.println("////////////////");
		String str3="     kim";
		String str4= "kim";
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
		System.out.println(str3.trim().equals(str4));


		
		
		
		
		
		
		
		
		
		
	}
}
