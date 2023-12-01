package base64;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class As256 {
	
	public static String algorithms = "AES/CBC/PKCS5Padding";

	private final static String AESKey ="LS5HUEJGGR93MYF3GLR7YTXRFDB13MJC"; //32 byte
	
	private final static String AESIv ="Y7H8O132OQYNQJU1"; //16byte
	
	//암호화 객체
	public String encrypt_AES(String ID) {
		try {
			
			String result;
			
			//암호화 객체 생성 알고리즘 적용
			Cipher cipher = Cipher.getInstance(algorithms);
			//시크릿키 생성  32byte
			SecretKeySpec secretKeySpec = new SecretKeySpec(AESKey.getBytes(), "AES");
			//백터키 생성 16byte
			IvParameterSpec ivParameterSpec = new IvParameterSpec(AESIv.getBytes());
			
			//암호화 적용
			cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, ivParameterSpec);
			
			//암호화
			
			byte[] encrypt = cipher.doFinal(ID.getBytes(StandardCharsets.UTF_8));
			result = Base64.getEncoder().encodeToString(encrypt);
			
			return result;
			
		}catch (Exception e) {
			System.out.println("암호화중 오류발생");
			e.printStackTrace();
		}
		return "";
	}
}
