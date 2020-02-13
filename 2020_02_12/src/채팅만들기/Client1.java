package 채팅만들기;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Client1 {
	public static void main(String[] args) {
		Socket s;
		BufferedReader br;
		PrintWriter pw;
		try {
			s = new Socket("192.168.0.14", 8000);
			System.out.println("## 클라이언트 실행 ##..");

			while (true) {
				br = new BufferedReader(
						new InputStreamReader(s.getInputStream()));
				pw = new PrintWriter(
						new OutputStreamWriter(s.getOutputStream()));
				pw.println("클라이언트에서 전송해유");
				System.out.println("서버: " + br.readLine());
				pw.close();
				s.close();
			}
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("종료할게요~ 뿅");
	}
}
