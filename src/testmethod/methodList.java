package testmethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class methodList {
	
	public static void main(String[] args) {
				
			System.out.println("물류시스템에 오신걸 환영합니다.");

			HashMap<String, String> item = new HashMap<String, String>();
			List<Object> alist =new ArrayList<Object>();
			
			while(true) {
				String itemname = null;
				String bag = null;
				String money = null;
				int sotype =0;
				int type = 0;				
				@SuppressWarnings("resource")
				Scanner sc = new Scanner(System.in);
			System.out.println("물류프로그램 시스템");
			System.out.println("---------------------------");
			System.out.println("메뉴를 선택해주세요");
			System.out.println("1. 물류조회");
			System.out.println("2. 상품입력");
			type= sc.nextInt(); 
			

			if(type == 1) {
				System.out.println("물류조회를 선택하셨습니다.");
				System.out.println("---------------------");
				System.out.println("1. 전체물류확인");
				System.out.println("2. 물류검색");
				sotype = sc.nextInt();
				
				if(sotype== 1) {
					System.out.println("-----전체물류 리스트-----");
					if(item.size() >0) {
						System.out.println("조회리스트 ");
						for(int i=0; i>alist.size(); i++) {
							System.out.println(alist.get(i));
						}
					}else {
						System.out.println("물품이 존재하지 않습니다 \n");
					}

					
				}else if(sotype==2) {
					System.out.println("검색할 물류의 이름을 적어주세요");
					itemname = sc.next();
					if(item.containsKey(itemname)) {
						System.out.println("검색결과 = " + " [ " +item.get(itemname) + " ]");
					}else {
						System.out.println("검색하신 상품이 없습니다.\n");
					}
				}
			}
			if(type== 2){
				
				System.out.println("상품입력을 선택하셨습니다.");
				System.out.println("상품의 이름을 입력해주세요");
				bag = sc.next();
				System.out.println("상품의 가격을 적어주세요");
				money = sc.next();
				item.put(bag, money);
				System.out.println("상품등록이 완료되었습니다.");
				System.out.println("\n");
				alist.add(item);
			}

		}
		
	}
}
