package yo.one.creation.factory;

import yo.one.creation.service.AdInterface;
import yo.one.creation.service.LiNingAd;
import yo.one.creation.service.NikeAd;

public class ManyFactory {
	
	public AdInterface getNike(){
		return new NikeAd();
	}
	
	public AdInterface getLiNing(){
		return new LiNingAd();
	}
}
