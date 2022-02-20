package app.iphoneExemple;

import app.iphoneExemple.iphone.IPhoneXFactory;
import app.iphoneExemple.rulesAbstractFactory.BrazilianRulesAbstractFactory;
import app.iphoneExemple.rulesAbstractFactory.CountryRulesAbstractFactory;
import app.iphoneExemple.rulesAbstractFactory.UsRulesAbstractFactory;

public class IPhoneClient {

	public static void getIPhones() {
		CountryRulesAbstractFactory usRulesAbstractFactory = new UsRulesAbstractFactory();
		CountryRulesAbstractFactory brazilianRulesAbstractFactory = new BrazilianRulesAbstractFactory();

		IPhoneXFactory iPhoneXFactory = new IPhoneXFactory(usRulesAbstractFactory);
		IPhoneXFactory iPhone11Factory = new IPhoneXFactory(brazilianRulesAbstractFactory);

		iPhoneXFactory.orderIPhone();
		iPhone11Factory.orderIPhone();
	}
}
