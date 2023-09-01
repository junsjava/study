package free;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class freeNote {
	
	public static void main(String[] args) {
		String a ="FirstItem, ";
		String b ="TwoItem, ";
		String c ="LastItem.";
		
		Text tb = new Text();
		
		System.out.println(tb.toString());
		
		HashMap<String, Object> item = new HashMap<String, Object>();
		
		item.put("one", a);
		item.put("two", b);
		item.put("three", c);
		
		tb.set("아", item);
		
		System.out.println(tb.toString());
		
		System.out.println(tb.getString("아"));
	}
}


class Text{
	
	private List<HashMap<String, Object>> tbl = new ArrayList<HashMap<String,Object>>();

	public List<HashMap<String, Object>> getTbl() {
		return tbl;
	}

	public void setTbl(List<HashMap<String, Object>> tbl) {
		this.tbl = tbl;
	}
	
	public void set (int index, String key, Object value) {
		HashMap<String, Object> row = null;
		if(index < tbl.size() && tbl.get(index) != null) {
			row = tbl.get(index);
			System.out.println(row);
		}else {
			row = new HashMap<String, Object>();
			tbl.add(index, row);
		}
		row.put(key, value);
		
		
	}
	
	public Object get(int index, String key) {
		HashMap<String, Object> row = null;
		
		if (tbl.get(index) != null) {
			row = tbl.get(index);
			
			if (row.get(key) != null) {
				return row.get(key);
			} else {
				return null;
			}
		} else {
			return "";
		}
	}
	
	public Object get(String key) {
		return get(0, key);
	}
	
	public String getString(int index, String key) {
		if (get(0,key) != null) {
			return get(index, key).toString();
		} else {
			return null;
		}
	}
	
	//get 의 결과를 99%이상 String 으로 받기 때문에  getString 만 구현.. 
	public String getString(String key) {
		if (get(0,key) != null) {
			return get(0, key).toString();
		} else {
			return null;
		}
	}	
	
	public void set (String key, Object value) {
		
	}
	



	
}

