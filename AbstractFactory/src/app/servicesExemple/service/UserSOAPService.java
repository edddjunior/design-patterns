package app.servicesExemple.service;

public class UserSOAPService implements UserService {

	@Override
	public void save(String name) {
		System.out.println("SOAP Service - Saving user...");
	}

	@Override
	public void update(String name) {
		System.out.println("SOAP Service - Updating user...");
	}
}
