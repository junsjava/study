package testmethod;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class Url {
	public static void main(String[] args) {
		
		try {
		URL url = new URL("https://home.jsworld.kro.kr");
		
		URLConnection conn = url.openConnection();
		System.out.println("성공");
		System.out.println("protocol : " + url.getProtocol());
		System.out.println("host : " + url.getHost());
		System.out.println("port : " + url.getPath());
		System.out.println("filename : " + url.getFile());
		System.out.println("getPort : " + url.getPort());
		System.out.println("Authority : "+ url.getAuthority());
		}catch(IOException e){
			e.printStackTrace();		
		}
		
		
		
	}

}
