package testmethod;

import java.io.PrintWriter;


public class printWriter {
	public static void main(String[] args) {



		PrintWriter pw = new PrintWriter(System.out);

		String str1 = "Hello";

		pw.print(str1);
		pw.print(str1);
		pw.println();
		pw.print(str1);
		pw.println();
		pw.printf("%.2f",Math.PI);
		
		pw.flush();
		
		pw.close();
		
		
		
	}
}
