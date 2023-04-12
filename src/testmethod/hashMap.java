package testmethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class hashMap {

	public static void main(String[] args) {
		System.out.println("일단출력");
		int a =1;
		int b =2;
		
		HashMap<String, String> exsample = new HashMap<String, String>();
		
		exsample.put("3", "세번째아이템"); //아이템담기 Key, Value
		exsample.put("1", "1");
		exsample.put("2", "두번째아이템");
		
		System.out.println(exsample.get("1")); //key로 아이템 꺼내기
		System.out.println(exsample.get("2"));
		System.out.println(exsample);
		System.out.println("hashcode" + exsample.hashCode()); // 주소를 확인하는..
		
		exsample.putIfAbsent("4", "1"); //Key가 존재하지않을경우 key ,value값 삽입.
		
		System.out.println(exsample);
		
		System.out.println("엔트리" + exsample.entrySet());
		
		
		
		System.out.println(exsample.containsKey("3")); //키가 존재하는지 true or false : false
		
		System.out.println(exsample.containsValue("세번째아이템")); // value 값 존재 유무
		
		System.out.println(exsample.get("3")); //Key값의 Value값 가져옴
		
		System.out.println(exsample.isEmpty()); //비어있나 ?
		System.out.println(exsample.replace("3", "변경된값"));
		
		 exsample.clear(); //아이템 비울때 주석처리
		 System.out.println("비운뒤 "+exsample);   
		 System.out.println(exsample.isEmpty()); //비어있나 ?
		
		 System.out.println(exsample.containsValue("세번째아이템")); // value 값 존재 유무
		 System.out.println(exsample.containsKey("3")); // 비운뒤 없어서 false 
		 
		 
		 System.out.println(exsample.keySet());
			
	}
}
