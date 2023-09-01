package free;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public interface ListEx {

	public static void main(String[] args) {
		List<Object> l = new ArrayList<Object>();
		
		List<HashMap<String, Object>> q = new ArrayList<HashMap<String,Object>>();
		HashMap<String, Object> c= new HashMap<String, Object>();
		
		
		
		String a = "함수한개";
		String b = "함수두개";

		c.put("a", a);
		c.put("b", b);
		
		l.add(0,a);
		l.add(0,b);
		
		q.add(0,c);
		
		
		
		
		
		
		System.out.println(l.toString());
		System.out.println(q.toString());
		System.out.println(q.get(0));
		
		
	}
}
