package testmethod;

import java.util.HashMap;

public class TestValueObject {

	public static void main(String[] args) {
		String[] name = new String[5];
		String id = new String();
		String a = "a";
		
		name[0] = "테스트";
		name[1] = "테스트2";
		name[2] = "테스트3";
		name[3] = "테스트4";
		name[4] = "테스트5"; 
		id = "korea";
		
		HashMap<String, Object> i = new HashMap<String, Object>();
		System.out.println(name.length);
		for(int j=0; j < name.length; j++) {
			System.out.println("진행중");
			String key = name[j].toString();
			i.put(key, name[j]);
		}
		System.out.println("-----------종료--------------");
		System.out.println(i.get("이름"));
		System.out.println(i.toString());
		System.out.println(i.get("테스트2"));
		System.out.println(i.get("테스트3"));
		System.out.println(i.get("테스트4"));
		System.out.println(a);
		System.out.println(name);
		if("테스트2".equals(i.get("테스트21"))) {
			System.out.println("success");
		}else {
			System.out.println("실패");
		}
	}
}
