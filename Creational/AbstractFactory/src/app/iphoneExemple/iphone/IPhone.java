package app.iphoneExemple.iphone;

import app.iphoneExemple.rulesAbstractFactory.CountryRulesAbstractFactory;

public abstract class IPhone {
	
	private CountryRulesAbstractFactory countryRules;

	public IPhone(CountryRulesAbstractFactory countryRules) {
		super();
		this.countryRules = countryRules;
	}

	public CountryRulesAbstractFactory getCountryRules() {
		return countryRules;
	}
	public void setCountryRules(CountryRulesAbstractFactory countryRules) {
		this.countryRules = countryRules;
	}

	public abstract void getHardware();

	public void assemble() {
		System.out.println("Assembling all hardware...");
	}

	public void testCertificates() {
		System.out.println("Testing certificates...");
		System.out.println(countryRules.getCertificates().applyCertificaton());
	}

	public void pack() {
		System.out.println("Packing product...");
	}
}
