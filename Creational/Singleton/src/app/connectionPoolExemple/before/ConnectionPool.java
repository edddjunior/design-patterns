package app.connectionPoolExemple.before;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {

	private static final int POOL_SIZE = 2;
	private List<Connection> connectionPool;

	public ConnectionPool() {
		System.out.println("Creating connection pool...");
		connectionPool = new ArrayList<Connection>();
		for (int i = 0; i < POOL_SIZE; i++) {
			connectionPool.add(new Connection());
		}
	}

	public Connection getConnection() {
		Connection available = null;
		for (Connection conn : connectionPool) {
			if (!conn.isInUse()) {
				available = conn;
				break;
			}
		}
		if (available == null) {
			System.out.println("No connections available.");
			return null;
		}
		available.setInUse(true);
		return available;
	}

}
