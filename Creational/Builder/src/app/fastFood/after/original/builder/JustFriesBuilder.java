package app.fastFood.after.original.builder;

public class JustFriesBuilder extends FastFoodMealBuilder {

	@Override
	public void buildDrink() {
	}

	@Override
	public void buildMain() {
	}

	@Override
	public void buildSide() {
		meal.setSide("large fries");
	}

	@Override
	public void buildDessert() {
	}

	@Override
	public void buildGift() {
	}
}
