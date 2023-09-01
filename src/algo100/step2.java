package algo100;

public class step2 {
	public static void main(String[] args) {
		/**
		 * 
		 * 피보나치 수열을 출력해라
		 * An = an-1 + an-2
		 * 
		 * -1 1 2 3 5 8 13 21 34...
		 */
		int []arr = new int[100];
		
		arr[1] =1;
		arr[2] =1 ;
		
		for(int i=3; i<100; i++) {
			arr[i] = arr[i-1] + arr[i-2];
			System.out.println("-------");
			System.out.println(arr[i]);
			System.out.println("======");
		}
		
		for( int i=1; i <=10; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

}