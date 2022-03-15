package app.factoryMethod;

public abstract class IPhoneFactory {

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
