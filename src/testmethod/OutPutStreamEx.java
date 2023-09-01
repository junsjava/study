package testmethod;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class OutPutStreamEx {
	
	public static void main(String[] args) {
		
		int data = 0;
		InputStream in = System.in;
		OutputStream ou = System.out;
		
		System.out.println("내용입력 :");
		
		try {
			
			while((data = in.read()) !=-1) {
				if(data =='x' || data== 'X') {
					System.out.println("입력종료");
					ou.close();
					break;					
				}
				ou.write(data);
			}
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
