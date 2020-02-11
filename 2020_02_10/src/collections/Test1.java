package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {
		String a="kim gangsan";
		String b="kim malja";
		String c = "bab malja";
		
		String[] strs = {"kim gangsan", "kim malja", "bab malja"};
		String[] ss= {a,b,c};
		String[] xx= new String[3];
		
		xx[0]= "kim gangsan";
		xx[1]= "kim malja";
		xx[2]= "bab malja";
		xx[0]= a;
		xx[1]= b;
		xx[2]= c;
		System.out.println("removeAfters.clone() 전의 "+strs.length);
		//strs[1] =""; //을 1번방을 제거해서 배열의 길이를 맞추려면
		String[] removeAfters = new String[strs.length -1];
		removeAfters[0] = strs[0];
		removeAfters[1] = strs[2];
		strs=null;
		strs=removeAfters.clone();
		System.out.println("removeAfters.clone() 후의 "+strs.length);
		
		//List<Date> strings = new ArrayList<Date>();
		List<String> strings = new ArrayList<String>(); 
		
		List<String> strings2 = new ArrayList<String>(); 
		
		strings2.addAll(Arrays.asList(strs) );//배열을 어레이리스트에 넣는방법 1
		
		for (String x : strs) {//배열을 어레이리스트에 넣는방법 2
			strings2.add(x);
		}
		
		
		strings.add("kim gangsan");
		strings.add("kim malja");
		strings.add("bab malja");
		strings.add("sung gangsan");
		strings.add("lee gangsan");
		strings.add("baam gangsan");
		
		System.out.println(strings.size() ); // 렝스는 스트링클래스, 배열에 나온다
		
		for( String str : strings ) {
			System.out.println(str);
		}
		System.out.println("//////////");
		for( int i=0; i < strings.size(); i++) {
			System.out.println(strings.get(i)); //대체로 add나 겟을 쓰지만 아닌게 있으니 알고있어라
		}
		strings.remove(2); //하나를 지우고 덮어씌워라
		System.out.println(strings.size() );
		for( String str : strings ) {
			System.out.println(str);
		}
		
		
	}
}
