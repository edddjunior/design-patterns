package app.furnitureExemple.model;

public class VictorianChair implements Chair {

	@Override
	public boolean hasLegs() {
		return false;
	}

	@Override
	public void sitOn() {
		System.out.println("Sitting on the victorian chair...");
	}
}
