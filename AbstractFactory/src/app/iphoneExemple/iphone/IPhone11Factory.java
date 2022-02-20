package app.iphoneExemple.iphone;

import app.iphoneExemple.rulesAbstractFactory.CountryRulesAbstractFactory;

public class IPhone11Factory extends IPhoneFactory {

	public IPhone11Factory(CountryRulesAbstractFactory countryRules) {
		super(countryRules);
	}

	@Override
	public IPhone createIPhone() {
		return new IPhone11(countryRules);
	}
}
