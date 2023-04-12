package free;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class PlusMinus {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		int net = 26000;
		int mom = 450000;
		int boherm = 76000;
		int cheongyak = 20000;
		int carboherm = 100000;
		int phone = 100000;
		
		HashMap<String,Object> jicul = new HashMap<String, Object>();
		
		List<HashMap<String,Object>> list = new ArrayList<HashMap<String,Object>>();
		
		jicul.put("인터넷",net);
		jicul.put("엄마",mom);
		jicul.put("보험",boherm);
		jicul.put("청약",cheongyak);
		jicul.put("자동차보험",carboherm);
		jicul.put("핸드폰",phone);
		
		System.out.println("우선 담긴 데이터 :"+"\n"+ jicul);
		
		list.add(jicul);
		
		System.out.println("순서를 준 데이터 : " +"\n" + list);
		
		int total = net+mom+boherm + cheongyak+carboherm + phone;
		System.out.println();
		System.out.println("--------------------------------------");
		System.out.println("내 생활 총 지출 :" + total);
		
		
		JSONObject json = new JSONObject();
		JSONObject json2 = new JSONObject();
		JSONObject json3 = new JSONObject();
		JSONObject jsonObject = new JSONObject();
		JSONArray jsona = new JSONArray();
		json = new JSONObject(jicul);
		System.out.println("Json형태 : "+json);
		json2.put("root", json);
		System.out.println("그룹을만든? Json형태 : "+json2);
		System.out.println();
		jsona.add(json);
		
		json3.put("root2",jsona);
		System.out.println("Json을 배열형태로 담음. : "+json3);
		System.out.println();
		System.out.println(json2.get("root"));
		System.out.println();
		try {
			String a =JSONObject.toJSONString(json);
			System.out.println("here" +a);
			System.out.println();
			String b = JSONObject.toString("a", "a");
			System.out.println(b);
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
}
