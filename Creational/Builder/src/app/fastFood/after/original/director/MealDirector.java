package app.fastFood.after.original.director;

import app.fastFood.after.original.builder.FastFoodMealBuilder;
import app.fastFood.after.original.model.FastFoodMeal;

public class MealDirector {

	private FastFoodMealBuilder builder;

	public MealDirector(FastFoodMealBuilder builder) {
		this.builder = builder;
	}

	public void constructCombo() {
		builder.buildDrink();
		builder.buildMain();
		builder.buildSide();
		builder.buildDessert();
		builder.buildGift();
	}

	public FastFoodMeal getCombo() {
		return builder.getMeal();
	}
}
