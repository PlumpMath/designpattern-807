package yo.one.creation.singleton;

public class LazySingletonWithSyn {
	
	private static LazySingletonWithSyn instance = null ;
	
	private int index;
	
	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	private LazySingletonWithSyn() {

	}
	
	//只有当对象null的时候，才加锁
	public static LazySingletonWithSyn getInstance(){
		if(null == instance){
			synchronized (instance) {
				instance = new LazySingletonWithSyn();
			}
		}
		return instance;
	}
	
	//每次获取实例时，都加锁
	public static synchronized LazySingletonWithSyn getInstanceWithMethodSyn() {
		if(null == instance){
			instance = new LazySingletonWithSyn();
		} 
		return instance;
	}
	
}
