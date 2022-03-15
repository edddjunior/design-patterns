package app.iphoneExemple.iphone;

import app.iphoneExemple.rulesAbstractFactory.CountryRulesAbstractFactory;

public class IPhoneX extends IPhone {

	public IPhoneX(CountryRulesAbstractFactory countryRules) {
		super(countryRules);
	}

	@Override
	public void getHardware() {
		System.out.println("Building IPhoneX...");
	}

}
