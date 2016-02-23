package yo.one.creation.test;

import yo.one.creation.factory.abstrac.AbstractFactory;
import yo.one.creation.factory.abstrac.LiNingAdFactory;
import yo.one.creation.factory.abstrac.NikeAdFactory;
import yo.one.creation.service.AdInterface;


public class AbstractFactoryTest {
	
	public static void main(String args[]){
		
		AbstractFactory nikeAbs = new NikeAdFactory();
		AdInterface nikeAd = nikeAbs.provide();
		nikeAd.showAdWords();
		
		AbstractFactory liNingAbs = new LiNingAdFactory();
		AdInterface liNingAds = liNingAbs.provide();
		liNingAds.showAdWords();
	}
	
}
