package clases;

import clases.Entrada;
import java.util.Random;

public class Algoritmos {
	private static String nombre;
	private static String primerApellido;
	private static String segundoApellido;
	private static String anio;
	private static String mes;
	private static String dia;
	private static String genero;
	private static String entidad;
	
	public static String obtenerNombre() {
		return nombre + " " + primerApellido + " " + segundoApellido;
	}
	
	public static String generarCURP() {
		String CURP = "";
		Random numAleatorio = new Random();
		
		CURP += primerApellido.charAt( 0 );
		CURP += obtenerVocal( primerApellido, 0 );
		CURP += segundoApellido.charAt( 0 );
		CURP += nombre.charAt( 0 );
		
		CURP += anio.substring( 2 );
		
		if( mes.length() < 2 )
			CURP += '0' + mes;
		else
			CURP += mes;
		
		//Agrega los caracteres para el dia
		if( dia.length() < 2 )
			CURP += '0' + dia;
		else
			CURP += dia;
		
		CURP += genero.toUpperCase().charAt(0);
		
		CURP += generarEntidad( entidad );
		
		CURP += obtenerConsonante( primerApellido, 1 );
		
		CURP += obtenerConsonante( segundoApellido, 1 );
		
		CURP += obtenerConsonante( nombre, 1 );
		
		//genera la homoclave
		int numero = numAleatorio.nextInt(99-10+1) + 10;
		CURP += String.valueOf( numero );
		
		return CURP;
	}
	
	public static String generarRFC() {
		String RFC = "";
		Random numAleatorio = new Random();
		
		RFC += primerApellido.charAt( 0 );
		RFC += obtenerVocal( primerApellido, 0 );
		RFC += segundoApellido.charAt( 0 );
		RFC += nombre.charAt( 0 );
		
		RFC += anio.substring( 2 );
		
		if( mes.length() < 2 )
			RFC += '0' + mes;
		else
			RFC += mes;
		
		//Agrega los caracteres para el dia
		if( dia.length() < 2 )
			RFC += '0' + dia;
		else
			RFC += dia;
		
		//genera la homoclave
		int numero = numAleatorio.nextInt(999-100+1) + 100;
		RFC += String.valueOf( numero );
		
		return RFC;
	}
	
	public static void pedirDatos() {
		nombre = Entrada.cadena("Nombre: " );
		primerApellido = Entrada.cadena( "Primer apelldio: " );
		segundoApellido = Entrada.cadena( "Segundo Apellido: " );
		anio = Entrada.cadena( "Año de nacimiento: " );
		mes = Entrada.cadena( "Mes de nacimiento: " );
		dia = Entrada.cadena( "Dia de nacimienot: " );
		genero = Entrada.cadena( "Genero: " );
		entidad = Entrada.cadena( "Entidad de nacimiento: " );
		
	}
	
	public static void limpiarDatos() {
		nombre = null;
		primerApellido = null;
		segundoApellido = null;
		anio = null;
		mes = null;
		dia = null;
		entidad = null;
	}
	
	private static String obtenerConsonante( String cadena, int posicion ) {
		cadena = cadena.toUpperCase();
		
		for( int i = posicion; i < cadena.length(); i++ ) {
			if( cadena.charAt(i) != 'A' && cadena.charAt(i) != 'E' && cadena.charAt(i) != 'I' && 
				cadena.charAt(i) != 'O' && cadena.charAt(i) != 'U')
				return "" + cadena.charAt(i);
		}
		return "";
	}
	
	private static String obtenerVocal( String cadena, int posicion ) {
		cadena = cadena.toUpperCase();
		
		for( int i = posicion; i < cadena.length(); i++ ) {
			if( cadena.charAt(i) == 'A' || cadena.charAt(i) == 'E' || cadena.charAt(i) == 'I' || 
				cadena.charAt(i) == 'O' || cadena.charAt(i) == 'U')
				return "" + cadena.charAt(i);
		}
		return "";
	}
	
	private static String generarEntidad( String entidad ) {
		entidad = entidad.toUpperCase();
		
		if( entidad.equals( "AGUASCALIENTES" ) )
			return "AS";
		
		else if( entidad.equals( "BAJA CALIFORNIA" ) )
			return "BC";
		
		else if( entidad.equals( "BAJA CALIFORNIA SUR" ) )
			return "BS";
		
		else if( entidad.equals( "CAMPECHE" ) )
			return "CC";
		
		else if( entidad.equals( "COAHUILA" ) )
			return "CL";
		
		else if( entidad.equals( "COLIMA" ) )
			return "CM";
		
		else if( entidad.equals( "CHIAPAS" ) )
			return "CS";
		
		else if( entidad.equals( "CHIHUAHUA" ) )
			return "CH";
		
		else if( entidad.equals( "DISTRITO FEDERAL" ) )
			return "DF";
		
		else if( entidad.equals( "DURANGO" ) )
			return "DG";
		
		else if( entidad.equals( "GUANAJUATO" ) )
			return "GT";
		
		else if( entidad.equals( "GUERRERO" ) )
			return "GR";
		
		else if( entidad.equals( "HIDALGO" ) )
			return "HG";
		
		else if( entidad.equals( "JALISCO" ) )
			return "JC";
		
		else if( entidad.equals( "MEXICO" ) )
			return "MC";
		
		else if( entidad.equals( "MICHOACAN" ) )
			return "MN";
		
		else if( entidad.equals( "MORELOS" ) )
			return "MS";
		
		else if( entidad.equals( "NAYARIT" ) )
			return "NT";
		
		else if( entidad.equals( "NUEVO LEON" ) )
			return "NL";
		
		else if( entidad.equals( "OAXACA" ) )
			return "OC";
		
		else if( entidad.equals( "PUEBLA" ) )
			return "PL";

		else if( entidad.equals( "QUERETARO" ) )
			return "QT";
		
		else if( entidad.equals( "QUINTANA ROO" ) )
			return "QR";
		
		else if( entidad.equals( "SAN LUIS POTOSI" ) )
			return "SP";
		
		else if( entidad.equals( "SINALOA" ) )
			return "SL";
		
		else if( entidad.equals( "SONORA" ) )
			return "SR";
		
		else if( entidad.equals( "TABASCO" ) )
			return "TC";
		
		else if( entidad.equals( "TAMAULIPAS" ) )
			return "TS";
		
		else if( entidad.equals( "TLAXCALA" ) )
			return "TL";
		
		else if( entidad.equals( "VERACRUZ" ) )
			return "VZ";
		
		else if( entidad.equals( "YUCATAN" ) )
			return "YN";
		
		else if( entidad.equals( "ZACATECAS" ) )
			return "ZS";
		
		else if( entidad.equals( "NACIDO EN EL EXTRANJERO" ) )
			return "NE";
		
		else
			return "";
	}
}
