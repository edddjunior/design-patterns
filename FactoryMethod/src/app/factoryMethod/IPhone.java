package app.factoryMethod;

public abstract class IPhone {

	public abstract void getHardware();

	public void assemble() {
		System.out.println("Assembling all hardware...");
	}

	public void testCertificates() {
		System.out.println("Testing certificates...");
	}

	public void pack() {
		System.out.println("Packing product...");
	}
}
