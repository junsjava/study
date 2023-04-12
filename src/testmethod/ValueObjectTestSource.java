package testmethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ValueObjectTestSource {
	
	
	public static void main(String[] args) {
		
		String parametername = "name";  //파람명
		String parametervalue = "이름"; //파람 값
		
		ValueObject reqVo = new ValueObject();
		
		reqVo.set(parametername, parametervalue); // Key Value 
		
		System.out.println("여기가 컨트롤단,Service단이라치자");
		
		System.out.println(reqVo.getTable());
		
		
		HashMap<String, Object> item = new HashMap<String, Object>();
		item.put("그랙", "34살");
		List<Object> result = new ArrayList<Object>();
		result.add(item);
		
		List rList = result;
		
		System.out.println("여기담긴값은?"+rList);
		
		ValueObject resultVo = new ValueObject();
		resultVo.setTable(rList);
		System.out.println(resultVo);
		
		ValueObject subVo =null;
		List<HashMap<String, Object>> reqList = null;
		JSONObject jsonObject1 = null, jsonObject2 = null;
		JSONArray jsonArray1 = null, jsonArray2 = null;
		String keyName = null;
		String itemanem = "그랙";
		Object vo = itemanem;
		
		
		Set<String> keySet = item.keySet();
		System.out.println(keySet); //키를담고
		
		jsonArray2 = new JSONArray();
		jsonObject2 = new JSONObject();
		
		for(Iterator<String> itr = keySet.iterator(); itr.hasNext();) {
			keyName = itr.next();
//			reqList = subVo.getTable();
		}
		
		System.out.println(keyName);
		System.out.println(subVo);
		System.out.println(reqList);
	}
}
