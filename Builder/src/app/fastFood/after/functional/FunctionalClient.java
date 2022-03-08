package app.fastFood.after.functional;

import app.fastFood.after.functional.model.FastFoodMeal;

public class FunctionalClient {

	public static void orderBurgerCombo() {
		FastFoodMeal burgerCombo = new FastFoodMeal.Builder().withDrink("coke").withMain("cheese burger")
				.withSide("medium fries").withDessert("pudding").withGift("action figure").build();
		System.out.println(burgerCombo);
	}
}
