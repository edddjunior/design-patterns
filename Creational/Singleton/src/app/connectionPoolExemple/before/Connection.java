package app.connectionPoolExemple.before;

public class Connection {

	private boolean inUse;

	public Connection() {
		setInUse(false);
	}

	public void query(String sql) {
		System.out.println("Performing: " + sql);
	}

	public boolean isInUse() {
		return inUse;
	}

	public void setInUse(boolean inUse) {
		this.inUse = inUse;
	}
}
