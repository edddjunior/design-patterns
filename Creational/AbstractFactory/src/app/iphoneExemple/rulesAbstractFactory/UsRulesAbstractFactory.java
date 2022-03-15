package app.iphoneExemple.rulesAbstractFactory;

import app.iphoneExemple.rulesAbstractFactory.certificate.Certificate;
import app.iphoneExemple.rulesAbstractFactory.certificate.USCertificate;

public class UsRulesAbstractFactory implements CountryRulesAbstractFactory {

	@Override
	public Certificate getCertificates() {
		return new USCertificate();
	}

}
