package free;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FreeNote2 {
	public static void main(String[] args) {
		
		String pa1 ="강동";
		int pa2 =1;
		
		
		List<HashMap<String, Object>> all = new ArrayList<HashMap<String,Object>>();
		HashMap<String, Object> i = new HashMap<String, Object>();
		
		i.put("name", "강동");
		i.put("age","1");
		
		System.out.println(i.toString());
		
		
		try {
			if("강동".equals(pa1)) {
				System.out.println("이분의 이름은 ? : "+ i.get("name"));
				System.out.println("이분의 나이는 ?" + i.get("age"));
				/**
				 * 로직실행 ..
				 */
				
			} else {
				System.out.println("존재하지 않는 이름입니다.");
				/**
				 * 미존재시의 또다른 로직 실행..
				 * 
				 */
				if(pa2 == 1) {
					/**
					 * 학사연동 테이블 관련해서 뭔가 로직 수행 .
					 *
					 */
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
