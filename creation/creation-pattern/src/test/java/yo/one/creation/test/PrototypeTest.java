package yo.one.creation.test;

import java.io.IOException;

import yo.one.creation.prototype.Prototype;
import yo.one.creation.prototype.PrototypeInfo;

public class PrototypeTest {
	
	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException {
		PrototypeTest test = new PrototypeTest();
		System.out.println("============================partClone=======================");
		test.partCloneTest();
		System.out.println("============================deepClone=======================");
		test.deepCloneTest();
	}
	
	//说明：浅克隆，对实例进行复制，实例内的对象引用是公用的，基础类型单独拷贝
	public void partCloneTest() throws CloneNotSupportedException{
		PrototypeInfo info = new PrototypeInfo("org",0);
		Prototype pro = new Prototype(info,false);
		
		Prototype partClone = (Prototype) pro.partClone();
		System.out.println("before seting,partClone info is:"+partClone.toString());
		info.setIndex(1);
		info.setName("easycopy");
		System.out.println("after setting,partClone info is:" + partClone.toString());
		
		System.out.println("partClone is same as org instance :" + (pro == partClone));
		System.out.println("info of partClone is same as info of org instance :" + (pro.getInfo() == partClone.getInfo()));
	}
	
	//说明：深克隆 ，不论是基础类型，还是复杂对象，都是有拷贝，相互独立的
	public void deepCloneTest() throws ClassNotFoundException, IOException{
		PrototypeInfo info = new PrototypeInfo("org",0);
		Prototype pro = new Prototype(info,false);
		
		Prototype deepClone = (Prototype) pro.deepClone();
		System.out.println("before seting,deepClone info is:"+deepClone.toString());
		info.setIndex(1);
		info.setName("easycopy");
		System.out.println("after setting,deepClone info is:" + deepClone.toString());
		
		System.out.println("partClone is same as org instance :" + (pro == deepClone));
		System.out.println("info of partClone is same as info of org instance :" + (pro.getInfo() == deepClone.getInfo()));
		
	}
}
