package app.interfaceFactoryMethod;

public class Client {

	public static void run(String model) {
		if ("IPHONEX".equalsIgnoreCase(model)) {
			IPhoneXConcreteCreator iPhoneXCreator = new IPhoneXConcreteCreator();
			iPhoneXCreator.orderIPhone();
		}
		if ("IPHONE11".equalsIgnoreCase(model)) {
			IPhone11ConcreteCreator iPhone11Creator = new IPhone11ConcreteCreator();
			iPhone11Creator.orderIPhone();
		}
	}
}
