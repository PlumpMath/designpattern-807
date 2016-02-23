package yo.one.creation.test;
import yo.one.creation.factory.CommonFactory;
import yo.one.creation.service.AdInterface;


public class CommonFactoryTest {
	
	public static void main(String args[]){
		AdInterface nike = new CommonFactory().produce("nike"); 
		AdInterface lining = new CommonFactory().produce("LiNing");
		if(null != nike){
			nike.showAdWords();
		}
		if(null != lining){
			lining.showAdWords();
		}
	}
	
}
