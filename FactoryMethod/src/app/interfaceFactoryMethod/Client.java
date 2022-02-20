package app.interfaceFactoryMethod;

public class Client {

	public static void run(String model) {
		if ("IPHONEX".equalsIgnoreCase(model)) {
			IPhoneXConcreteCreator iPhoneXCreator = new IPhoneXConcreteCreator();
			IPhone device = iPhoneXCreator.createIPhone();
			device.assemble();
			device.testCertificates();
			device.pack();
		}
		if ("IPHONE11".equalsIgnoreCase(model)) {
			IPhone11ConcreteCreator iPhone11Creator = new IPhone11ConcreteCreator();
			IPhone device = iPhone11Creator.createIPhone();
			device.assemble();
			device.testCertificates();
			device.pack();
		}
	}
}
