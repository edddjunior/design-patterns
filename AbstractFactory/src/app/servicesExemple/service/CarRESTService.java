package app.servicesExemple.service;

public class CarRESTService implements CarService {

	@Override
	public void save(String model) {
		System.out.println("REST Service - Saving car...");
	}

	@Override
	public void update(String model) {
		System.out.println("REST Service - Updating car...");
	}
}
