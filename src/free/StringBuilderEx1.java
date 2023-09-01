package free;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;

import testmethod.inputstreamEx;

public class StringBuilderEx1 {
	
	public static void main(String[] args) {
		
		//String을 합치는 작업 시 하나의 대안이 StringBuilder
		StringBuilder ex = new StringBuilder();
		
		ex.append("client_id=가양");
		ex.append("&type=가가");
		
		test<String> a = new test<String>();
		a.setName("캬캬");
		System.out.println(a.getName());
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			String s = br.readLine();
			bw.append(s);
			bw.flush();
			bw.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}

class test<T> {
	private T name;

	public T getName() {
		return name;
	}

	public void setName(T name) {
		this.name = name;
	}
	

}
