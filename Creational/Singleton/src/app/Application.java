package app;

import app.connectionPoolExemple.after.ConnectionPoolClientAfter;
import app.connectionPoolExemple.before.ConnectionPoolClientBefore;

public class Application {

	public static void main(String[] args) {

		// before singleton

		// it's not what we expect in such scenerio
		// what we want is that when we create a ConnectionPool, it cannot be created
		// again, so the pool will not multiply it's doing

		ConnectionPoolClientBefore.doQuery1();
		ConnectionPoolClientBefore.doQuery2();
		ConnectionPoolClientBefore.doQuery3();

		// after singleton

		// as our pool size is 2, we can only perform 2 queries and we're not able to
		// get another instance of ConnectionPool

		// we use it when we need to control access to a shared resource from our
		// application
		// but it's very unrecommended that we use singletons
		// there's just a few acceptable uses in normal apps: a simple logger for
		// exemple

		ConnectionPoolClientAfter.doQuery1();
		ConnectionPoolClientAfter.doQuery2();
		ConnectionPoolClientAfter.doQuery3();
	}
}
