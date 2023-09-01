package testmethod;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BUfferedWriterAndStringBuilderEx {
	public static void main(String[] args) throws IOException {
		
		//StringBuilder  - Scanner 상위버전? 
		StringBuilder sb = new StringBuilder();
		
		// Stringbuilder에 있는 append를 활용하여 텍스트를 담는다
		/*
		 	*출력결과물*
		    Content-type:JSON&clinet_=자바스크립트or설정할개발방식의키&redirect_uri=api에서요청하는redirect
		 */
		
		sb.append("Content-type:JSON");
		sb.append("&clinet_=자바스크립트or설정할개발방식의키");
		sb.append("&redirect_uri=api에서요청하는redirect");
		
		
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String chars = "만약 문자가입력된다";
		

		

		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		
		
		
	}

}
