package app.iphoneExemple.iphone;

import app.iphoneExemple.rulesAbstractFactory.CountryRulesAbstractFactory;

public class IPhoneXFactory extends IPhoneFactory {

	public IPhoneXFactory(CountryRulesAbstractFactory countryRules) {
		super(countryRules);
	}

	@Override
	public IPhone createIPhone() {
		return new IPhoneX(countryRules);
	}
}
