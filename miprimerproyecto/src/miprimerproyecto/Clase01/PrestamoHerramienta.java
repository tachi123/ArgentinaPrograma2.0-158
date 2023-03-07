package miprimerproyecto.Clase01;

import java.util.Scanner;

public class PrestamoHerramienta {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		boolean estaandando = true;
		String nombre;
		String herramienta;
		String accion;
		
		while(estaandando) {
			
			System.out.println("pedir o devolver");
			accion = sc.nextLine();
			
			if(accion.equals("devolver")) {
				System.out.println("Devolución de herramienta");
				
				System.out.println("Ingrese nombre de persona");
				nombre = sc.nextLine();
				System.out.println("Ingrese herramienta");
				herramienta = sc.nextLine();
				
				//ACA DEBERÍAMOS GRABAR EN LA BASE DE DATOS
			}
			else {
				System.out.println("Préstamo de herramienta");

				System.out.println("Ingrese nombre de persona");
				nombre = sc.nextLine();
				System.out.println("Ingrese herramienta");
				herramienta = sc.nextLine();
				
				//VERIFICAR QUE ESTE DISPONIBLE
				
				//ACA DEBERÍAMOS GRABAR EN LA BASE DE DATOS
			}
			
			
			System.out.println("¿Queres continuar? SI NO");
			accion = sc.nextLine();
			if(accion.equals("NO")) {
				estaandando = false;
			}
			
			
		}
	}

}
