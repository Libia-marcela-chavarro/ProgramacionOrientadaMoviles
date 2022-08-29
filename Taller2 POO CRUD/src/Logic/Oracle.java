package Logic;

public class Oracle extends BDatos {

	public Oracle(String pHost, String pNameDB, String pUser, String pPassword) {
		super(pHost, pNameDB, pUser, pPassword);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void conectar() {
		System.out.println("Conectando a Oracle con: ");	
		System.out.println("host: " + host);
		System.out.println("Nombre base datos: " + nameDB);
		System.out.println("User: " + user);
		
	}

	@Override
	public void consultar() {
		System.out.println("Consultando todos los datos de la tabla en Oracle");		
		
	}

	@Override
	public void insertar(int id) {
		System.out.println("Insertando dato con el ID " +user + "a base de datos de Oracle");		
		
	}

	@Override
	public void eliminar(int id) {
		System.out.println("Eliminando dato con el ID " +user + "a base de datos de Oracle");		
		
	}
	
}
