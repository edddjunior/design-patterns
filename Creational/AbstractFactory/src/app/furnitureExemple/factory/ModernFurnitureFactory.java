package app.furnitureExemple.factory;

import app.furnitureExemple.model.Chair;
import app.furnitureExemple.model.ModernChair;

public class ModernFurnitureFactory implements FurnitureFactory {

	@Override
	public Chair createChair() {
		return new ModernChair();
	}
}
