package app.iphoneExemple.iphone;

import app.iphoneExemple.rulesAbstractFactory.CountryRulesAbstractFactory;

public abstract class IPhoneFactory {
	
	CountryRulesAbstractFactory countryRules;

	public IPhoneFactory(CountryRulesAbstractFactory countryRules) {
		super();
		this.countryRules = countryRules;
	}

	public abstract IPhone createIPhone();

	public IPhone orderIPhone() {
		IPhone device = null;
		device = createIPhone();
		device.getHardware();
		device.assemble();
		device.testCertificates();
		device.pack();
		return device;
	}
}
