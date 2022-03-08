package app.fastFood.after.functional.model;

public class FastFoodMeal {

	private final String drink;
	private final String main;
	private final String side;
	private final String dessert;
	private final String gift;

	public FastFoodMeal(String drink, String main, String side, String dessert, String gift) {
		super();
		this.drink = drink;
		this.main = main;
		this.side = side;
		this.dessert = dessert;
		this.gift = gift;
	}

	public String getDrink() {
		return drink;
	}

	public String getMain() {
		return main;
	}

	public String getSide() {
		return side;
	}

	public String getDessert() {
		return dessert;
	}

	public String getGift() {
		return gift;
	}

	@Override
	public String toString() {
		return "FastFoodMeal [drink=" + drink + ", main=" + main + ", side=" + side + ", dessert=" + dessert + ", gift="
				+ gift + "]";
	}

	public static class Builder {

		private String drink;
		private String main;
		private String side;
		private String dessert;
		private String gift;

		public Builder withDrink(String drink) {
			this.drink = drink;
			return this;
		}

		public Builder withMain(String main) {
			this.main = main;
			return this;
		}

		public Builder withSide(String side) {
			this.side = side;
			return this;
		}

		public Builder withDessert(String dessert) {
			this.dessert = dessert;
			return this;
		}

		public Builder withGift(String gift) {
			this.gift = gift;
			return this;
		}

		public FastFoodMeal build() {
			return new FastFoodMeal(drink, main, side, dessert, gift);
		}
	}
}
