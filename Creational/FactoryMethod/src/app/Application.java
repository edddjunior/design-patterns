package app;

import app.factoryMethod.IPhone11Factory;
import app.factoryMethod.IPhoneXFactory;
import app.interfaceFactoryMethod.IPhone11ConcreteCreator;
import app.interfaceFactoryMethod.IPhoneXConcreteCreator;
import app.simpleFactory.IPhoneSimpleFactory;

public class Application {

	public static void main(String[] args) {

		// IMPORTANT
		// The factory method is not meant to replace conditionals, but to create
		// complex objects that extend to various behaviors
		// The idea is to create different objects from a superclass
		// This way, we don't have to hard couple the object to the client
		// We can add new objects without break existing code
		// We keep creational code in a single place
		// The base creator class does not properly create an object, but it usually
		// holds business logic
		// In this exemple, it asks the concrete creator to build the object and then
		// performs some logic based on its interface
		// The thing is that we have a logic primarily, and then we add objects to be
		// handled to this logic
		// EX: We have a payment system. so we have to be able to work with different
		// gateways

		// before pattern
		app.before.Client.orderIPhone("IPHONEX");
		app.before.Client.orderIPhone("IPHONE11");

		// simple factory
		IPhoneSimpleFactory.orderIPhone("IPHONEX");
		IPhoneSimpleFactory.orderIPhone("IPHONE11");

		// factory method
		IPhoneXFactory iPhoneXFactory = new IPhoneXFactory();
		iPhoneXFactory.orderIPhone();
		IPhone11Factory iPhone11Factory = new IPhone11Factory();
		iPhone11Factory.orderIPhone();

		// factory method with interface
		IPhoneXConcreteCreator iPhoneXCreator = new IPhoneXConcreteCreator();
		iPhoneXCreator.orderIPhone();
		IPhone11ConcreteCreator iPhone11Creator = new IPhone11ConcreteCreator();
		iPhone11Creator.orderIPhone();
	}

}
