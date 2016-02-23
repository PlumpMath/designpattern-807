package yo.one.creation.test;

import yo.one.creation.factory.StaticFactory;
import yo.one.creation.service.AdInterface;

public class StaticFactoryTest {
	
	public static void main(String args[]){
		AdInterface liNingAd = StaticFactory.getLiNing();
		AdInterface nikeAd = StaticFactory.getNike();
		liNingAd.showAdWords();
		nikeAd.showAdWords();
	}
	
}
