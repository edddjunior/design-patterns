package app.servicesExemple.service;

public class CarSOAPService implements CarService {

	@Override
	public void save(String model) {
		System.out.println("SOAP Service - Saving car...");
	}

	@Override
	public void update(String model) {
		System.out.println("SOAP Service - Updating car...");
	}
}
