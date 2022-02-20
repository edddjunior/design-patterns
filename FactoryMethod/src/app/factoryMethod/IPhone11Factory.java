package app.factoryMethod;

public class IPhone11Factory extends IPhoneFactory {

	@Override
	public IPhone createIPhone() {
		return new IPhone11();
	}
}
