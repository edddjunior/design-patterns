package app.servicesExemple.service.factory;

import app.servicesExemple.service.CarSOAPService;
import app.servicesExemple.service.CarService;
import app.servicesExemple.service.UserSOAPService;
import app.servicesExemple.service.UserService;

public class SOAPAbstractFactory extends ServicesAbstractFactory {

	@Override
	public UserService getUserService() {
		return new UserSOAPService();
	}

	@Override
	public CarService getCarService() {
		return new CarSOAPService();
	}
}
