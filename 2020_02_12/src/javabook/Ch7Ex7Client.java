package javabook;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Ch7Ex7Client {
	public static void main(String[] args) {
		try {
			Socket s = new Socket("192.168.0.14", 8000 );
			System.out.println("## Ŭ���̾�Ʈ ���� ##..");
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
			pw.println("Ŭ���̾�Ʈ���� ��������");
			pw.close();
			s.close();
			System.out.println("�����ҰԿ�~ ��");
		}catch (Exception e ) {
			e.printStackTrace();
		}
	}
}
