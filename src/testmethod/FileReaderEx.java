package testmethod;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
	
	public static void main(String[] args) {
		File fl = new File("d:/aa/test.txt");
		
		try {
			
			if(!fl.exists()) {
				System.out.println("파일 미존재");
				return;
			}
			@SuppressWarnings("resource")
			FileReader fr = new FileReader(fl);
			
			while(true) {
				int code = fr.read();
				
				if(code==-1) break;
				
				char ch =(char) code;
				
				System.out.println((char)code);
				System.out.println(ch);
			}
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
