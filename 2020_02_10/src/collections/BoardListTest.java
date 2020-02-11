package collections;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class BoardListTest {

	public static void main(String[] args) {
		List<FreeBoard> boardList = new ArrayList<FreeBoard>();
		boardList.add( new FreeBoard (1, "제육볶음", "양푼이제육", "뚝배기", new GregorianCalendar() ) );
		boardList.add( new FreeBoard (2, "컴포즈커피", "아메리카노", "아이스", new GregorianCalendar(1999,2,22) ) );
		
		//내용을 보고싶다
		boardList.get(0).getContents();
		for( int i=0; i<boardList.size(); i++) {
			System.out.println(   boardList.get(i).getContents()  );
		}
		
		//작성년도, 제목 보고싶다.
		for( int i=0; i<boardList.size(); i++) {
			System.out.print( boardList.get(i).getDateCreate().get(Calendar.YEAR)+", " );
			System.out.println( boardList.get(i).getTitle() );
			
		}
		
		for( FreeBoard board : boardList) {
			System.out.print( board.getDateCreate().get(Calendar.YEAR)+", " );
			System.out.println( board.getTitle() );
		}
	}

}
