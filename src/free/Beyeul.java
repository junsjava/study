package free;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Beyeul {
	public static void main(String[] args) {

		/**
		 * 담배 계산기
		 */
		int num ;
		int gebi =0;
		int day = 22;
		int totalgebi= 0;
		int gap =0;
		int smokesalary=4500;
		int totalsmokesalary;
		
		
	
		
		
		while(true) {
			DecimalFormat dc = new DecimalFormat("###,###,###");
			Scanner sc = new Scanner(System.in);
		System.out.println("내가 원하는 계산기같은걸 만들기");
		
		System.out.println("==========계산기 사용하기============");
		System.out.println("1 .더하기");
		System.out.println("2 .빼기");
		System.out.println("3 .나누기");
		System.out.println("4. 담배 계산기");
		System.out.println("=================================");
		
			num = sc.nextInt();
			if(num ==1) {
				
			}else if (num ==2){
				
			}else if (num ==3){
				
			}else if (num ==4){
				System.out.println("[ 담배 계산기를 선택하셨습니다 ]");
				System.out.println("이계산기는 하루 담배를 피는 갯수를 입력시에 한달 출근기준");
				System.out.println("22일기준으로 담배피는 갑 수와 , 담배값이 계산이 자동으로이루어집니다.");
				System.out.println("하루에 피는 담배양을 적어주세요");
				gebi =sc.nextInt();
				dc.format(gebi);
				System.out.println();
				System.out.println();
				System.out.println("하루 피는 담배 개비수 : "+ gebi + "개비");
				totalgebi = gebi * day;
				String totalgebis= dc.format(totalgebi);
				System.out.println("22일동안 피는 개비수 : "+ totalgebis + "개비");
				gap =  totalgebi / 20;
				System.out.println("22일동안 한갑기준 :" + gap +"갑" );
				totalsmokesalary = smokesalary * gap;
				String totalsmokesalarys= dc.format(totalsmokesalary);
				System.out.println("22일 기준 담배값 :" + totalsmokesalarys +"원");
			}
		
		}
		
		
	}

}
