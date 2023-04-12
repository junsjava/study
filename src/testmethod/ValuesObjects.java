package testmethod;

import java.io.Serializable;

public class ValuesObjects implements Serializable{



	private static final long serialVersionUID = 1L;

	public ValuesObjects() {}

	public Object get (int i, String key) {
		return get(0,key);

	}

	public Object get(String key) {
		return get(0,key);
	}

	public String getString(String key) {
		if(get(0,key) !=null) {
			return get(0,key).toString();
		}else {
			return null;
		}
	}
}

