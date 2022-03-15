package app.before;

public class Client {

	public static IPhone orderIPhone(String model) {
		IPhone device = null;
		if ("IPHONEX".equalsIgnoreCase(model)) {
			device = new IPhoneX();
		}
		if ("IPHONE11".equalsIgnoreCase(model)) {
			device = new IPhone11();
		}

		device.getHardware();
		device.assemble();
		device.testCertificates();
		device.pack();
		return device;
	}
}
