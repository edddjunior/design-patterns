package app.servicesExemple.service;

public class UserRESTService implements UserService {

	@Override
	public void save(String name) {
		System.out.println("REST Service - Saving user...");
	}

	@Override
	public void update(String name) {
		System.out.println("REST Service - Updating user...");
	}
}
