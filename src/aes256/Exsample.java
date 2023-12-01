package aes256;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Scanner;
import java.util.Base64.Encoder;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Exsample {
	public static void main(String[] args) {
		
		/**
		 * 
		 * AES 256 CBC 방식으로 Encoding 후 .. BAse64로 한번더 변환해보자
		 */
		
		Aess aess = new Aess();
		
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		String ae = "안준상";
		System.out.println(aess.encryptAes(ae));
		
		String b = aess.encryptAes(ae);
		System.out.println("복호화");
		System.out.println(aess.decryptAes(b));
		
		
		Encoder encoder =Base64.getEncoder(); //O0v/yBAO2rFesud8g5oaMA==  //g zY3yP2GUYA2yXTDeJuh/Og==
		//byte[] encoderBytes = encoder.encode();
		base64();
	}

	
	
	public static void fullpassdata(String data) {
		System.out.println();
		
	}
	
	public static void base64() {
		String text = "암호화";
		byte[] resultbyte = text.getBytes();
		
		Encoder encoder =Base64.getEncoder();
		byte[] encoderBytes = encoder.encode(resultbyte);
		
		System.out.println(encoderBytes);
	}
}

class Aess {
	//알고리즘
		public static String algorithms = "AES/CBC/PKCS5Padding";
		
		// 키
		private final static String AESKey = "abcdefghabcdefghabcdefghabcdefgh"; //32byte (256일경우)
		
		// 초기화 백터
		private final static String AESIv = "0123456789abcdef"; //16byte
		
		//암호화
		 String encryptAes(String ID) {
			try {
				String result; // 암호화 결과 담을 변수
				
				//암호화 / 복호화 기능이 포함된 객체를 생성
				Cipher cipher = Cipher.getInstance(algorithms);
			
				// 키로 비밀키 생성 
				SecretKeySpec keySpec = new SecretKeySpec(AESKey.getBytes(), "AES");
				
				//iv 로 spec 생성
				IvParameterSpec ivParamSpec = new IvParameterSpec(AESIv.getBytes());
				
				//알고리즘을 적용한 생성된 객체에 암호화 적용 (키, 백터값 )  
				cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivParamSpec);
				
				//암호화 실행
				byte[] encrypted = cipher.doFinal(ID.getBytes(StandardCharsets.UTF_8));
				result = Base64.getEncoder().encodeToString(encrypted);
				
				return result;
				
				
			} catch (Exception e) {
	            System.out.println("암호화 중 오류 발생하였습니다. ");
	            e.printStackTrace();
			}
			return "";
		}
		 
		//복호화
		 String decryptAes(String ID) {
			 try {
				 
				 // 암호화 / 복호화 기능이 포함된 객체를 생성
				 Cipher cipher = Cipher.getInstance(algorithms);
				 
				 // 키 생성(비밀키)
				 SecretKeySpec keySpec = new SecretKeySpec(AESKey.getBytes(), "AES");
				 
				 //iv로 spec 생성
				 IvParameterSpec ivParamSpec = new IvParameterSpec(AESIv.getBytes());
				 
				 //알고리즘을 적용한 생성된 객체에 암호화 적용 (키 백터값 )
				 cipher.init(Cipher.DECRYPT_MODE, keySpec, ivParamSpec);
				 
				 //복호화 실행
				 byte[] decodedBytes = Base64.getDecoder().decode(ID);
				 byte[] decrypted = cipher.doFinal(decodedBytes);
				 
				 return new String(decrypted, StandardCharsets.UTF_8);
				 
			 }catch (Exception e) {
				 System.out.println("복호화중 오류 발생.");
				 e.printStackTrace();
				 
			}
			 return "";
		 }
}
