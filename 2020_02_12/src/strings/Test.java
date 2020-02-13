package strings;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		String s1 = new String();
		System.out.println( s1.contains("강남구") );
		s1.startsWith("서울");
		
		List<String> list = new ArrayList<String>();
		list.add("서울시 강남구 밤고개로 223");
		list.add("서울시 강남구 자곡동  56-119");
		list.add("광주시 광산구 첨단중앙로 68번길 131");
		list.add("광주시 광산구 산월동 883-2 ");
		list.add("서울시 광산구 밤고개로 223");
		
		for( int i=0; i<list.size(); i++) {
			if(list.get(i).contains("산월동")) {
				System.out.println((i+1)+"번째"+list.get(i));
			}
		}
		System.out.println("/////////////////");
		for( int i=0; i<list.size(); i++) {
			if(list.get(i).startsWith("서울시")) {
				System.out.println((i+1)+"번째"+list.get(i));
			}
		}
		System.out.println("//////////////");
		for( int i=0; i<list.size(); i++) {
			if(list.get(i).endsWith("3")) {
				System.out.println((i+1)+"번째"+list.get(i));
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
