package ä�ø����;

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
			System.out.println("## Ŭ���̾�Ʈ ���� ##..");

			while (true) {
				br = new BufferedReader(
						new InputStreamReader(s.getInputStream()));
				pw = new PrintWriter(
						new OutputStreamWriter(s.getOutputStream()));
				pw.println("Ŭ���̾�Ʈ���� ��������");
				System.out.println("����: " + br.readLine());
				pw.close();
				s.close();
			}
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("�����ҰԿ�~ ��");
	}
}
