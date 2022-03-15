package app.interfaceFactoryMethod;

public abstract class IphoneBaseCreator {

	public abstract IPhone createIPhone();
	
	public IPhone orderIPhone() {
		IPhone device = createIPhone();
		device.getHardware();
		device.assemble();
		device.testCertificates();
		device.pack();
		return device;
	}
}
