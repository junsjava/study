package free;

public class testtesttest {
	public static void main(String[] args) {
		String[] s =  {"1","2","3","4"};
		String d ="4";
		
		try {
			for(int i=0; i<=3; i++) {
				if("1".equals(s[(i)])) {
					System.out.println("반복획수 및 실행된 번호 : " +i);
				}else {
					System.out.println("아닌값");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

	
}
