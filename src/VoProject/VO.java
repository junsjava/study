package VoProject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class VO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String No;
	private String Name;
	private HashMap<String, Object> item = new HashMap<String, Object>();
	
	private List<HashMap<String, Object>> tbl = new ArrayList<HashMap<String,Object>>();
	
	
	public VO() {	} //기본생성자
	
	public void set(List<HashMap<String, Object>>  tbl){
		this.tbl = tbl;
	}

	public String getNo() {
		return No;
	}

	public void setNo(String no) {
		No = no;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "VO [No=" + No + ", Name=" + Name + "]";
	}
	
	public VO(String No , String Name) {
		this.No = No;
		this.Name = Name;
	}
	
	public HashMap<String, Object> setName(String r, String q){
		item.put(r, q);
		return item;
	}
	public String getName(String r){
		String s=item.get(r).toString();
		return s;
	}	
	
	
}
