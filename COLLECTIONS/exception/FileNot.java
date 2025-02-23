package exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileNot {
	public static void main(String[] args) throws IOException {
		File file = new File("C://Users//sarav//Desktop//sar.txt");	
		FileReader fr = new FileReader(file);
		int temp = 0;
		while((temp=fr.read())!=-1) {
			System.out.print((char)temp);
		}
	}

}
