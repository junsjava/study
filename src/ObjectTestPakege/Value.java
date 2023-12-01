package ObjectTestPakege;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Value  implements Serializable{

	/**
	 * SerialVersion 기본 시리얼넘버
	 */
	private static final long serialVersionUID = -74126490191179602L;
	
	private List<HashMap<String, Object>> tbl = new ArrayList<HashMap<String,Object>>();
	
	/**
	 * 접근 할수있게 ...
	 */
	public Value() {};
	
	/**
	 * 테이블 값 형태 GET
	 * @return List<T>
	 */
	public List<HashMap<String, Object>> getTable(){
		return tbl;
	}
	
	public void setTable(List<HashMap<String, Object>> tbl) {
		this.tbl = tbl;
	}
	
	public void set(int index, String key, Object value) {
		
		HashMap<String, Object> row = null;
		
		if(index < tbl.size() && tbl.get(index) != null) {
			row = (HashMap<String, Object>)tbl.get(index);			
		}else {
			row = new HashMap<String, Object>();
			tbl.add(index ,row);
		}
		row.put(key, value);
		
	}
	
	public void set(String key, Object value) {
		set(0, key, value);
		
	}
	

}
