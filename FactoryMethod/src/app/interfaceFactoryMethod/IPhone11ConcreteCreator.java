package app.interfaceFactoryMethod;

public class IPhone11ConcreteCreator extends IphoneBaseCreator {

	@Override
	public IPhone createIPhone() {
		return new IPhone11();
	}
}
