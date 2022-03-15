package app.iphoneExemple.rulesAbstractFactory.certificate;

public class USCertificate implements Certificate {

	@Override
	public String applyCertificaton() {
		return "Applying US rules...";
	}
}
