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
			System.out.println("������ �����մϴ�");
			while (true) {
				Socket s = sc.accept();
				BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
				System.out.println("Ŭ���̾�Ʈ �����");
				System.out.println("Ŭ���̾�Ʈ �޽���: " + br.readLine());
				
				br.close();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
