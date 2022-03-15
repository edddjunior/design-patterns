package app.servicesExemple;

import app.servicesExemple.service.CarService;
import app.servicesExemple.service.UserService;
import app.servicesExemple.service.factory.RESTAbstractFactory;
import app.servicesExemple.service.factory.SOAPAbstractFactory;
import app.servicesExemple.service.factory.ServicesAbstractFactory;

public class ServicesClient {

	public static void createAndCallServices() {
		ServicesAbstractFactory restFactory = new RESTAbstractFactory();

		UserService userServiceREST = restFactory.getUserService();
		CarService carServiceREST = restFactory.getCarService();

		ServicesAbstractFactory soapFactory = new SOAPAbstractFactory();

		UserService userServiceSOAP = soapFactory.getUserService();
		CarService carServiceSOAP = soapFactory.getCarService();

		// update does not make any sense lol

		userServiceREST.save("John Doe");
		userServiceREST.update("Mark Hen");

		userServiceSOAP.save("John Doe");
		userServiceSOAP.update("Mark Hen");
		
		carServiceREST.save("Prius");
		carServiceREST.update("Civic");

		carServiceSOAP.save("Prius");
		carServiceSOAP.update("Civic");
	}
}
