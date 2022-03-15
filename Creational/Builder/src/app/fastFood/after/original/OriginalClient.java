package app.fastFood.after.original;

import app.fastFood.after.original.builder.FastFoodMealBuilder;
import app.fastFood.after.original.director.MealDirector;

public class OriginalClient {

	public static void order(String name, FastFoodMealBuilder builder) {
		System.out.println("ordering a " + name);
		MealDirector director = new MealDirector(builder);
		director.constructCombo();
		System.out.println(director.getCombo().toString());
	}
}
