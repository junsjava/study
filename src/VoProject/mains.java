package VoProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mains {
	public static void main(String[] args) {
		VO vo = new VO();
		
		vo.setName("안녕");
		vo.setNo("1");
		
		System.out.println(vo);
		
		System.out.println(vo.toString());
		
		System.out.println(vo.getName());
		
		System.out.println(new VO("홍길동","1"));
		
		String items = "짠";
		vo.setName("바보", items);
		System.out.println(vo.getName("바보"));
		System.out.println("------------------");
		
		
		
		/////////////////////////////////////////////////////////
		String item = "아이템";
		int num = 1234;	
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("key", item);
		System.out.print("Map<String,Object> 출력값 : ");
		System.out.println(map);
		System.out.println("--------------------------------------");
		System.out.println("map값 출력 방법 : map.get('key') ->" + map.get("key"));
		System.out.println("\n");
		
		HashMap<String,Object> hashmap = new HashMap<String, Object>();
		
		hashmap.put("key2",item);
		hashmap.put("key3",num);
		System.out.print("HashMap<String,Object> 출력값 : ");
		System.out.println(hashmap);
		System.out.println("--------------------------------------");
		System.out.println("hashmap 값 꺼내기 hashmap.get('key2') ->" + hashmap.get("key2"));
		System.out.println("\n");
		
		List<Object> ob = new ArrayList<Object>();
		
		ob.add(item);
		ob.add(num);
		System.out.print("List<Object> 출력값 : ");
		System.out.println(ob);
		System.out.println("--------------------------------------");
		System.out.println("List값 꺼내기 ob.get(index) -> " +ob.get(0));
		System.out.println("\n");		
		///////////////////////////////////////////
		List<String> st = new ArrayList<String>();
		st.add(0,item);
		//st.add(num); //int 타입이기에 안들어가짐
		st.add(0,"1");  //숫자는 들어가지는데 어떻게꺼내지는확인해보자
		System.out.print(" List<String> 출력값 : ");
		System.out.print(st +", 데이터값 뽑기  :");
		for(int i=0; i<st.size(); i++) {
			System.out.print(st.get(0)+" , ");
		}
		System.out.println();
		System.out.println("--------------------------------------");	
		System.out.println("\n");		
		///////////////////////////////////////////
		List<Integer> it = new ArrayList<Integer>();
		//it.add(item);// String 타입이게 안들어가짐
		it.add(num);
		it.add(1);
		System.out.print("List<Integer> 출력값 : ");
		System.out.println(it);
		System.out.println("--------------------------------------");
		System.out.println("\n");
		
		List<Map<String,Object>> mpa = new ArrayList<Map<String,Object>>();
		//mpa.add(item);// String 타입이게 안들어가집
		mpa.add(map);
		System.out.print("List<Map<String,Object>> 출력값 : ");
		System.out.println(mpa);
		System.out.println("--------------------------------------");	
		System.out.println("\n");
		
		List<HashMap<String,Object>> hm = new ArrayList<HashMap<String,Object>>();
		//hm.add(map);// Map 타입이기에 안들어가짐.
		hm.add(hashmap);
		System.out.print("List<HashMap<String,Object>> 출력값 : ");
		System.out.println(hm);
		System.out.println("--------------------------------------");
		System.out.println("여기서 테스트를 해보자 .,..");
		;
		///////////////////////////위에가 기본 ///////////////////////////////////////
		// 내가 만들 클래스 VO 글 OBJECT 로 지정
		HashMap<String, VO> vos = new HashMap<String, VO>();
		
		vos.put("vokey", vo);
		System.out.print("HashMap<String, VO> 출력값 : ");
		System.out.println(vos);
		System.out.println("--------------------------------------");		
		
		
		
		//test용
		
		List<HashMap<String, Object>> tbl = new ArrayList<HashMap<String,Object>>();
		
		List a = ob;
		
		HashMap<String, Object> req = new HashMap<String, Object>();
		req.put("key", a.get(0));
		tbl.add(req);
		
		System.out.println(tbl.toString());
		
		System.out.println("키 밸류 셋팅해서 값 꺼내보기 ");
		
		HashMap<String, Object> hlist = new HashMap<String, Object>();
		
		hlist.put("i", items);
		tbl.add(hlist);
		
		
	}
}