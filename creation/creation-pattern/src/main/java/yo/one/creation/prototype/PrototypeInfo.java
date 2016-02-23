package yo.one.creation.prototype;

import java.io.Serializable;

public class PrototypeInfo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	private int index;
	
	public PrototypeInfo() {
		// TODO Auto-generated constructor stub
	}
	
	public PrototypeInfo(String name,int index) {
		this.name = name;
		this.index = index;
	}
	
	@Override
	public String toString() {
		String info = "{name:"+ this.getName() + "," + "index:" + this.getIndex() + "}"; 
		return info;
	}
}
