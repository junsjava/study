package programing;

import java.util.Random;

public class lotto {

	public static void main(String[] args) {
		System.out.println("LoT Program");
		
		Random rn = new Random();
		int num ;

		for(int i=0; i<6; i++) {
			rn.nextInt(45);
			
			System.out.println(rn.nextInt(45));
		}
		System.out.println("위에는 Random Method사용");
		
		for(int i=1; i<=6; i++) {
			
			System.out.println((int)(Math.random()*45));
		}
	}
}
