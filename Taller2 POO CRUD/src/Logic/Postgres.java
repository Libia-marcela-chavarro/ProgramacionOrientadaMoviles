package Logic;

public class Postgres extends BDatos{

	public Postgres(String pHost, String pNameDB, String pUser, String pPassword) {
		super(pHost, pNameDB, pUser, pPassword);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void conectar() {
		System.out.println("Conectando a postgres con: ");
		System.out.println("host: " + host);
		System.out.println("Nombre base datos: " + nameDB);
		System.out.println("User: " + user);

		
	}

	@Override
	public void consultar() {
		System.out.println("Consultando todos los datos de la tabla en postgres...");	
		
	}

	@Override
	public void insertar(int id) {
		System.out.println("Insertando a postgres");
		
		
	}

	@Override
	public void eliminar(int id) {
		System.out.println("Eliminando de postgres");	
		
	}

}
