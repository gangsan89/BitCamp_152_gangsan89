package collections;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Vector;

public class BoardListTest2 {

	public static void main(String[] args) {
		Vector<FreeBoard> boardList = new Vector<FreeBoard>();
		boardList.add( new FreeBoard (1, "제육볶음", "양푼이제육", "뚝배기", new GregorianCalendar() ) );
		boardList.add( new FreeBoard (2, "컴포즈커피", "아메리카노", "아이스", new GregorianCalendar(1999,2,22) ) );
		boardList.add( new FreeBoard (3, "제육볶음", "양푼이제육", "뚝배기", new GregorianCalendar() ) );
		boardList.add( new FreeBoard (4, "컴포즈커피", "아메리카노", "아이스", new GregorianCalendar(1999,2,22) ) );
		boardList.add( new FreeBoard (5, "제육볶음", "양푼이제육", "뚝배기", new GregorianCalendar() ) );
		boardList.add( new FreeBoard (6, "컴포즈커피", "아메리카노", "아이스", new GregorianCalendar(1999,2,22) ) );
		boardList.add( new FreeBoard (7, "제육볶음", "양푼이제육", "뚝배기", new GregorianCalendar() ) );
		boardList.add( new FreeBoard (8, "컴포즈커피", "아메리카노", "아이스", new GregorianCalendar(1999,2,22) ) );
		boardList.add( new FreeBoard (9, "제육볶음", "양푼이제육", "뚝배기", new GregorianCalendar() ) );
		boardList.add( new FreeBoard (10, "컴포즈커피", "아메리카노", "아이스", new GregorianCalendar(1999,2,22) ) );
		boardList.add( new FreeBoard (11, "제육볶음", "양푼이제육", "뚝배기", new GregorianCalendar() ) );
		boardList.add( new FreeBoard (12, "컴포즈커피", "아메리카노", "아이스", new GregorianCalendar(1999,2,22) ) );
		
		boardList.add( new FreeBoard (1, "제육볶음", "양푼이제육", "뚝배기", new GregorianCalendar() ) );
		boardList.add( new FreeBoard (2, "컴포즈커피", "아메리카노", "아이스", new GregorianCalendar(1999,2,22) ) );
		boardList.add( new FreeBoard (3, "제육볶음", "양푼이제육", "뚝배기", new GregorianCalendar() ) );
		boardList.add( new FreeBoard (4, "컴포즈커피", "아메리카노", "아이스", new GregorianCalendar(1999,2,22) ) );
		boardList.add( new FreeBoard (5, "제육볶음", "양푼이제육", "뚝배기", new GregorianCalendar() ) );
		boardList.add( new FreeBoard (6, "컴포즈커피", "아메리카노", "아이스", new GregorianCalendar(1999,2,22) ) );
		boardList.add( new FreeBoard (7, "제육볶음", "양푼이제육", "뚝배기", new GregorianCalendar() ) );
		boardList.add( new FreeBoard (8, "컴포즈커피", "아메리카노", "아이스", new GregorianCalendar(1999,2,22) ) );
		boardList.add( new FreeBoard (9, "제육볶음", "양푼이제육", "뚝배기", new GregorianCalendar() ) );
		boardList.add( new FreeBoard (10, "컴포즈커피", "아메리카노", "아이스", new GregorianCalendar(1999,2,22) ) );
		boardList.add( new FreeBoard (11, "제육볶음", "양푼이제육", "뚝배기", new GregorianCalendar() ) );
		boardList.add( new FreeBoard (12, "컴포즈커피", "아메리카노", "아이스", new GregorianCalendar(1999,2,22) ) );
		System.out.println( "capacity: "+boardList.capacity() );//최초 10개가 잡히고 그 후엔 두배씩 늘어난다.
		System.out.println( "size: "+boardList.size() );
		
		boardList.trimToSize();//케파를 사이즈만큼만 잡아주는거 
		System.out.println( "capacity: "+boardList.capacity() );
		System.out.println( "size: "+boardList.size() );
		
	}

}
