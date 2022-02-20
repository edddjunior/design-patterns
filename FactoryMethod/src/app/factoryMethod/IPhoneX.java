package app.factoryMethod;

public class IPhoneX extends IPhone {

	@Override
	public void getHardware() {
		System.out.println("Building IPhoneX...");
	}

}
