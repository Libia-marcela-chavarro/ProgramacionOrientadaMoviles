package Logic;

public class Main {

	public static void main(String[] args) {
		
		BDatos bdPostgres = new Postgres("localhost", "miBase1", "root", "");
		// CRUD
		bdPostgres.conectar();
		bdPostgres.consultar();
		bdPostgres.insertar(1);
		bdPostgres.eliminar(1);
		System.out.println("\n");
		
		BDatos bdOracle = new Oracle("localhost", "miBase2", "root", "");
		// CRUD
		bdOracle.conectar();
		bdOracle.consultar();
		bdOracle.insertar(2);
		bdOracle.eliminar(2);
	}

}
