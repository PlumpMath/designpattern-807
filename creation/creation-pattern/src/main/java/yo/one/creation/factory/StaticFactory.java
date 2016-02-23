package yo.one.creation.factory;

import yo.one.creation.service.AdInterface;
import yo.one.creation.service.LiNingAd;
import yo.one.creation.service.NikeAd;

public class StaticFactory {
	
	public static AdInterface getNike(){
		return new NikeAd();
	}
	
	public static AdInterface getLiNing(){
		return new LiNingAd();
	}
}
