package app.fastFood.singleClass;

import app.fastFood.singleClass.model.FastFoodMeal;

public class SIngleClassClient {

	public static void orderFriesAndShake() {
		FastFoodMeal friesAndShake = new FastFoodMeal().withDrink("milk shake").withSide("fries").build();
		System.out.println("ordering fries and shake");
		System.out.println(friesAndShake.toString());
	}
}
