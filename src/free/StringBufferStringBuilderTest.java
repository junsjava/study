package free;

public class StringBufferStringBuilderTest {

	public static void main(String[] args) {
		String col = "[C]";
		String row = "[R]";
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("900109").append(col).append("안준상");
		
		System.out.println(sb);
		
		StringBuffer bs = new StringBuffer();
		bs.append("900109").append(col).append("안준상");
		System.out.println("bs:" +bs);
	}
}
