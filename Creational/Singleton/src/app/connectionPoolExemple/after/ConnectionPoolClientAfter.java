package app.connectionPoolExemple.after;

public class ConnectionPoolClientAfter {

	public static void doQuery1() {
		ConnectionPool pool = ConnectionPool.getInstance();
		Connection conn = pool.getConnection();
		if (conn != null) {
			conn.query("select * from users;");
		}
	}

	public static void doQuery2() {
		ConnectionPool pool = ConnectionPool.getInstance();
		Connection conn = pool.getConnection();
		if (conn != null) {
			conn.query("select * from cars;");
		}
	}

	public static void doQuery3() {
		ConnectionPool pool = ConnectionPool.getInstance();
		Connection conn = pool.getConnection();
		if (conn != null) {
			conn.query("select * from machines;");
		}
	}
}
