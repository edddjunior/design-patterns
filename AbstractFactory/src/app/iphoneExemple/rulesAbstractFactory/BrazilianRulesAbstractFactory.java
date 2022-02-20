package app.iphoneExemple.rulesAbstractFactory;

import app.iphoneExemple.rulesAbstractFactory.certificate.BrazilianCertificate;
import app.iphoneExemple.rulesAbstractFactory.certificate.Certificate;

public class BrazilianRulesAbstractFactory implements CountryRulesAbstractFactory {

	@Override
	public Certificate getCertificates() {
		return new BrazilianCertificate();
	}
}
