package testmethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Array {
	public static void main(String[] args) {
		String[] arr = {"1","23","345","4567","5789"};
		
		System.out.println(arr.toString());
		System.out.println(arr[0]);
		HashMap<String, Object> arr2 = new HashMap<String, Object>();
		
		for(String i : arr) {
			arr2.put(i+1, i);
		}
		
		System.out.println(arr2.toString());
		try {
			System.out.println(arr2.get("11"));
			
			String a = (String) arr2.get("231");
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
		System.out.println(item.get(0).equals(arr2.get("11")));
		if (arr2.containsKey("11")) {
			System.out.println("키가 잇네용");
			
		}else {
			System.out.println("키가옶네요");
		}
		
		
	
		
	}

}
