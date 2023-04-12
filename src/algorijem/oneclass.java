package algorijem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class oneclass {

	public static void main(String[] args) {
		/**
		 * 1. Hello 출력하기
		 */
		System.out.println("1");
		System.out.println("Hello");

		System.out.println("\n--------------------");
		/**
		 * 2.Hello World 출력하기
		 */
		System.out.println("2 ");
		System.out.printf("Hello\nWorld");
		System.out.println("\n--------------------");
		/**
		 * 3.'Hello' 출력하기
		 */

		System.out.println("3");
		System.out.println("\'Hello\'");
		System.out.println("\n--------------------");

		/**
		 * 4. "Hello" 출력하기
		 */
		System.out.println("4");
		System.out.println("\"Hello\"");
		System.out.println("\n--------------------");

		/**
		 * 5. 특수문자 출력 정답 : %출력 할땐 %%
		 */
		System.out.printf("\"!@#$%%^&*()\"");
		System.out.println("\n----------------------");
		System.out.println("C:\\Download\\Hello.cpp");
		System.out.println("\n----------------------");

		System.out.printf("\u250c\u252c\u2510\n");
		System.out.printf("\u251c\u253c\u2524\n");
		System.out.printf("\u2514\u2534\u2518\n");

		/**
		 * 별 출력하기.
		 */
		for (int i = 0; i <= 6; i++) {
			System.out.println("*");
			for (int j = 1; j <= i; j++) {
				System.out.printf("*");
			}
		}
		System.out.println("\n---------------------");

		/*		*//**
					 * 정수 출력하기
					 *//*
						 * 
						 * int num1 = 0;
						 * 
						 * Scanner sc = new Scanner(System.in);
						 * 
						 * 
						 * System.out.println("정수를 입력하세요" ); num1 = sc.nextInt();
						 * System.out.println("입력 결과값 :"+ num1);
						 * System.out.println("\n--------------------");
						 * 
						 * String str = null;
						 * 
						 * System.out.println("문자를 입력하세요"); str = sc.next();
						 * System.out.println("입력결과값 : "+ str);
						 * System.out.println("\n---------------------");
						 * 
						 * float fnum = 0;
						 * 
						 * System.out.println("실수를 입력하세요"); fnum = sc.nextFloat();
						 * System.out.println("입력결과값 : " + fnum);
						 * System.out.println("\n---------------------");
						 * 
						 * num1 = 0; int num2;
						 * 
						 * System.out.println("첫번째 정수를 입력하세요"); num1 = sc.nextInt();
						 * System.out.println("두번째 정수를 입력하세요"); num2 = sc.nextInt();
						 * System.out.println(num1+""+num2); System.out.printf("%d%d",num1,num2);
						 * 
						 * str = null; String str2;
						 * 
						 * System.out.println("첫번째 문자입력 하세요"); str =sc.next();
						 * System.out.println("두번째 문자입력 하세요"); str2 = sc.next();
						 * System.out.printf("%s%s",str,str2); System.out.println(str2+""+str);
						 * System.out.printf("첫번째 입력 값은 ? : %s 두번째 입력값은 : %s",str,str2 );
						 * 
						 * System.out.println("\n---------------------");
						 */

		int aaaaa = 2555;

		if (1000 >= aaaaa && aaaaa <= 2000) { //1000 과 2000 사이값인지 .. true~ false
			System.out.println("사이값");
		} else {
			System.out.println("아니다"); 
		}
		
		System.out.println("현재  2562년 불기연도");
		System.out.println("서기연도로 변경하기");
		
		int num3 =0;
		int count = 543;
		
		System.out.println("변경할 년도를 입력하세요");
		Scanner sa = new Scanner(System.in);
		num3 = sa.nextInt();
		int total = num3-count;
		String ax = Integer.toString(total);
		System.out.println("형변환 후 :"+ax);
		System.out.println("다시 인트형으로 변환");
		int changeint = Integer.parseInt(ax);
		System.out.println("다시 형변환 : "+changeint);
		
		int aa;
		int ab;
		int ac;
		try {
		System.out.println("짝수만 출력해보자");
		System.out.println("정수를 입력하세요 aa값");
		aa= sa.nextInt();
		
		System.out.println("정수를 입력하세요 ab값");
		ab= sa.nextInt();
		System.out.println("정수를 입력하세요 ac값");
		ac= sa.nextInt();
		
		
		
			
			if(aa % 2 == 0) {
				System.out.println("aa입력값은 짝수입니다"+" ["+aa+ "]");
			}else {
				System.out.println("짝수가아닙니다");
			}
			if(ab %2 == 0) {
				System.out.println("ab입력값은 짝수입니다" +ab);
			}else {
				System.out.println("짝수가 아닙니다.");
			}
			if(ac %2 ==0) {
				System.out.println("ac 입력값은 짝수입니다" + ac);
			}else {
				System.out.println("짝수가아닙니다");
			}
		}catch(InputMismatchException e) {
			System.out.println(e.getMessage() +"에러메세지");
			e.printStackTrace();
		}finally {
			System.out.println("실패했습니다.");
		}
		
		
		System.out.println("넘어간닷.");
		
		
	}
}
