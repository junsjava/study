package testmethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class fortest2 {
	public static void main(String[] args) {
		
		HashMap<String,String> items = new HashMap<String, String>();
		int itemx = 120;
		int jk = 0;
		for(int i=0; i>itemx ; i++) {
			items.put("아이템"+i, "item"+ i);
			jk = i;
		}
		System.out.println(items.get("아이템"+jk));
		
		String a = "아"+1;
		System.out.println(a);
		int item =120;
		int plus =0;
		
		
		for (int x = 0; x < item; x += 100) {
			List<HashMap<String, Object>> tmpList = new ArrayList<HashMap<String, Object>>();
			for (int j = x; j < x + 100; j++) {
				if (j < item) {
					plus += j;
					System.out.println(plus+j);
					System.out.println("temlist에 적재"+plus);
					System.out.println("!!!!!!!!!!!!중간중간 적재하자 :" + plus);
				}
			}
			System.out.println("@@@@@@@@@@@@최종 적재될때 값 :" + plus);
		}
	}

}


/**
 * 		HashMap<String,String> items = new HashMap<String, String>();
		int itemx = 120;
		for(int i=0; i>itemx ; i++) {
			items.put("itemname", "item"+ i);
		}
		
		int item =120;
		int plus =0;
		
		
		for (int x = 0; x < item; x += 100) {
			List<HashMap<String, Object>> tmpList = new ArrayList<HashMap<String, Object>>();
			for (int j = x; j < x + 100; j++) {
				if (j < item) {
					plus += j;
					System.out.println(plus+j);
					System.out.println("temlist에 적재"+plus);
					System.out.println("!!!!!!!!!!!!중간중간 적재하자 :" + plus);
				}
			}
			System.out.println("@@@@@@@@@@@@최종 적재될때 값 :" + plus);
		}
	}
*/