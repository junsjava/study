package testmethod;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class SetClasss {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("a");
		set.add("c");
		set.add("b");
		set.add("f");
		set.add("e");
		set.add("g");
		set.add("h");
		set.add("i"); // 순서대로 담기게된다
		
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
