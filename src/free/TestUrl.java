package free;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import aes256.Aes;
import base64.As256;



public class TestUrl {
	public static void main(String[] args) {
		BufferedReader in =null;
		As256 aes = new As256();
		String BasicAccount ="hguDormApi:Bn31a9Nc12mc";//한동대 Basic 인증 ID/ PW
		
		byte[] encodeBasicAccount = BasicAccount.getBytes();
		String ds = Base64.getEncoder().encodeToString(encodeBasicAccount);
		String id = aes.encrypt_AES("21800689");
		String pw = aes.encrypt_AES("csm1215!!");
		
		System.out.println(id +"/"+ pw);
		System.out.println(BasicAccount);
		String yn ="";
		String kk ="";
		
		try {
			URL obj = new URL("https://hisnet.handong.edu/api/dormitory/user/login?usernum="+id+"&userpw="+pw); //호출할 url
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			System.out.println(obj.toString());
			System.out.println(ds.toString());
			con.setDoOutput(true);
			
			
			con.setRequestMethod("GET");
			con.setRequestProperty("Authorization", "Basic " + ds);
			int responsecode = con.getResponseCode();
			System.out.println(responsecode);
			
			in = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
			String result="";
			String line=""; 
			while((line = in.readLine())!=null) {
				result += line;
				System.out.println(line +"여기이후에 꺼내오는것  어찌하는지 결과는 아래에 ..");
				
				JsonObject json = (JsonObject) JsonParser.parseString(result);
				System.out.println(json);
				System.out.println(json.get("success_yn"));
				yn = json.get("success_yn").toString();
				kk =yn.replaceAll("\"", "");
				System.out.println(kk);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if("Y".equals(kk)) {	
			System.out.println("Y네요");
		}else {
			System.out.println("아냐");
		}
			
	}

}
