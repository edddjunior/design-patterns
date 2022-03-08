package app.fastFood.after.original.builder;

public class FatMealBuilder extends FastFoodMealBuilder {

	@Override
	public void buildDrink() {
		meal.setDrink("milk shake");
	}

	@Override
	public void buildMain() {
		meal.setMain("triple cheddar bacon burger");
	}

	@Override
	public void buildSide() {
		meal.setSide("onion rings");
	}

	@Override
	public void buildDessert() {
		meal.setSide("large cake");
	}

	@Override
	public void buildGift() {
		meal.setGift("action figure");
	}
}
