package base64;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class Base64Sample {
	public static void main(String[] args) {
		As256 a = new As256();
		Scanner sc = new Scanner(System.in);
		String c;
		String bb =null;
		
		int d = 0;
		List<HashMap<Integer, Object>> item = new ArrayList<HashMap<Integer,Object>>();
		HashMap<Integer, Object> set = new HashMap<Integer, Object>();
		
		while (true) {
			
			System.out.println("사용하실 기능을 입력해주세요");
			System.out.println("1. 암호화   2.저장된값 호출");
			c= sc.next();
			
			if("1".equals(c)) {
				System.out.println("암호화 할 값을 입력해주세요");
				String text =null;
				text = sc.next();
				System.out.println("변환된 값 : " + a.encrypt_AES(text));
				System.out.println("저장하시겠습니까 ? 1.네  2.아니요");
				String cho = null;
				cho = sc.next();
				if("1".equals(cho)) {
					bb = a.encrypt_AES(text);
					set.put(0, bb);
					item.add(set);
				}
				
			}else if("2".equals(c)) {
					System.out.println(item.toString());
			}
			
		}
		
		
		
	}

}
