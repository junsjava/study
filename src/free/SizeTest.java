package free;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SizeTest {
	public static void main(String[] args) {
		List<HashMap<String, Object>> tbl = new ArrayList<HashMap<String,Object>>();
		String a  = null;
		HashMap<String, Object> s = new HashMap<String, Object>();
		
		
		
		for(int q = 0; q<100; q++) {
			a =  Integer.toString(q);
			s.put("a"+q, a);
		}
		tbl.add(0, s);
		
		for(int x = 0; x < tbl.size(); x =+ 95) {
			List<HashMap<String, Object>> tmpList = new ArrayList<HashMap<String,Object>>();
			for(int j = x; j < x + 95 ; j++) {
				if( j< tbl.size()) {
					System.out.println(x);
					tmpList.add(tbl.get(j));
					System.out.println(j);
				}
			}
		}
	}

}
