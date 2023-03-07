package miprimerproyecto.Clase04;

public class Promedio {
	
	public static void main(String[] args) {
		
		int numeros[] = new int[] { 1, 37, 16};
		
		int resultado = sumatoria(numeros);
		
		resultado = resultado / numeros.length;
		
		//System.out.println(resultado);
		imprimirEnPantalla(resultado);
	}
	
	private static int sumatoria(int[] numerosASumar) {
		int suma = 0;
		for (int i = 0; i < numerosASumar.length; i++) {
			suma = suma + numerosASumar[i];
		}
		
		return suma;
	}
	
	private static void imprimirEnPantalla(int unString) {
		System.out.println(unString);
	}

}
