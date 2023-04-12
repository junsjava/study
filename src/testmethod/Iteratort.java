package testmethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Iteratort {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		int itemnumber =1;
		String itemname =null;
		String itemn =null;
		List<HashMap<String, Object>> itemback = new ArrayList<HashMap<String,Object>>(); 
		HashMap<String, Object> itemlastack = new HashMap<String, Object>();
		for (int i=0 ; i<=100; i++) {
			list.add(i);
			itemnumber = i;
			itemlastack.put(Integer.toString(itemnumber), itemnumber);
		}
		System.out.println("-----관리시스템-----");
		System.out.println("사용할 시스템을 선택해주세요");
		System.out.println("1. 재고관리");
		System.out.println("2. 재고등록");
		int a = 1;
		int b = 2;
		
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		
		if(value== 1 ) {
			System.out.println("");
		}
		if(value == 2) {
			System.out.println("등록할 상품의 이름을 적어주세요\n");
			itemname = sc.next();
			System.out.println("상품의 시리얼넘버를 입력\n");
			itemn = sc.next();
			System.out.println("등록이 완료되었습니다.");
		}
		
		HashMap<String, Object> itembacks = new HashMap<String, Object>();
		itembacks.put(itemname, itemn);
		
		System.out.println("등록된 상품 : "+itembacks.keySet()+"갯수"+itembacks.get(itemname)+"개");
		System.out.println("시스템종료");
		sc.close();
		
		
		
		
		
		
		//Iterator<Integer> itr = list.iterator();
		
		/*
		 * while(itr.hasNext()) { //안에 존재하는지.. int date = itr.next(); //다음값
		 * 
		 * System.out.println(date); }
		 */
	}
}
