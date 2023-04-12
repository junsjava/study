package testmethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class valueobjectdebug {

	public static void main(String[] args) {
		HashMap<String, Object> h = new HashMap<String, Object>();
		ValueObject req = new ValueObject();
				
		h.put("여긴", "이비");
		h.put("여기다", "이비");
		h.put("여기다", "이비");
		
		List<Object> item = new ArrayList<Object>();
		item.add(h);
		
		List rList = item;
	
		req.set("a", "a");
		System.out.println(req.get("a"));
		
		req.setTable(rList);
		
		System.out.println(req.getString("여긴"));
		
		
		
	}
}
