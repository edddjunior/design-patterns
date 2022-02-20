package app.furnitureExemple;

import app.furnitureExemple.factory.FurnitureFactory;
import app.furnitureExemple.factory.ModernFurnitureFactory;
import app.furnitureExemple.factory.VictorianFurnitureFactory;
import app.furnitureExemple.model.Chair;

public class FurnitureClient {

	public static void getFurniture() {
		FurnitureFactory modernFurnitureFactory = new ModernFurnitureFactory();
		FurnitureFactory victorianFurnitureFactory = new VictorianFurnitureFactory();
		Chair modernChair = modernFurnitureFactory.createChair();
		Chair victorianChair = victorianFurnitureFactory.createChair();

		System.out.println(modernChair.hasLegs());
		modernChair.sitOn();

		System.out.println(victorianChair.hasLegs());
		victorianChair.sitOn();
	}
}
