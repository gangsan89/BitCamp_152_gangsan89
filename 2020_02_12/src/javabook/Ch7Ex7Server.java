package javabook;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;

public class Ch7Ex7Server {
	public static void main(String[] args) {
		try {
			ServerSocket sc = new ServerSocket(9000);
			System.out.println("서버를 실행합니다");
			while (true) {
				Socket s = sc.accept();
				BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
				System.out.println("클라이언트 연결됨");
				System.out.println("클라이언트 메시지: " + br.readLine());
				
				br.close();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
