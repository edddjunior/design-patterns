package app.simpleFactory;

public class IPhonex extends IPhone {

	@Override
	public void getHardware() {
		System.out.println("Building IPhoneX...");
	}
}
