package testmethod;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.google.gson.Gson;

class StringtoJson{
	Gson gson;
}

public class printwrites {

	public static void main(String[] args) {
		Gson g = new Gson();
		
		HashMap<String, Object> jsontext = new HashMap<String, Object>();
		jsontext.put("1", "1");
		jsontext.put("2", "2");
		System.out.println(jsontext.toString()+"hashmap index없음");
		HashMap<String, Object> j = new HashMap<String, Object>();
		j.put("3", "3");
		
		
		List<Object> a = new ArrayList<Object>();
		a.add(j);
		jsontext.put("4", "4");
		a.add(jsontext);
		System.out.println(a.toString());
		System.out.println(a.get(0) +"0번째일때");
		System.out.println(a.get(1) +"1번째일때");
		Object data = a;
		String josntextfile = g.toJson(data);
		System.out.println(josntextfile);
		
		System.out.println(josntextfile.getBytes());
		

//		wr.close();
	}
}
