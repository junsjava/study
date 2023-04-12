package Exceptionclass;

public class SampleException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String title; // 에러재목
	
	public SampleException(String title, String message) {
		super(message);
		this.title = title;
	}
	
	public String getTitle() {
			return title;
	}
}
