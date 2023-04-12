package testmethod;

import java.util.HashMap;

public class fortest {

	public static void main(String[] args) {
		String statuscd ="";
		
		String ramt = "100000000";
		double[] V = {0.0, 10000000.0, 50000000.0, 100000000.0, 300000000.0, 500000000.0, 1000000000.0, 2000000000.0, 3000000000.0, 5000000000.0};
		
		if(V[9] <= Double.parseDouble(ramt)) {
			statuscd ="V9";
		}else {
			statuscd = "V" + checkstatus(Double.parseDouble(ramt) ,0 ,0);
		}
		
		System.out.println("-결과-");
		System.out.println(statuscd);
		System.out.println("---");
	}
	static int checkstatus(double totalmoney, double d, int i) {
		System.out.println("더블비 값" + totalmoney +"d값 "+d + "i값" + i);
		double[] V = {0.0, 10000000.0, 50000000.0, 100000000.0, 300000000.0, 500000000.0, 1000000000.0, 2000000000.0, 3000000000.0, 5000000000.0};
		String[] S = {"0", "1천만", "5천만", "1억", "3억", "5억", "10억", "20억", "30억", "50억"};

		System.out.println("");
		if (V[i] <= totalmoney + d) { // 0 <= 1000+ 0
//			System.out.println("여기는 V[i] 값과  각값이 더해지는곳 :" );
			System.out.println("반복되는 횟수"+V[i] +"여기다@@@@@@@@@@@@@@@" +(i+1));
//			System.out.println("V["+i+"] <=" + totalmoney + d +"더해진값 :");
			if (V[9] <= totalmoney + d) return 9; // flase
			return checkstatus(totalmoney, d, i + 1);  // 1000 ,0 0+1
		} else {
			return i - 1;
		}
	}

}


