package testmethod;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class FileUpload {
	public static void main(String[] args) {
		// FileUpload
		
		File file = new File("d:/here");
		
		String item ="s";
		System.out.println(item.getBytes());
		
		byte[] data = item.getBytes();
		System.out.println(data);
		
		Map<String, byte[]> maps = new HashMap<String, byte[]>();
		maps.put("item", data);
		
		Map<String, File> map = data;
	}

}
