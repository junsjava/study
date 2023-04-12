package testmethod;


import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;




public class testbatch {
	public static void main(String[] args) {
		
		HashMap<String, Object> temp = new HashMap<String, Object>();
		
		String data = "{\"멤버\": [{\"안준상\":\"900109\", \"안준영\": \"940712\"}]}";
		
		
		try {
			JSONParser jsonparser = new JSONParser();
			JSONObject jsonObject = (JSONObject) jsonparser.parse(data);
			JSONArray jsonarray = (JSONArray) jsonObject.get("멤버");
			System.out.println("-----------------");
			
			for (int i=0; i<jsonarray.size(); i++) {
				JSONObject parseObject = (JSONObject) jsonarray.get(i);
				JSONObject member = (JSONObject) parseObject.get(i);
				System.out.println("주빈번호 : " +parseObject.get("안준상"));
			}
	
		
		
		} catch (ParseException e) {
			e.printStackTrace();
			e.getCause().toString();
		} 
		
		
		System.out.println(temp.get("M01"));
		
		int M01 = 1;
		int M11 = 2;
		int EA5 = 0;
		int EA6 = 0;
		boolean resultemp = true;
		
		int result = M01 * M11 * EA5 * EA6;
		try
		{
			if(result == 0) {
				System.out.println("값 전달");
				resultemp =false;
			}
			throw new Exception("고의적 에러발생시 ");
		}catch (Exception e) {
			resultemp =false;
					System.out.println("dd");
					System.out.println("\n");
					System.out.println(e.getMessage());
					e.printStackTrace();
					e.getCause().toString();
		}finally {
			
		if(resultemp) {
			
			System.out.println("if문이 실행안되도 넘어온다");
		}
		System.out.println("만약 RESULTTEMP가 FALSE 여도 아래구문실행 확인용");
		}if(resultemp) {
			System.out.println();
			
		}
	}
}
