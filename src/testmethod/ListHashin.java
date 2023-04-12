package testmethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



public class ListHashin {
	public static void main(String[] args) {
		HashMap<String,Object> hash = new HashMap<String, Object>();
		
		String a = new String();
		
		a = "ky";
		
		hash.put("s", a);
		
		List<HashMap<String, Object>> arry = new ArrayList<HashMap<String,Object>>();
		arry.add(hash);
		
		System.out.println(arry.get(0).get("s").toString());
		System.out.println(arry.get(0));
		
		
		List<HashMap<String, Object>> vo = new ArrayList<HashMap<String,Object>>();
		
		
		HashMap<String,Object> test = new HashMap<String, Object>();
		
		test =arry.get(0);
		
		System.out.println(test);
		vo.add(0,test);
		
		System.out.println(vo);
		
		
		
	}

}
