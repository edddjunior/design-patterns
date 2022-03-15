package app.interfaceFactoryMethod;

public class IPhoneX implements IPhone {

	@Override
	public void getHardware() {
		System.out.println("Building IPhoneX...");
	}

	@Override
	public void assemble() {
		System.out.println("Assembling IPhoneX's hardware...");
	}

	@Override
	public void testCertificates() {
		System.out.println("Testing IPhoneX's certificates...");
	}

	@Override
	public void pack() {
		System.out.println("Packing IPhoneX...");
	}
}
