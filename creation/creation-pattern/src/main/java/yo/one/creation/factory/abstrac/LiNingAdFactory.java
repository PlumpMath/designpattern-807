package yo.one.creation.factory.abstrac;

import yo.one.creation.service.AdInterface;
import yo.one.creation.service.LiNingAd;

public class LiNingAdFactory implements AbstractFactory {

	@Override
	public AdInterface provide() {
		return new LiNingAd();
	}

}
