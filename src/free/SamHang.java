package free;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Timer;


public class SamHang {
	public static void main(String[] args) {
		/**
		 * 입력에 따른 값이 들어가게 .. 해보자 if문을 사용안하고 삼항을 이용하여 ㅇㅋ?
		 */
		
		HashMap<String, Object> reg = new HashMap<String, Object>();
		String id = null;
		String name = null;
		String adress = null;
		String sex = null;
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("회원가입을 진행하도록 하겠습니다.");
		System.out.println("간단한 아이디");
		System.out.println("이름");
		System.out.println("집주소");
		System.out.println("성별순 입력요망");
		System.out.println("========회원가입=========");
		System.out.print("아이디:");
		id = sc.next();
		reg.put(id, id);
		System.out.println("입력완료");
		Timer t = new Timer();// 타이머 나중에 테스트해봅시다.
		for(int i=0; i<13; i++) {
			System.out.println();
		}
		System.out.println("========회원가입=========");
		System.out.println("아이디:" + id);
		System.out.print("이름:");
		name = sc.next();
		reg.put(name, name);	
		System.out.println("입력완료");
		for(int j=0; j<13; j++) {
			System.out.println();
		}
		System.out.println("========회원가입=========");
		System.out.println("아이디:" + id);
		System.out.println("이름:" + name);		
		System.out.print("주소:");
		adress = sc.next();
		reg.put(adress, adress);	
		System.out.println("입력완료");
		for(int j=0; j<13; j++) {
			System.out.println();
		}		
		System.out.println("========회원가입=========");
		System.out.println("아이디:" + id);
		System.out.println("이름:" + name);		
		System.out.println("주소:" +adress);
		System.out.print("성별");		
		sex = sc.next()=="남" ? "남" : "여";   // 삼항연산자  스캔입력이 남 맞을경우  ? true 남 : false 여
		reg.put(sex, sex);	
		System.out.println("입력완료");
		for(int j=0; j<13; j++) {
			System.out.println();
		}
		System.out.println("========회원가입=========");
		System.out.println("아이디:" + id);
		System.out.println("이름:" + name);		
		System.out.println("주소:" +adress);
		System.out.println("성별 : " +sex);
		num = 0;
		List<Object> bag = new ArrayList<Object>();
		
		
		bag.add(num,reg);
		System.out.println("회원정보 조회하기");
		System.out.println("이름을 입력하세요");
		
		System.out.println(bag.get(0).toString());

		
	}

}
