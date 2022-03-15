package app.servicesExemple.service.factory;

import app.servicesExemple.service.CarRESTService;
import app.servicesExemple.service.CarService;
import app.servicesExemple.service.UserRESTService;
import app.servicesExemple.service.UserService;

public class RESTAbstractFactory extends ServicesAbstractFactory {

	@Override
	public UserService getUserService() {
		return new UserRESTService();
	}

	@Override
	public CarService getCarService() {
		return new CarRESTService();
	}

}
