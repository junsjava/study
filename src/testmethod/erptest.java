package testmethod;

import java.util.HashMap;

public class erptest {

	public static void main(String[] args) {
		int berry = 5;
		int apple = 1;
		int craft = 1;
		
		HashMap<String, Object> oneweek = new HashMap<String, Object>();
		oneweek.put("1week", berry+apple+craft);
		System.out.println("1주자" +oneweek.get("1week"));
		
	}
}
