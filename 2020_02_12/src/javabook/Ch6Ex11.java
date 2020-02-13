package javabook;

import java.text.MessageFormat;
import java.util.Date;

public class Ch6Ex11 {
	public static void main(String[] args) {
		String msg = "{0,date}�� {0,time}�� {1}���� {2}�� ������� �ߴ�";
		Object[] objs = {new Date(), "������", "��ȯ��� Ȯ����"};
		MessageFormat mf = new MessageFormat(msg);
		System.out.println(mf.format(objs));
		
		String from = "��ȯ��� Ȯ����";
		String to = "�谭��";
		final int CHAT_SEND = 1;
		String location = "HOME";
		
		String chatMsg = "{0}|{1}|{2}-{3}|{4}";
		System.out.println(MessageFormat.format(chatMsg, CHAT_SEND, new Date(), from, to, location ));
		
	}
}
