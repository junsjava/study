package testmethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class jsonpa {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		HashMap<String, Object> map2 = new HashMap<String, Object>();
		
		map.put("안준상", "21살");
		map.put("안준영", "17살");
		map.put("안준", "17살");
		map.put("안", "17살");
		map.put("영", "17살");
		
		/*
		 * map.put("엄마","최고"); map.put("동생","역시최고");
		 * 
		 * JSONObject json = new JSONObject(); json = new JSONObject(map);
		 * //System.out.println(json);
		 * 
		 * JSONArray jsonArray = new JSONArray(); jsonArray.add(json); JSONObject
		 * newjson = new JSONObject(); newjson.put("가족", jsonArray);
		 * System.out.println(newjson);
		 */
		
		
		
		/*
		 * JSONObject json = new JSONObject(); JSONArray jsona = new JSONArray();
		 * JSONObject cl = new JSONObject(); json = new JSONObject(map);
		 * jsona.add(json);
		 * 
		 * map.put("정미경", "40"); jsona.add(map);
		 * 
		 * System.out.println("그냥 jsonobject \n" +json);
		 * System.out.println("jsonobject 배열담\n"+jsona);
		 * 
		 * map2.put("가", "한글"); map2.put("나","한글이지");
		 * 
		 * JSONArray js = new JSONArray(); js.add(map);
		 * System.out.println("바로arry배열담기\n"+js);
		 * 
		 * System.out.println("key를 생성한 배열담기");
		 * System.out.println("------------------------------");
		 * 
		 * cl.put("family", jsona); System.out.println(cl);
		 * 
		 * for(int i=0; i <cl.size(); i++) {
		 * System.out.println(cl.get("family").toString()); }
		 */
		
		
		List<HashMap<String, Object>> req = new ArrayList<HashMap<String,Object>>();
		
		req.add(map);
		map.put("안준", "17살");
		map.put("안", "17살");
		map.put("영", "17살");
		req.add(map);
		System.out.println(req);
		
		JSONObject json = new JSONObject();
		JSONArray array = new JSONArray();
		JSONObject jsonObject = new JSONObject();
		
		for(HashMap<String,Object> item : req) { //리스트로 넘어온걸 HashMap형태로 꺼낸뒤
			array.add(item);  //Json Array 형식으로 변환
		}
		System.out.println(array);
		jsonObject.put("root", array); // root라는곳에 배열삽임진행
		System.out.println(jsonObject);
		
//		array.add(req);
//		System.out.println(array);
//		jsonObject.put("key", array);
//		System.out.println(jsonObject);
		
		
	}

}
