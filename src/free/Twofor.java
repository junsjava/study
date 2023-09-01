package free;

public class Twofor {
	public static void main(String[] args) {
		
		for (int i=0; i<5; i++) {
			System.out.println("바깥for문실행구분-------------------");
			for(int j=0; j<10; j++) {
				System.out.println("안쪽 for문 -----------------");
			}
		}
	}

}
