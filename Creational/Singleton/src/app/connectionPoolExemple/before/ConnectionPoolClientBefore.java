package app.connectionPoolExemple.before;

public class ConnectionPoolClientBefore {

	public static void doQuery1() {
		ConnectionPool pool = new ConnectionPool();
		Connection conn = pool.getConnection();
		if (conn != null) {
			conn.query("select * from users;");
		}
	}

	public static void doQuery2() {
		ConnectionPool pool = new ConnectionPool();
		Connection conn = pool.getConnection();
		if (conn != null) {
			conn.query("select * from cars;");
		}
	}

	public static void doQuery3() {
		ConnectionPool pool = new ConnectionPool();
		Connection conn = pool.getConnection();
		if (conn != null) {
			conn.query("select * from machines;");
		}
	}
}
