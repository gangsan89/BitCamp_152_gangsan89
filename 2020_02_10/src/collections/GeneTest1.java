package collections;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GeneTest1 {

	public static void main(String[] args) {
		List<String> ss= new ArrayList<String>();
		List<Date> ss3= new ArrayList<Date>();
		List ss2= new ArrayList();
		ss.add("232");
		ss.add("dsadas");
		ss2.add(232);
		ss2.add(new Date());
		ss2.add("232");
		ss2.add(new Test1());
		ss3.add(new Date());
		ss3.add(new Date(1989,06,30));
		ss3.add(new Date(1965,05,13));
		//개발자가 많은 컬렉션중에 리스트를 쓰는 이유는 포문으로 돌려서 무언가를 뽑아내서 사용하기 위해서다
		StringBuffer sb = new StringBuffer();
		for(int i=0; i < ss.size(); i++) {
			sb.append(ss.get(i));
		}
		System.out.println(sb);
		
		Date[] dates = new Date[10];
		Object obj;
		int dIndex=0;
		for(int i=0; i < ss2.size(); i++) {
			obj = ss2.get(i);
			
			if( obj instanceof Date ) {
				dates[dIndex++]=(Date)obj;
			}
		}System.out.println(dates[0]);
		
		for(int i=0; i<ss3.size(); i++) {
			dates[i]=ss3.get(i);
		}System.out.println(dates[0]);
		
		
	}

}
