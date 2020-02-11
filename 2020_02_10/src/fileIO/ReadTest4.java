package fileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadTest4 {
	public static void main(String[] args) throws IOException {
		// D:\java_data\1234.txt �ѱ۱��� ����
		String pathname = "D:/java_data/1234.txt";
		File txtFile = new File(pathname);

		if (txtFile.exists()) {
			System.out.println("��������");

			if (txtFile.isFile()) {
				System.out.println("�����̱�");
				// FileReader fileReader=null;
				// FileInputStream
				BufferedReader reader = null;
				try {
					// fileReader = new FileReader(txtFile);

					reader = new BufferedReader(
							new InputStreamReader(new FileInputStream(txtFile), "UTF-8"));

					String dataStr = null;
					while ((dataStr = reader.readLine()) != null) {
						System.out.print(dataStr);
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} finally {
					if (reader != null) {
						reader.close();
					}
				}
			} else {
				System.out.println("������");
			}
		} else {
			System.out.println("��������X");
		}
	}
}
