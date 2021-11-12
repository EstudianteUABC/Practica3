package clases;

public class Mexicano {
	private String nombre;
	private String CURP;
	private String RFC;
	
	public Mexicano(){
		nombre = null;
		CURP = null;
		RFC = null;
	}
	
	public void mostrarDatos() {
		System.out.println( "Nombre " + nombre );
		System.out.println( "CURP: " + CURP );
		System.out.println( "RFC: " + RFC );
		System.out.println( "" );
	}
	
	public void establecerNombre( String nombre ) {
		this.nombre = nombre;
	}
	
	public void establecerCURP( String CURP ) {
		this.CURP = CURP;
	}
	
	public void establecerRFC( String RFC ) {
		this.RFC = RFC;
	}
	
}
