package app.factoryMethod;

public class IPhoneXFactory extends IPhoneFactory {

	@Override
	public IPhone createIPhone() {
		return new IPhoneX();
	}
}
