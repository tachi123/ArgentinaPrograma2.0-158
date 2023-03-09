package miprimerproyecto.Clase05;

import java.util.Scanner;

public class EncodeYDecode {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Ingresa una frase");
		String frase = scn.nextLine();
		System.out.println("Ingresa el desplazamiento que quieras realizar");
		int desplazamiento = Integer.parseInt(scn.nextLine());
					
		System.out.println("Cantidad de veces que aparece la letra e en la frase:" + contarLetra(frase,'e'));

		byte[] decodedBytes = frase.getBytes();
		
		for(int j = 0 ; j < decodedBytes.length ; j++) {
			decodedBytes[j] = (byte) (decodedBytes[j] + desplazamiento);
		}
		
		frase = new String(decodedBytes);
		
		System.out.println(frase);
		

	}
	
	public static int contarLetra(String frase, char letra){

		int cuenta = 0; //contador

		for (int i = 0; i < frase.length(); i++){
			if( frase.charAt(i)  == letra){
					cuenta = cuenta + 1;
			}
		}
		return cuenta;
	}
	

}
