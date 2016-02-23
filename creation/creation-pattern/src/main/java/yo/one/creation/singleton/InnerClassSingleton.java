package yo.one.creation.singleton;

//内部类实现的单例模式
public class InnerClassSingleton {
	
	private InnerClassSingleton() {

	}
	
	
	private static class InnerClassSingletonHolder{
		private static InnerClassSingleton instance = new InnerClassSingleton();
	}
	
	public static InnerClassSingleton getInstance(){
		return InnerClassSingletonHolder.instance;
	}
	
}
