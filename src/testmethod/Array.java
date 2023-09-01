package testmethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class Array {
	public static void main(String[] args) {
		//배열 생성 arr 에 값담음 { .. .. .. }
		String[] arr = {"1","23","345","4567","5789"};
		int num =0;


		
		//값들 String 값으로 출력
		System.out.println(arr.toString());
		//배열 0번째인 값 출력 1이출력됌
		System.out.println(arr[0]);
		
		HashMap<String, Object> arr2 = new HashMap<String, Object>();
		
		//arr 에 담긴값  i에 대입  arr2에 key value값으로 담기
		for(String i : arr) {
			num += 1;
			arr2.put("item"+ num, i);
		}
		
		System.out.println(arr2.toString());
		try {
			System.out.println(arr2.get("item2"));
			
			String a = (String) arr2.get("item2");
			System.out.println(a.length());
		} catch (Exception e) {
			if(e.toString() == "java.lang.NullPointerException") {
				
				System.out.println(e + " =에러 발생" );
			}else {
				System.out.println("타에러발생");
			}
		}
		List<Object> item = new ArrayList<Object>();
		item.add(arr2);
		System.out.println(item);
		System.out.println(item.get(0).equals(arr2.get("item2")));
		if (arr2.containsKey("item2")) {
			System.out.println("키가 잇네용");
			
		}else {
			System.out.println("키가옶네요");
		}
		

		
		
	
		
	}

}
