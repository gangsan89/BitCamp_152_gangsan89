package ä�ø����;

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
			System.out.println("������ �����մϴ�");
			while(true) {
				
				Socket s = sc.accept();
				br = new BufferedReader(
							new InputStreamReader(s.getInputStream()));
				pw = new PrintWriter(
						new OutputStreamWriter(s.getOutputStream()));
				System.out.println("Ŭ���̾�Ʈ �����");
				System.out.println("Ŭ���̾�Ʈ: " + br.readLine());
				pw.println("�������� ��������");
				pw.close();
				
				
			}
			
			}catch (Exception e) {
				e.printStackTrace();
			}
	}
}
