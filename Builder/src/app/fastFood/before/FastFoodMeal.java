package app.fastFood.before;

@SuppressWarnings("unused")
public class FastFoodMeal {

	private String drink;
	private String main;
	private String side;
	private String dessert;
	private String gift;

	public FastFoodMeal(String drink) {
		this.drink = drink;
	}

	public FastFoodMeal(String drink, String main) {
		this.drink = drink;
		this.main = main;
	}

	public FastFoodMeal(String drink, String main, String side) {
		this.drink = drink;
		this.main = main;
		this.side = side;
	}

	public FastFoodMeal(String drink, String main, String side, String dessert) {
		this.drink = drink;
		this.main = main;
		this.side = side;
		this.dessert = dessert;
	}

	public FastFoodMeal(String drink, String main, String side, String dessert, String gift) {
		this.drink = drink;
		this.main = main;
		this.side = side;
		this.dessert = dessert;
		this.gift = gift;
	}

	@Override
	public String toString() {
		return "FastFoodMeal [drink=" + drink + ", main=" + main + ", side=" + side + ", dessert=" + dessert + ", gift="
				+ gift + "]";
	}
}
