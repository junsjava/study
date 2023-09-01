package testmethod;

public class ForEx1 {

	public static void main(String[] args) {
		
		// i가 지정된 값부터 대입시작이다 1 ..2 까지 반복돌게된다.
		for(int i=1; i<3; i++) {
			System.out.println(i);
		}
		
		for(int i=1; i<=5; i++) {
				System.out.println('*');
			for(int j=0; j<i; j++) {
				System.out.print('*');
			}
		}
	}
}
