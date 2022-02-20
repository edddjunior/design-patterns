package app.iphoneExemple.rulesAbstractFactory.certificate;

public class BrazilianCertificate implements Certificate {

	@Override
	public String applyCertificaton() {
		return "Applying brazilian rules...";
	}
}
