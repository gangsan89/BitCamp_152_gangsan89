package fileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class ReadTest6 {
	public static void main(String[] args) throws IOException {
		// D:\java_data\1234.txt �ѱ۱��� ����
		String pathname = "D:/java_data/1234.txt";
		File txtFile = new File(pathname);
		String path = "C:/Users/bitcamp/git/test1/2020_02_10/upload/1234.txt";
		File file = new File (path);
		
		if (txtFile.exists()) {
			System.out.println("�����ϳ���");
			if (txtFile.isFile()) {
				System.out.println("�����̷δ�");
				
				BufferedReader reader = null;
				BufferedWriter writer = null;
				try {
					reader = new BufferedReader(
							new InputStreamReader(new FileInputStream(txtFile), "UTF-8") );
					writer = new BufferedWriter(
							new OutputStreamWriter(new FileOutputStream(file), "UTF-8")	);
					
					String dataStr = null;
					while ((dataStr = reader.readLine()) != null) {
						System.out.print(dataStr);
						writer.write(dataStr+"\n���ε� �������� �� ����������\t");
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} finally {
					if (reader != null) {
						reader.close();
					}writer.close();
				}
			} else {
				System.out.println("�����̴϶�");
			}//26���� if end
		} else {
			System.out.println("���� ���� �ƴ��ϴ�");
		}//24���� if end
	}//main end
}//class end
