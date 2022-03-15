package app.fastFood;

import app.fastFood.after.fluent.FluentClient;
import app.fastFood.after.functional.FunctionalClient;
import app.fastFood.after.original.OriginalClient;
import app.fastFood.after.original.builder.FatMealBuilder;
import app.fastFood.after.original.builder.JustFriesBuilder;
import app.fastFood.before.ClientBefore;
import app.fastFood.before.FastFoodMeal;
import app.fastFood.singleClass.SIngleClassClient;

public class Application {

	public static void main(String[] args) {

		// IMPORTANT
		// The builder pattern is ideal to be used when we have a lot of optional fields
		// so we don't have to overload the constructor
		// the fluent api approach is very different from the original
		// we can isolate the construction logic of the business logic
		// we must consider some things before trying the single class approach as it
		// breaks the solid
		// also, the traditional way requires certain code duplication

		// before pattern
		FastFoodMeal burgerCombo = ClientBefore.burgerCombo();
		System.out.println(burgerCombo.toString());

		FastFoodMeal justFries = ClientBefore.justFries();
		System.out.println(justFries.toString());

		FastFoodMeal heartAttackCombo = ClientBefore.heartAttackCombo();
		System.out.println(heartAttackCombo.toString());

		// original builder pattern
		OriginalClient.order("fat meal", new FatMealBuilder());
		OriginalClient.order("just fries", new JustFriesBuilder());

		// fluent builder pattern
		System.out.println("fluent api");
		FluentClient.burgerCombo();

		// functional builder pattern
		System.out.println("functional fluent api");
		FunctionalClient.orderBurgerCombo();

		// single class / setter builder pattern
		System.out.println("single class / setter builder");
		SIngleClassClient.orderFriesAndShake();
	}
}
