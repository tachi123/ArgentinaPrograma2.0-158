package miprimerproyecto.Clase03;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class EjercitacionClase03 {

	public static void main(String[] args) {
		
		
		System.out.println("a) Dado un String y una letra, que cuente la cantidad de apariciones de la letra en el String");

		String variableString = "Dado un String y una letra";
		char unaLetra = 'n';
		int cantVecesDeAparicion = 0;
		
		for(int i = 0; i < variableString.length(); i++) {
			if(variableString.charAt(i) == unaLetra) {
				cantVecesDeAparicion++;
			}		
		}
		
		System.out.println("Cantidad de veces que aparece la letra \""+unaLetra+"\": "+cantVecesDeAparicion);
		
		
		System.out.println("b) Dados 3 números y un orden (ascendente o decreciente) que ordene los mismos y los retorne en un vector de 3");
		
		Integer numeros[] = {-2,23,0};
		boolean ascendente = false; 

		if(ascendente) {
			//Ordenar de menor a mayor
			Arrays.sort(numeros);
		} else {
			//Ordenar de mayor a menor
			
			//Comparator.reverseOrder() o Collections.reverseOrder()
			Arrays.sort(numeros, Comparator.reverseOrder());
		}

		for(int elemento : numeros) {
			System.out.println(elemento);
		}

		System.out.println("c) dado un vector de números, y un número X, que sume todos los números > X y retorne el resultado");
		
		int vectorNumeros[] = {10,20,30,50,-2,50,-10};
		int x = 40;
		int sumatoriaDeNumeros = 0;
		
		for(int num : vectorNumeros) {
			if(num >= x) {
				sumatoriaDeNumeros = sumatoriaDeNumeros + num;
			}
		}
		
		System.out.println("La sumatoria de los valores mayores o iguales a \""+x+"\" es:"+sumatoriaDeNumeros);
		
	}

}
