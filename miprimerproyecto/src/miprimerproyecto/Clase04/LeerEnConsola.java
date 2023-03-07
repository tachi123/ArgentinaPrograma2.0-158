package miprimerproyecto.Clase04;

import java.util.Scanner;

public class LeerEnConsola {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Ingrese números separados por UN espacio");
		
		String numeros = scn.nextLine();
		
		int resultado = 0;
		
		for (String numeroStr : numeros.split(" ")) {
			int numero = Integer.parseInt(numeroStr);
			resultado = resultado + numero;
		}
		
		System.out.println(resultado);
		

	}

}
