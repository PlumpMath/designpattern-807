package yo.one.creation.factory;

import yo.one.creation.service.AdInterface;
import yo.one.creation.service.LiNingAd;
import yo.one.creation.service.NikeAd;

public class CommonFactory {
	
	public AdInterface produce(String type){
		if(null != type && type.length() > 0){
			if(type.equals("nike")){
				return new NikeAd();
			}else if(type.equals("LiNing")){
				return new LiNingAd();
			}else{
				return null;
			}
		}
		return null;
	};
	
}
