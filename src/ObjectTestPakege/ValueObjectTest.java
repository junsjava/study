package ObjectTestPakege;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ValueObjectTest {
	public static void main(String[] args) {
		
		Val t = new Val();
		String s = "오브젝트값";
		t.set("키값", s);
		
		List<HashMap<String, Object>> test = new ArrayList<HashMap<String,Object>>();
		
		HashMap<String, Object> tt = new HashMap<String, Object>();
		String ob = "가상의값 ";
		
		tt.put("가상의키", ob);
		
		test.add(0,tt);
		System.out.println();
		ob= "가상의값2";
		tt.put("가상의키",ob );
		test.add(1,tt);
		
		for(int i=0; i<test.size(); i++) {
			System.out.println(test.get(i));
		}
		
		
		Val sb = new Val();
		//셋 첫번째
		sb.set("test", ob);
		System.out.println("sb첫번째");
		sb.set("test2", s);
		System.out.println("sb두번째");
	
		sb.getString("test");
		System.out.println("sb getstring");
		
		System.out.println("------------------------------------");
		System.out.println();
		System.out.println();
		
		String a1 = "첫번째";
		String a2 = "두번째";
		String a3 = "세번째 ";
		
		sb.set("a1", a1);
		sb.set("a2", a2);
		sb.set("a3", a3);
		
		System.out.println(sb.getString("a3"));
		
		List<String> tl = new ArrayList<String>();
		
		tl.add(0, a1);
		tl.add(0, a2);
		tl.add(1, a3);
		
		System.out.println(tl.get(0));
		
		System.out.println(tl.indexOf(0));
		
		System.out.println("-------------");
		
		HashMap<String, Object> sl = null;
		
		sl = new HashMap<String, Object>();
		sl.put("a1", a1);
		
		
		List<HashMap<String,Object>> tk = new ArrayList<HashMap<String,Object>>();

		tk.add(0,sl);
		sl = null;
		sl = new HashMap<String, Object>();
		
		sl.put("a2",a2);
		tk.add(0,sl);
		
		System.out.println(tk);
		System.out.println(sl);
		
		System.out.println(tk.get(1)+ ""+ tk.get(0));
		System.out.println(sb.getClass());
		System.out.println();

	}

}

class Val {
	//제일중요한 아키텍쳐네..
	List<HashMap<String, Object>> tbl = new ArrayList<HashMap<String,Object>>();
	
	//기본생성자
	public Val(){};
	
	public void set (String key , String Object) {
		System.out.println("1. 여기로 셋이들어옴 ");
		System.out.println("public void set(String key, String Object)..");
		System.out.print("key Object값은?? -->");
		System.out.println("[ key ] : "+key + " [ Object]  :" + Object);
		
		System.out.println("그러고 난뒤 set (0,key,object) --> 오버로딩 <--된 set호출 ");
		set(0, key, Object);
	}
	
	public void set(int index , String key , Object value) {
		HashMap<String, Object> row = null;
		
		System.out.print("여기로 set 호출값 넘어옴 값 확인값은 ? -->");
		System.out.println("index값 : " +index + "key값 : " + key + "Object값 :" + value);
		
		
		if(index <tbl.size() && tbl.get(index) != null) {
			row = tbl.get(index);
			System.out.println("첫번째 if문 로우 값 : "+ row);
		}else {
			row = new HashMap<String, Object>();
			tbl.add(index, row);
			System.out.println("tbl값 제로 :" + row);
			System.out.println("우선 tbl쪽에 index값과 HashMap 값을 담아놓는다");
			System.out.println("담긴값은 ? " + tbl.get(0));
		}
		System.out.println("tbl값 제로인상태로 넘어옴 : "+ row);
		row.put(key, value);
		
		
		System.out.println("최종적 row 값 : " + row);
		
		System.out.println("row에푸시된 이후 tbl값 재조회");
		
		System.out.println(tbl.get(0));
		System.out.println("tbl 값 :"+tbl);
		
		System.out.println();
		System.out.println();
		
	}

	public Object get(int index, String key) {
		HashMap<String, Object> row = null;
		System.out.println("getString 진행시2 get쪽 :" + key);
		
		if(tbl.get(index)!= null) {
			row= tbl.get(index);
			System.out.println("row스트링값 :"+row.toString());
			if(row.get(key) != null) {
				return row.get(key);
			}else {
				return null;
			}
		} else {
			return "";
		}
	}
	
	public Object get (String key) {
		return get(0,key);
	}
	
	public String getString(String key) {
		if(get(0,key) != null) {
			System.out.println("getString진행시1 " + get(0,key));
			return get(0,key).toString();
		}else { 
			return null;
		}
	}
	

}


