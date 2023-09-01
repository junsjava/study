package programing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class Kakaoapi {
	
	public static void main(String[] args) throws IOException {
		/**
		 * 
		 * 카카오 Api 로직을 Backend에서 만들어 보자 
		 * 로직순서는 이렇다 .
		 * 1. 사용자 로그인요청 
		 *    -->Auth토큰 발급(인가 [승인]코드)  ####카카오톡에서 보내줌
		 * 
		 * 2. 받은 코드를 가지고 다시 Access , Refresh Code 요청
		 * 	  --> Access , Refresh Code 발급	(사용자 정보가 담긴 코드)	
		 *  
		 * 3. 발급받은코드( Access, Refresh) 로  사용자정보 요청 
		 * 	  --> 이름 , 이메일, 생년월일 등등 ..
		 * 
		 * 4. 회원가입 진행 로직수행
		 * 
		 * 하지만 여기선 가상이기에 내가 전부 가상데이터를 생성하여 console 창에 띄우는식으로 할것이다 .
		 * 
		 */
		
		//첫번째 각 코드 생성 해보기 
		
		//카카오톡에서 발급해주는 코드들
		
		//승인 인가코드
		String authorize = "authorize(승인)인가코드";
		//엑세스코드 (사용자정보 부를때 필요한값 )
		String AccessToken = "AccessToken(계정정보부를수있는)코드";
		
		//웹상에서 로그인후 access 토큰 발급진행부터 해보자
		
		
		/*
		 급 궁금증으로 인하여 작성한다
		*/
		
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
        
        bw.flush();
		

	}
}
