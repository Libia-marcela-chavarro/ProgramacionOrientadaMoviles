package Logic;

public abstract class BDatos implements Operaciones {
	
	protected String host;
	protected String nameDB;
	protected String user;
	protected String password;
	
	
	public BDatos (String pHost, String pNameDB, String pUser, String pPassword) {
		this.host= pHost;
		this.nameDB=pNameDB;
		this.user=pUser;
		this.password=pPassword;
	}
}
