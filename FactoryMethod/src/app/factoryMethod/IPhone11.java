package app.factoryMethod;

public class IPhone11 extends IPhone {

	@Override
	public void getHardware() {
		System.out.println("Building IPhone11...");
	}
}
