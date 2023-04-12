package testmethod;

import Exceptionclass.JunException;
import Exceptionclass.SampleException;

public class trytest {

	public static void main(String[] args) {
		long endTime;
		int mo1 = 1;
		int m11 = 2;
		int ea5 = 0;
		try
		{
			throw new JunException("강제 예외 발생시키기", "강제발생시킴");
		}catch (JunException e) {
					System.out.println(e);
					System.out.println("\n");
				System.out.println(e.getMessage());
					e.printStackTrace();
					e.getCause().toString();
		}
		
		
		finally {
			System.out.println("예외가 발생해도 데이터가 실행된다.");
//			System.out.println("넘어옴");
//			endTime = System.currentTimeMillis();
//			System.out.println(endTime);
		}
		System.out.println("이어서");

	}
}
