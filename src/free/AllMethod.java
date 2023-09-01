package free;

import java.util.Scanner;

public class AllMethod {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.println("전체 Method 모음");
		
		System.out.println("-------------목차----------------");
		String[] list = {"String","int","ArrayList","List","if","for","foreach","삼항연산자"};
		
		while(true) {
			
			for(int i=1; i < list.length; i++) {
				System.out.println(i +". "+ list[i]);
			}
			System.out.print("궁금한 내용을 선택하세요");
			num = sc.nextInt();
			
			
			if(num == 1) {
				System.out.println("String이란?");
				System.out.print("간단하게설명하면?");
				System.out.print("문자열이라 생각하면 좋다 예를들어 String ex = '' 이런식으로 하게되면");
				
			}
			else if(num ==6) {
				System.out.println("반복문 중 변형된 반복문 예를들어보자");
				System.out.println("기본적으로 for문형태를보면");
				System.out.println("------------------------------");
				System.out.println("for(int i=0; i<5; i++){");
				System.out.println(" ....");
				System.out.println(" ....");
				System.out.println(" }");
				System.out.println("보통 이런형태의 코드방식으로 되어있다");
				System.out.println("그러나 foreach는 이런형식이다");
				System.out.println("어떠한 배열이있다String[] s  = {1,2,3,4,5}");
				System.out.println("그럼  저 배열에 값들은 s에 담겨있겠죠?");
				System.out.println("그럼 꺼내봅시다");
				System.out.println("배열에 담긴값은 String 이니 String으로 받아야하니");
				System.out.println("아래구문처럼 작성을하면 됩니다");
				System.out.println("for(String here : s){");
				System.out.println("System.out.println('here에담긴값은? :' + here)");
				System.out.println("}");
			}
		}
	}
}
