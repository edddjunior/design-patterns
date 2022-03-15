package app.servicesExemple.service.factory;

import app.servicesExemple.service.CarService;
import app.servicesExemple.service.UserService;

public abstract class ServicesAbstractFactory {

	public abstract UserService getUserService();

	public abstract CarService getCarService();
}
