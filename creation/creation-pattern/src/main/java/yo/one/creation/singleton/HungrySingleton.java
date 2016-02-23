package yo.one.creation.singleton;

//饿汉模式实现的单例模式 不存并发问题
public class HungrySingleton {
	
	private static HungrySingleton instance = new HungrySingleton();
	
	private HungrySingleton() {

	}
	
	public static HungrySingleton getInstance(){
		return instance;
	}
}
