package programing;

import java.text.SimpleDateFormat;

public class Day {
	public static void main(String[] args) {
		System.out.println("달력테스트");
		
		SimpleDateFormat d = new SimpleDateFormat();
		String day = d.get2DigitYearStart().toString();
		System.out.println(day);
		System.out.println("===========");
		System.out.println("자른다는가정");
		System.out.println(day.substring(4, 7));
		 
	}

}
