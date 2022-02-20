package app.iphoneExemple.iphone;

import app.iphoneExemple.rulesAbstractFactory.CountryRulesAbstractFactory;

public class IPhone11 extends IPhone {

	public IPhone11(CountryRulesAbstractFactory countryRules) {
		super(countryRules);
	}

	@Override
	public void getHardware() {
		System.out.println("Building IPhone11...");
	}
}
