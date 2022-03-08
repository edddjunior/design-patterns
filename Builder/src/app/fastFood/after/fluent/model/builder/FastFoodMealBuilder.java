package app.fastFood.after.fluent.model.builder;

import app.fastFood.after.fluent.model.FastFoodMeal;

public class FastFoodMealBuilder {

	private String drink;
	private String main;
	private String side;
	private String dessert;
	private String gift;

	public FastFoodMealBuilder() {
	}

	public FastFoodMealBuilder withDrink(String drink) {
		this.drink = drink;
		return this;
	}

	public FastFoodMealBuilder withMain(String main) {
		this.main = main;
		return this;
	}

	public FastFoodMealBuilder withSide(String side) {
		this.side = side;
		return this;
	}

	public FastFoodMealBuilder withDessert(String dessert) {
		this.dessert = dessert;
		return this;
	}

	public FastFoodMealBuilder withGift(String gift) {
		this.gift = gift;
		return this;
	}

	public FastFoodMeal build() {
		return new FastFoodMeal(drink, main, side, dessert, gift);
	}
}
