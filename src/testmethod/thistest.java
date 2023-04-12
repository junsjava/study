package testmethod;

class Book{
	String bookname;
	int price;
	
	public Book() {}


	public Book(String bookname) {
		this("미입력",-1);
	}



	public Book(String bookname, int price) {
		this.bookname = bookname;
		this.price = price;
	}
	
	public void showPrice() {
		System.out.println(bookname + "의 가격은 " + price +"입니다");
	}


	public String getBookname() {
		return bookname;
	}


	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	
	
	
}

public class thistest {
	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book("비매품");
		Book b3 = new Book("국어책",3000);
		
		
		b1.showPrice();
		b2.showPrice();
		b3.showPrice();
		
		b2.setBookname("북네임");
		b2.showPrice();
		System.out.println(b2.getBookname());
	}

}
