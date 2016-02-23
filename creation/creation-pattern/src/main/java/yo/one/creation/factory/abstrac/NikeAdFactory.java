package yo.one.creation.factory.abstrac;

import yo.one.creation.service.AdInterface;
import yo.one.creation.service.NikeAd;

public class NikeAdFactory implements AbstractFactory {

	@Override
	public AdInterface provide() {
		return new NikeAd();
	}

}
