package yo.one.creation.singleton;

//非线程安全的懒汉 实现单例模式,不适用于并发环境
public class LazySingleton {
	
	private int index;
	

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	private static LazySingleton instance = null;
	
	private LazySingleton() {
		
	}
	
	public static LazySingleton getInstance(){
		if(null == instance){
			instance = new LazySingleton();
		}
		return instance;
	}
	
}
