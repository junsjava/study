package testmethod;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BufferedRead {

	public static void main(String[] args) {
		
		try {
		// BufferedReader를 사용하기 위해서는 throws IOException을 해 주어야 함.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		String s = br.readLine();
		int num =Integer.parseInt(br.readLine());
		System.out.println(num);
		br.close();
		}
		catch(IOException e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
