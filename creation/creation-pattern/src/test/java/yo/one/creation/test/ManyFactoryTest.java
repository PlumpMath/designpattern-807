package yo.one.creation.test;

import yo.one.creation.factory.ManyFactory;
import yo.one.creation.service.AdInterface;

public class ManyFactoryTest {
	
	public static void main(String args[]){
		ManyFactory factory = new ManyFactory();
		AdInterface liNingAd = factory.getLiNing();
		AdInterface nikeAd = factory.getNike();
		liNingAd.showAdWords();
		nikeAd.showAdWords();
	}
	
}
