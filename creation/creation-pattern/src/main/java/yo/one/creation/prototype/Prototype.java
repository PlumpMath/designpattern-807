package yo.one.creation.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Prototype implements Cloneable ,Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private boolean active;
	
	private PrototypeInfo info;

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public PrototypeInfo getInfo() {
		return info;
	}

	public void setInfo(PrototypeInfo info) {
		this.info = info;
	}
	
	public Object partClone() throws CloneNotSupportedException{
		Prototype proto = (Prototype) super.clone();
		return proto;
	}
	
	public Object deepClone() throws IOException, ClassNotFoundException{
		ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
		ObjectOutputStream out = new ObjectOutputStream(byteOut);
		out.writeObject(this);
		
		ByteArrayInputStream byteIn = new ByteArrayInputStream(byteOut.toByteArray());
		ObjectInputStream in = new ObjectInputStream(byteIn);
		return in.readObject();
	}
	
	@Override
	public String toString() {
		String info = "{active:" + this.isActive() +","+ "info:" + this.getInfo().toString() +"}";
		return info;
	}
	
	public Prototype() {
		// TODO Auto-generated constructor stub
	}
	
	public Prototype (PrototypeInfo info , boolean active){
		this.info = info;
		this.active = active;
	}
	
	
	
	
	
}
