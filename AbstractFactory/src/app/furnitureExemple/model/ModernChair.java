package app.furnitureExemple.model;

public class ModernChair implements Chair {

	@Override
	public boolean hasLegs() {
		return true;
	}

	@Override
	public void sitOn() {
		System.out.println("Sitting on the modern chair...");
	}
}
