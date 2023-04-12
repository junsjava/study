package testmethod;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class ValueObject implements Serializable{

	/**
	 * Serializavle 아이디값 줘야함
	 */
	private static final long serialVersionUID = -8628632560452346997L; 
	
	/**
	 * ValueObject 기본 호환하기 위한 객체 
	 */
	private List<HashMap<String, Object>> tbl = new ArrayList<HashMap<String,Object>>();
	
	
	/**
	 * 기본생성자 
	 */
	public ValueObject() {}
	
	/**
	 * ValueObject getter
	 * @return List<T>
	 */
	public List<HashMap<String, Object>> getTable() {
		return tbl;
	}
	
	/**
	 * 테이블을 담을때 뜨는 용도 ex) listmapper에서 가져온 테이블 담는..
	 * @param tbl
	 */
	public void setTable(List<HashMap<String, Object>> tbl) {
		this.tbl = tbl;
	}
	
	public void set(int index, String key, Object value) {
		HashMap<String, Object> row = null;
		
		if(index < tbl.size() && tbl.get(index) !=null) {
			row = (HashMap<String, Object>) tbl.get(index); //List< 값을 Hash 형으로 변환
		}else {
			row = new HashMap<String, Object>();
			tbl.add(index, row);
		}
		row.put(key, value);
	}
	
	public void set(String key, Object value) {
		set(0, key, value);
	}
	
	public Object get(int index, String key) {
		HashMap<String, Object> row = null;
		if(tbl.get(index)!=null) {
			row = tbl.get(index);
			
			if(row.get(key) != null) {
				return row.get(key);
			}else {
				return null;
			}
		}else {
			return "";
		}
	}
	
	public Object get(String key) {
		return get(0, key);
	}
	
	
	public String getString(String key) {
		if(get(0,key) != null) {
			return get(0, key).toString();
		}else {
			return null;
		}
	}
	
	public String getString(int index,String key) {
		if(get(0,key) != null) {
			return get(0, key).toString();
		}else {
			return null;
		}
	}	
	
	///////////////////////////////////////////////////////////////////////////////
	
	/**
	 * ValueObject size
	 * @return integer
	 */
	public int size() {
		return tbl.size();
	}
	
	/**
	 * 줄단위 받기.
	 * @return
	 * @throws Exception
	 */
	public HashMap<String, Object> getRow() throws Exception {
		return getRow(0);
	}
	
	public HashMap<String, Object> getRow(int index) throws Exception {
		if (tbl.size() <= index) {
            throw new Exception(" ValueObject-TBL index is Out Of Get range(" + index + "). TBL size (" + tbl.size() + ")");
        }
		
		return (HashMap<String, Object>) tbl.get(index);
    }
	
	public void addRow(HashMap<String, Object> row) {
        if (row == null) {
            row = new HashMap<String, Object>(); 
        }

        add(row);
    }
	
	public void addRow(int idx, HashMap<String, Object> row) throws Exception {

        if (size() < idx) {
            throw new IndexOutOfBoundsException(" ValueObject-TBL index is Out Of Add range(" + idx + "). TBL size (" + tbl.size() + ")");
        }

        if (row == null) {
            row = new HashMap<String, Object>();
        }

        add(idx, row);
    }
	
	private void add(HashMap<String, Object> row) {
        tbl.add(row);
    }

    private void add(int idx, HashMap<String, Object> row) {
        tbl.add(idx, row);
    }
    
    public ValueObject getRowAsVo(int idx) throws Exception {
        ValueObject vo = new ValueObject();
        vo.addRow((HashMap<String,Object>) this.getRow(idx));
        return vo;
    }
    
    public ValueObject getRowAsVo() throws Exception {
        return this.getRowAsVo(0);
    }
    

}
