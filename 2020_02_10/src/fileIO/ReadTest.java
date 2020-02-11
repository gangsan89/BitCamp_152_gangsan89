package fileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTest {
	public static void main(String[] args) throws IOException {
		//D:\java_data\1234.txt
		String pathname = "D:/java_data/1234.txt";
		File txtFile = new File(pathname);
		if( txtFile.exists() ) {
			System.out.println("존재하나니");
			if ( txtFile.isFile() ) {
				System.out.println("파일이로다");
				FileReader fileReader = null;
				try {
					fileReader = new FileReader(txtFile);
					int data = fileReader.read();
					while(data!= -1) {
						System.out.print((char)data);
						data=fileReader.read();
					}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					if(fileReader!=null) {
						fileReader.close();
					}
				}
			}else {
				System.out.println("폴더이니라");
			}
		}else {
			System.out.println("존재 하지 아니하다");
		}
	}
}
