package free;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonTexttest {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		List<HashMap<String, Object>> tbl = new ArrayList<HashMap<String,Object>>();
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		map.put("가방", "프라다");  //
		map.put("핸드폰", "갤s23");
		
		tbl.add(map);
		System.out.println(tbl.toString());
		
		
		JSONArray arrayy = new JSONArray(); //JSON 정보를 담을 Array 선언용
		JSONObject jsonobject = new JSONObject(); // Object 형태 (최종 완성시킬떄)
		
		JSONObject json = new JSONObject();
		
		arrayy.add(tbl);
		
		json.put("json", arrayy);
		
		String jinfo = json.toJSONString();
		System.out.println(jinfo);
		
		
		
		
		
		
		
		
		
	}
}
