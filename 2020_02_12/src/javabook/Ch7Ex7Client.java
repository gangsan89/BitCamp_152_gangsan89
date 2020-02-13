package javabook;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Ch7Ex7Client {
	public static void main(String[] args) {
		try {
			Socket s = new Socket("192.168.0.14", 8000 );
			System.out.println("## 클라이언트 실행 ##..");
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
			pw.println("클라이언트에서 전송해유");
			pw.close();
			s.close();
			System.out.println("종료할게요~ 뿅");
		}catch (Exception e ) {
			e.printStackTrace();
		}
	}
}
