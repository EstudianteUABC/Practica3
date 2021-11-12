import clases.Mexicano;
import clases.Algoritmos;

public class Practica3 {
	public static void main(String[] args) {
		Mexicano mexicano1 = new Mexicano();
		Mexicano mexicano2 = new Mexicano();
		Mexicano mexicano3 = new Mexicano();
		
		//Mexicano1
		Algoritmos.pedirDatos();
		mexicano1.establecerNombre( Algoritmos.obtenerNombre() );
		mexicano1.establecerCURP( Algoritmos.generarCURP() );
		mexicano1.mostrarDatos();
		Algoritmos.limpiarDatos(); //limpa los datos static para ingresar los datos de un nuevo usuario.
		
		//Mexicano1
		Algoritmos.pedirDatos();
		mexicano2.establecerNombre( Algoritmos.obtenerNombre() );
		mexicano2.establecerRFC( Algoritmos.generarRFC() );
		mexicano2.mostrarDatos();
		Algoritmos.limpiarDatos();
		
		//Mexicano1
		Algoritmos.pedirDatos();
		mexicano3.establecerNombre( Algoritmos.obtenerNombre() );
		mexicano3.establecerCURP( Algoritmos.generarCURP() );
		mexicano3.establecerRFC( Algoritmos.generarRFC() );
		mexicano3.mostrarDatos();
		Algoritmos.limpiarDatos();
	}
}
