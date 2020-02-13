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
import java.io.PrintStream;
import java.io.Writer;

public class ReadTest7 {
	public static void main(String[] args) throws IOException {
		String pathname = "D:/java_data/1234.txt";
		String pathname2 = "D:/java_out/456.txt";
		
		File txtFile = new File(pathname);
		
		BufferedReader reader = new BufferedReader( 
				new InputStreamReader( new FileInputStream(txtFile), "UTF-8") );
		PrintStream out = new PrintStream(pathname2);
		
		String str;
		while ( (str=reader.readLine() ) !=null ) {
			out.println(str);
		}
	}//main end
}//class end
