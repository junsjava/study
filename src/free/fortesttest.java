package free;

public class fortesttest {

	public static void main(String[] args) {
		
		for(int i=1; i <=2; i++) {
			System.out.println("출력횟수는? : "+ i);
		}
		
		// Foreach 문법 for문과 비교
		
		String[] item = {"아이템1","아이템2","아이템3","아이템4","아이템5"};
		
		//기본for문
		for(int i=0; i<item.length; i++) {
			System.out.println(item[i]);
		}
		System.out.println("--------------결과표시구분선----------------");
		//foreach
		for(String bag : item) {
			System.out.println(bag);
		}
	}
}