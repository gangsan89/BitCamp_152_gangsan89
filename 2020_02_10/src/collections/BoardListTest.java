package collections;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class BoardListTest {

	public static void main(String[] args) {
		List<FreeBoard> boardList = new ArrayList<FreeBoard>();
		boardList.add( new FreeBoard (1, "��������", "��Ǭ������", "�ҹ��", new GregorianCalendar() ) );
		boardList.add( new FreeBoard (2, "������Ŀ��", "�Ƹ޸�ī��", "���̽�", new GregorianCalendar(1999,2,22) ) );
		
		//������ ����ʹ�
		boardList.get(0).getContents();
		for( int i=0; i<boardList.size(); i++) {
			System.out.println(   boardList.get(i).getContents()  );
		}
		
		//�ۼ��⵵, ���� ����ʹ�.
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
