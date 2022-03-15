package app.interfaceFactoryMethod;

public class IPhoneXConcreteCreator extends IphoneBaseCreator {

	@Override
	public IPhone createIPhone() {
		return new IPhoneX();
	}
}
