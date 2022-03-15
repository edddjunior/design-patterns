package app.interfaceFactoryMethod;

public class IPhone11 implements IPhone {

	@Override
	public void getHardware() {
		System.out.println("Building IPhone11...");
	}

	@Override
	public void assemble() {
		System.out.println("Assembling IPhone11's hardware...");
	}

	@Override
	public void testCertificates() {
		System.out.println("Testing IPhone11's certificates...");
	}

	@Override
	public void pack() {
		System.out.println("Packing IPhone 11...");
	}
}
