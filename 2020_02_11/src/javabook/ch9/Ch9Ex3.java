package javabook.ch9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Ch9Ex3 {
	//��ǰ DB�� �����ϴ� HashMap
	HashMap<String, ArrayList<String>> productdb;
	
	//������
	public Ch9Ex3() {
		productdb = new HashMap<String, ArrayList<String>>();
		
		//�����纰 ��ǰ ���
		ArrayList<String> plist1 = new ArrayList<String>();
		ArrayList<String> plist2 = new ArrayList<String>();
		ArrayList<String> plist3 = new ArrayList<String>();
		
		plist1.addAll(Arrays.asList("����ƮTV", "������S7", "��Ʈ20.1"));
		productdb.put("�Ｚ", plist1);
		plist2.addAll(Arrays.asList("Ŀ���TV", "��Ƽ����G10", "�ÿ�������2"));
		productdb.put("����", plist2);
		plist3.addAll(Arrays.asList("����TV", "������7S", "�����е�����"));
		productdb.put("����", plist3);
		
	}
	
	void search() {
		System.out.println("## ��ǰ �˻� ##");
		System.out.print("# �����縦 �Է��ϼ���: ");
		Scanner scan = new Scanner(System.in);
		
		String p = scan.next();
		
		//�Էµ� �������� ��ǰ ����� �˻�
		ArrayList<String> result = (ArrayList<String>)productdb.get(p);
		if(result != null) {
//			for(String s : result) {
//				System.out.println(s);
//			}
			for(int i =0; i<result.size(); i++) {
				if(result.contains("������7S")) {
				System.out.println(result.get(i));
				}
			}
		}
		else {
			System.out.println("�˻������ �����ϴ� !");
		}scan.close();
	}
	public static void main(String[] args) {
		Ch9Ex3 app = new Ch9Ex3();
		app.search();
	}
}
