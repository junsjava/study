package free;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BeyulList {
	public static void main(String[] args) {
		List<HashMap<String, Object>> tbl = new ArrayList<HashMap<String,Object>>();
		HashMap<String, Object> s= new HashMap<String, Object>();
		String itemValue = "아이템이들어있다";
		String itemname = "아이템2";
		s.put("item", itemValue);
		s.put("item2", itemname);
		
		HashMap<String, Object> slist = new HashMap<String, Object>();
		
		slist.put("group", s);
		
		System.out.println(slist);
		itemValue = null;
		itemname = null;
		
		itemValue ="새로운아이템";
		itemname = "새로운아이템2";
		
		s.put("item3", itemValue);
		s.put("item4", itemname);
		
		slist.put("group2",s);
		
		tbl.add(0,slist);
		tbl.add(0,s);
		
		System.out.println(tbl);
		
		System.out.println(tbl.size());
	}

}
