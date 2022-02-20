package app;

import app.furnitureExemple.FurnitureClient;
import app.iphoneExemple.IPhoneClient;
import app.servicesExemple.ServicesClient;

public class Application {

	public static void main(String[] args) {

		// IMPORTANT
		// we use when we want to add different behaviors to families of objects
		// avoids hard couple
		// unique responsibility principle
		// open close principle

		// IPhones abstract factory exemple
		IPhoneClient.getIPhones();

		// Services abstract factory exemple
		ServicesClient.createAndCallServices();

		// Furniture abstract factory exemple
		FurnitureClient.getFurniture();
	}
}
