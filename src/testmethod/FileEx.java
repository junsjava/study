package testmethod;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileEx {
	public static void main(String[] args) {
		
		//파일 경로생성
		File file = new File("d:/aa/test.txt");
		
		File ft = new File("d:/aa/test2.txt");
		StringBuilder sb = new StringBuilder();
		sb.append("첫번째내용입니다\n");
		sb.append("두번째내용이니다");
		
		
		try {
			FileWriter fw = new FileWriter(file);
			fw.write("안녕하세요");
			fw.flush();
			fw.close();
			FileWriter fts = new FileWriter(ft);
			fts.write(sb.toString());
			fts.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
