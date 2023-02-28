package miprimerproyecto;

public class Clase01Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeroInicio = 5;
		int numeroFin = 14;
		// Se deberían mostrar los números:
		//5,6,7,8,9,10,11,12,13,14

		System.out.println("Inicia el item A del ejercicio 1");
		
		while(numeroInicio <= numeroFin) {
			
			System.out.println(numeroInicio);
			numeroInicio++; //numeroInicio = numeroInicio + 1;
		}
		
		
		System.out.println("Valor dentro de la variable Numero Inicio:"+numeroInicio);
		System.out.println("Valor dentro de la variable Numero Fin:"+numeroFin);
		
		System.out.println("Inicia el item B del ejercicio 1");

		numeroInicio = 5;
		
		while(numeroInicio <= numeroFin) {
			
			if(numeroInicio % 2 == 0) {
				System.out.println(numeroInicio);
			}

			numeroInicio++;
		}
		
		System.out.println("Valor dentro de la variable Numero Inicio:"+numeroInicio);
		System.out.println("Valor dentro de la variable Numero Fin:"+numeroFin);
		
		System.out.println("Inicia el item C del ejercicio 1");
		
		numeroInicio = 5;
		boolean esPar = true; //true -> se impriman los pares ; false los impares
		
		while(numeroInicio <= numeroFin) {
			
			if(numeroInicio % 2 == 0 && esPar) {
				System.out.println(numeroInicio);
			}
			
			if(numeroInicio % 2 != 0 && !esPar) {
				System.out.println(numeroInicio);
			}
			
			numeroInicio++;
		}
		
		
		System.out.println("Inicia OTRA FORMA DE HACER El item C del ejercicio 1");
		
		numeroInicio = 5;
		numeroFin = 14;
		char parOImpar = 'p'; // p es par .. i es impar
		while(numeroInicio <= numeroFin) {
			
			switch (parOImpar) {
				case 'p':
					if(numeroInicio % 2  == 0) {
						System.out.println(numeroInicio);
					}
					break;
				case 'i':
					if(numeroInicio % 2 != 0) {
						System.out.println(numeroInicio);
					}
					break;
				default:
					System.out.println("Opción ingresada incorrecta");
					break;
			}
			
			numeroInicio++;  
		}

		
		for(numeroInicio = 5;numeroInicio<=numeroFin;numeroInicio++) {
			
			if(numeroInicio % 2 == 0 && esPar) {
				System.out.println(numeroInicio);
			}
			
			if(numeroInicio % 2 != 0 && !esPar) {
				System.out.println(numeroInicio);
			}
			
		}
		
		
	}

}
