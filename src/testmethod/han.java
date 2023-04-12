package testmethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class han {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("첫번째테스트");
		
		String a = new String("a");
		
		System.out.println(a);
		
		HashMap<String, Object> aa = new HashMap<String, Object>();
		aa.put("d", "하이");
		System.out.println(aa);
		System.out.println(aa.get("d"));
		//aa.put("f","바이");
		
		List<HashMap<String, Object>> as = new ArrayList<HashMap<String,Object>>();
		as.add(aa);
		System.out.println(as);
		
		Map<String, Object> ad = new HashMap<String, Object>();
		ad.put("bb", "다시만나욧");
		ad.put("cc", "다시만나욧");
		ad.put("dd", "다시만나욧");
		
		System.out.println(ad);

		String[] ch = new String[2];
		
		String[] ct = new String[3];
		
		ch[0] ="a";
		ch[1] ="b";
		
		ct[0] ="a";
		ct[1] ="b";
		ct[2] ="c";
		System.out.println(ch);
		
		System.out.println(ct.toString());
		
		System.out.println(ct[0]);
		int s =10;
		
		System.out.println(s);

	}
}
