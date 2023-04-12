package testmethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ArrayandList {

	public static void main(String[] args) {
		
		/**
		 * ArrayList 안에 String(Key), String(value) 쌍인 HashMap을 집어 넣을수있다
		 */
	ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String,String>>();
	
	/**
	 * 
	 */
	HashMap<String, String> item = new HashMap<String, String>();
	item.put("이름", "안준상");
	item.put("나이", "20");
	item.put("성별", "남");
	
	
	
	HashMap<String, String> item2 = new HashMap<String, String>();

	 

	item2.put("이름", "이아영");

	item2.put("나이", "28");

	item2.put("직업","디자이너");
	
	list.add(item);
	list.add(item2);
	
	HashMap<String,String> take = (HashMap<String,String>)list.get(0);
	
	System.out.println(take.get("나이"));
	
	List<HashMap<String, String>> list2 = new ArrayList<HashMap<String,String>>(); 
	
	list2.add(item);
	list2.add(item2);
	
	HashMap<String,String> takeitem = list2.get(0);
	
	System.out.println(takeitem.get("이름"));
	System.out.println(takeitem);
	}
}
