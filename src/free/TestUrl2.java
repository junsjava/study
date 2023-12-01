package free;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import aes256.Aes;
import base64.As256;



public class TestUrl2 {
	public static void main(String[] args) {
		BufferedReader in =null;
		As256 aes = new As256();
		
		String id = aes.encrypt_AES("하이");
		String pw = aes.encrypt_AES("pw");
		
		System.out.println(id +"/"+ pw);
		
		
		try {
			URL obj = new URL("https://hisnet.handong.edu/api/dormitory/user/login?usernum="+id+"&userpw="+pw); //호출할 url
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			
			String reqURL = "https://test.com/naver.com";
			
			URL url = new URL(reqURL);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			
			conn.setDoOutput(true);
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()));
	        StringBuilder sb = new StringBuilder();
	        sb.append("Content-type=application/x-www-form-urlencoded;charset=utf-8");
	        sb.append("&grant_type=authorization_code");
	        sb.append("&client_id=baeee14c14e5512369d8be9c3e65bf1c");  //본인이 발급받은 key
	        sb.append("&redirect_uri=https://home.jsworld.kro.kr/user/loginpage_kakao_callback.do");     // 본인이 설정해 놓은 경로
	        sb.append("&code=testcode");
	        bw.write(sb.toString());
	        
	        bw.flush()
	        
	        Httpser;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
