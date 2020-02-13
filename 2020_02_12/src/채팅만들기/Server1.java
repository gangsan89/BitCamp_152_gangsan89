package 채팅만들기;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server1 {
	public static void main(String[] args) {
		ServerSocket sc;
		BufferedReader br;
		PrintWriter pw;
		Scanner scan = new Scanner(System.in);
		
		try {
			sc = new ServerSocket(1000);
			System.out.println("서버를 실행합니다");
			while(true) {
				
				Socket s = sc.accept();
				br = new BufferedReader(
							new InputStreamReader(s.getInputStream()));
				pw = new PrintWriter(
						new OutputStreamWriter(s.getOutputStream()));
				System.out.println("클라이언트 연결됨");
				System.out.println("클라이언트: " + br.readLine());
				pw.println("서버에서 전송해유");
				pw.close();
				
				
			}
			
			}catch (Exception e) {
				e.printStackTrace();
			}
	}
}
