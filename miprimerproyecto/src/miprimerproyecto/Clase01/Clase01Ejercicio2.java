package miprimerproyecto.Clase01;

public class Clase01Ejercicio2 {
	
	public static void main(String[] args) {
		
		float ingresosMensuales = 100000;
		int cantidadVehiculosMenorA5anos = 3;
		int cantidadInmuebles = 1;
		int cantidadVehiculosLujo = 0; // Incluye embarcación, aeronave o titular de activos societarios
		
		if(
				ingresosMensuales >= 489083 ||
				cantidadVehiculosMenorA5anos >= 3 ||
				cantidadInmuebles >= 3 ||
				cantidadVehiculosLujo > 0
				) {
			System.out.print("El hogar pertenece al segmento de ingresos altos");
		} else {
			System.out.print("El hogar NO pertenece al segmento de ingresos altos");
		}
			
		
		
		
	}

}
