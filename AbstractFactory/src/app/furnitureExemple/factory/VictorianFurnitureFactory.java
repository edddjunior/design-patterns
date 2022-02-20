package app.furnitureExemple.factory;

import app.furnitureExemple.model.Chair;
import app.furnitureExemple.model.VictorianChair;

public class VictorianFurnitureFactory implements FurnitureFactory {

	@Override
	public Chair createChair() {
		return new VictorianChair();
	}
}
