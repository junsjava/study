package testmethod;

import java.io.IOException;
import java.io.InputStream;

public class inputstreamEx {
	
	public static void main(String[] args) {
		int data = 0;
		
		System.out.println("문자입력 >>");
		
		try {
			
			InputStream in = System.in;//프로그램 , http,등등 다양한 입력체계넘어오는걸 설정
			while((data=in.read())!=-1) {
				System.out.write((char)data);
			}
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
