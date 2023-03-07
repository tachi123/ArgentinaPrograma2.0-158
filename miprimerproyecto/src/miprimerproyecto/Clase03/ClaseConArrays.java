package miprimerproyecto.Clase03;

public class ClaseConArrays {

	public static void main(String[] args) {
		
		int numeros[] = new int[3];
		
		numeros[0] = 12;
		numeros[1] = 1;
		numeros[2] = 25;
		
		//System.out.println(numeros[10]);		
		
		System.out.println("Cantidad de elementos del array:"+numeros.length);
		
		System.out.println("Recorro el array desde el inicio");
		for(int i = 0; i < numeros.length ; i++) {
			System.out.println(numeros[i]);	
		}
		
		System.out.println("Recorro el array del final al principio");
		for(int i = (numeros.length - 1); i >= 0 ; i--) {
			System.out.println(numeros[i]);	
		}
		
		int numeros2[] = new int[]{1,5,8,6};
		
		int numeros3[] = {1,5,8,6,10};
		
		System.out.println("Ejemplo con elementos CHAR");
		
		
		char vocales[] = {'a','e','i','o','u'};
		
		System.out.println("For CLÁSICO que recorre un array");
		
		for(int j = 0 ; j < vocales.length ; j++) {
			char unaLetra = vocales[j];
			System.out.println(unaLetra);	
		}
		
		System.out.println("For que recorre un array");
		
		for(int  unaLetra : vocales) {
			System.out.println(unaLetra);
		}
		System.out.println("While que recorre un array");
		int k = 0;
		
		while(k < vocales.length) {
			System.out.println(vocales[k]);
			k++;
		}
		
		System.out.println(vocales);

	}
	
	
}