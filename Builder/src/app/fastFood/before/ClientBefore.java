package app.fastFood.before;

public class ClientBefore {

	public static FastFoodMeal burgerCombo() {
		return new FastFoodMeal("coke", "cheese burger", "fries");
	}

	public static FastFoodMeal justFries() {
		return new FastFoodMeal(null, null, "fries");
	}

	public static FastFoodMeal heartAttackCombo() {
		return new FastFoodMeal("milk shake", "monster burger", "large fries", "chocolate cake", "action figure");
	}
}
