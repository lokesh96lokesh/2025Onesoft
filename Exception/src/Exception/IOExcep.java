package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOExcep {
	public static void main(String[] args)throws IOException {
		File file = new File("C:\\Users\\lokes\\Desktop\\t.txt");
		
		try {
			FileReader f = new FileReader(file);
			int temp = 0;
			while((temp=f.read()) != -1) {
				System.out.print((char)temp);
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
