package testmethod;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class jsontest {
		
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
	    List<HashMap<String , Object>> list = new ArrayList<HashMap<String,Object>>();
		HashMap<String, Object> hs = new HashMap<String, Object>();
		
		hs.put("이름", "안준상");
		hs.put("주빈번호", "123456-789787");
		hs.put("집주소","강남"); // Key , Value 값 담긴 오브젝트
		
		JSONObject jo1 = new JSONObject();  
		JSONArray jarr = new JSONArray();   
		JSONObject jofinal = new JSONObject();
		
		list.add(0,hs);
		
		for(int i=0; i<5; i++) {
			jarr.add(hs); // Key ,Value 담긴Array List 값  담기
			hs.put("d", "d");
			hs.put("주빈번호", "223456-789787");
			hs.put("집주소","압구정");
				
			list.add(i,hs);
		}
		
		jarr.add(hs);
		System.out.println("이럴경우는?"+list.get(1).get("집주소")); // List형태에 index 번호의 안에있는 hashmap Key 값
		List<Object> abc = new ArrayList<Object>();
		abc.add(hs);
		
		jofinal.put("member", jarr);
		String jsto = jofinal.toJSONString();
		System.out.println(jsto);
		
		System.out.println(jarr.get(0));
		System.out.println(jofinal.get("member"));
		
		Scanner sc = new Scanner(System.in);
		boolean a =true;
		while(a) {
		System.out.println("이름을 입력하세요");
		int name = sc.nextInt();
		System.out.println(jarr.get(name));
		}
	}

}
