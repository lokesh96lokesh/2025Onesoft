package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NotFound {
	public static void main(String[] args) {
		File file = new File("C://Users//sarav//Desktop//sr.txt");
		
		try {
			FileReader f = new FileReader(file);
			int temp = 0;
			while((temp=f.read()) != -1) {
				System.out.println((char)temp);
			}
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
		catch(IOException a) {
			System.out.println(a);
		}
	}
}