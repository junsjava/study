package algo100;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class step1 {
	public static void main(String[] args) {
		/**
		 *  학생 정보들을 저장하고, 학생이름으로 검색햇을대 학번을 출력하는 프로그램 작성.
		 * 
		 */
		
		ArrayList<String> member = new ArrayList<String>();
		Student m1 = new Student("홍길동","3254687");
		Student m2 = new Student("강감찬","4567897");
		Student m3 = new Student("유관순","9876544");
		Student m4 = new Student("제기동","1479512");
		
		ArrayList<Student> h = new ArrayList<Student>();
		h.add(m1);
		h.add(m2);
		h.add(m3);
		h.add(m4);
		
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("학생의 이름을 검색해주세요");
			String name = sc.next();
			boolean flag= false;
			for(Student list : h) {
				
				if(list.getName().equals(name)) {
					System.out.println("학생의 이름은 : "+list.getName());
					System.out.println("학생의 학번은 : " +list.getNo());
					flag = true;
				}
			}
			
			if(!flag) {
				System.out.println("일치하는 학생이 없습니다.");
			}
			
			
			
			System.out.println("시스템을종료하시겠습니까 ?y/n");
			
			String input = sc.next();
			if(input =="y") {

			}else if(input =="n") {
				System.out.println("시스템에 의해 종료되었습니다.");
				break;
				
				
			}
		}
		
	}

}

class Student{
	String name;
	String no;
	
	public Student(String name, String no) {
		super();
		this.name = name;
		this.no = no;
		
	}
	
	public String getName() {
		return name;
	}
	
	public String getName(String name) {
		return name;
	}	
	public void setName(String name) {
		this.name = name;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	
	
	
}