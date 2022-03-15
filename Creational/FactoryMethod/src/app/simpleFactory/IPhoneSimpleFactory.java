package app.simpleFactory;


public class IPhoneSimpleFactory {

	public static IPhone orderIPhone(String model) {
		IPhone device = null;
		
		if ("IPHONEX".equalsIgnoreCase(model)) {
			device = new IPhonex();
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
