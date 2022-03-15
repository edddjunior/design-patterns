package app.fastFood.after.fluent;

import app.fastFood.after.fluent.model.FastFoodMeal;
import app.fastFood.after.fluent.model.builder.FastFoodMealBuilder;

public class FluentClient {

	public static void burgerCombo() {
		FastFoodMeal burgerCombo = new FastFoodMealBuilder().withDrink("coke").withMain("chicken sandwich")
				.withSide("fries").withDessert("apple pie").withGift("toy").build();
		System.out.println(burgerCombo.toString());
	}
}
