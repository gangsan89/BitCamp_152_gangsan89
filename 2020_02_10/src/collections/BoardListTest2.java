package collections;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Vector;

public class BoardListTest2 {

	public static void main(String[] args) {
		Vector<FreeBoard> boardList = new Vector<FreeBoard>();
		boardList.add( new FreeBoard (1, "��������", "��Ǭ������", "�ҹ��", new GregorianCalendar() ) );
		boardList.add( new FreeBoard (2, "������Ŀ��", "�Ƹ޸�ī��", "���̽�", new GregorianCalendar(1999,2,22) ) );
		boardList.add( new FreeBoard (3, "��������", "��Ǭ������", "�ҹ��", new GregorianCalendar() ) );
		boardList.add( new FreeBoard (4, "������Ŀ��", "�Ƹ޸�ī��", "���̽�", new GregorianCalendar(1999,2,22) ) );
		boardList.add( new FreeBoard (5, "��������", "��Ǭ������", "�ҹ��", new GregorianCalendar() ) );
		boardList.add( new FreeBoard (6, "������Ŀ��", "�Ƹ޸�ī��", "���̽�", new GregorianCalendar(1999,2,22) ) );
		boardList.add( new FreeBoard (7, "��������", "��Ǭ������", "�ҹ��", new GregorianCalendar() ) );
		boardList.add( new FreeBoard (8, "������Ŀ��", "�Ƹ޸�ī��", "���̽�", new GregorianCalendar(1999,2,22) ) );
		boardList.add( new FreeBoard (9, "��������", "��Ǭ������", "�ҹ��", new GregorianCalendar() ) );
		boardList.add( new FreeBoard (10, "������Ŀ��", "�Ƹ޸�ī��", "���̽�", new GregorianCalendar(1999,2,22) ) );
		boardList.add( new FreeBoard (11, "��������", "��Ǭ������", "�ҹ��", new GregorianCalendar() ) );
		boardList.add( new FreeBoard (12, "������Ŀ��", "�Ƹ޸�ī��", "���̽�", new GregorianCalendar(1999,2,22) ) );
		
		boardList.add( new FreeBoard (1, "��������", "��Ǭ������", "�ҹ��", new GregorianCalendar() ) );
		boardList.add( new FreeBoard (2, "������Ŀ��", "�Ƹ޸�ī��", "���̽�", new GregorianCalendar(1999,2,22) ) );
		boardList.add( new FreeBoard (3, "��������", "��Ǭ������", "�ҹ��", new GregorianCalendar() ) );
		boardList.add( new FreeBoard (4, "������Ŀ��", "�Ƹ޸�ī��", "���̽�", new GregorianCalendar(1999,2,22) ) );
		boardList.add( new FreeBoard (5, "��������", "��Ǭ������", "�ҹ��", new GregorianCalendar() ) );
		boardList.add( new FreeBoard (6, "������Ŀ��", "�Ƹ޸�ī��", "���̽�", new GregorianCalendar(1999,2,22) ) );
		boardList.add( new FreeBoard (7, "��������", "��Ǭ������", "�ҹ��", new GregorianCalendar() ) );
		boardList.add( new FreeBoard (8, "������Ŀ��", "�Ƹ޸�ī��", "���̽�", new GregorianCalendar(1999,2,22) ) );
		boardList.add( new FreeBoard (9, "��������", "��Ǭ������", "�ҹ��", new GregorianCalendar() ) );
		boardList.add( new FreeBoard (10, "������Ŀ��", "�Ƹ޸�ī��", "���̽�", new GregorianCalendar(1999,2,22) ) );
		boardList.add( new FreeBoard (11, "��������", "��Ǭ������", "�ҹ��", new GregorianCalendar() ) );
		boardList.add( new FreeBoard (12, "������Ŀ��", "�Ƹ޸�ī��", "���̽�", new GregorianCalendar(1999,2,22) ) );
		System.out.println( "capacity: "+boardList.capacity() );//���� 10���� ������ �� �Ŀ� �ι辿 �þ��.
		System.out.println( "size: "+boardList.size() );
		
		boardList.trimToSize();//���ĸ� �����ŭ�� ����ִ°� 
		System.out.println( "capacity: "+boardList.capacity() );
		System.out.println( "size: "+boardList.size() );
		
	}

}
