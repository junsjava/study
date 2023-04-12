package testmethod;

import java.util.ArrayList;
import java.util.List;




public class Listmethod {
	public static void main(String[] args) {


		List<Object> exsample = new ArrayList<Object>();

		String a = new String();
		String b;
		a = "aㅁㅓㅓ";
		b = "b";
		exsample.add(a);
		exsample.add(b);

		System.out.println("값: " + exsample);
		System.out.println("값: " + exsample.toString());
		System.out.println("값: " +exsample.get(1));

		System.out.println(exsample.contains(a));// 값이있는지없는지 객체값 또는 그안에 내용
		System.out.println(exsample.contains("aㅁㅓㅓ"));// 값이있는지없는지 객체값 또는 그안에 내용
		if("b".equals(exsample.get(1))){
			System.out.println("이값이 맞다");
		}else {
			System.out.println("틀리다");
		}
		
		String key = exsample.get(1).toString();
		if("b".equals(key)) {
			System.out.println("동일");
		}
		ValuesObjects s = new ValuesObjects();
		
//		System.out.println(s.getString("b") + "???");
		
	}
	
}

