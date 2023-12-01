package free;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class batchtest {

	public static void main(String[] args) {
		
		/*
		 * 
		 * 배치 프로그램 임의 로직
		 */
		
		/**
		 * Amout 담는 테이블
		 */
		List<HashMap<String, Object>> amount = new ArrayList<HashMap<String,Object>>();
		
		HashMap<String, Object> amount_temp = new HashMap<String, Object>();
		
		amount_temp.put("orgflagcd", "M01");
		amount_temp.put("usernm", "홍길동");
		amount_temp.put("amount", "1000");
		amount.add(0,amount_temp);
		String[] orgflagcd = {"M01", "M11"};
		
		for(int i=0; i< orgflagcd.length; i++) {
			if("M01".equals(orgflagcd[i])) {
				System.out.println(i+ ""+amount.get(i));
			}else if("M11".equals(orgflagcd[i])){
				System.out.println(amount.get(i));
			}
		}
		
		
		
	}
}
