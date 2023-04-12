package box;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;


public class boxprogram {

	public static void main(String[] args) {
		List<HashMap<String, Object>> item = new ArrayList<HashMap<String,Object>>();
		HashMap<String, Object> itemde = new HashMap<String, Object>();	
		Scanner sc = new Scanner(System.in);
		Map<String, Object> a = new HashMap<String, Object>();
	
		while(true) {
			System.out.println("물류시스템에 오신걸 환영합니다.");
			
			System.out.println("메뉴를 선택해 주세요");
			System.out.println("---------------------------------");
			System.out.println("1.물류등록");
			System.out.println("2.조회");
			System.out.println("3.상품이름조회");
			System.out.println("4.카테고리");


			
			try {
				System.out.println(item.toString());
				int menunum = sc.nextInt();				
				String itemname =null;
				String itemdetail = null;
				String key = null;
				String fi =null;
				if(menunum== 1) {
					System.out.println("등록하실 상품의 이름을 넣어주세요");
					itemname = sc.next();
					System.out.println("상품설명을 적어주세요");
					itemdetail = sc.next();
					itemde.put(itemname, itemdetail);
					item.add(itemde);
					System.out.println("상품등록이 완료되었습니다.");
				}if(menunum ==2) {
				  for(int i=0; i< item.size(); i++) {
					  for(Entry<String, Object> map : item.get(i).entrySet()) { //entry set ( key, value갑 추출)
						  System.out.printf("상품명 : %s\n",map.getKey());
						  System.out.printf("상세설명 : %s" , map.getValue());
						  System.out.println();
						  System.out.println();
						  System.out.println();
					  }					  
				  }
				}if(menunum ==3) {
					System.out.println("조회할 상품 이름을 입력하세요");
					key = sc.next();
				    fi =itemde.get(key).toString();
				    System.out.println("조회하신 상품 :");
				    System.out.println(fi);
				}
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		
		}
	}
}
