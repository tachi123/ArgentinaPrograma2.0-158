package miprimerproyecto;

import java.util.Scanner;

public class ContabilidadHerramientas {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean terminoElPrograma = false;
		
		String accion = "NO";
		
		while(!terminoElPrograma) {
			System.out.println("Ingreso al ciclo WHILE");
			
			
			
			
			
			System.out.println("¿Queres terminar el programa? SI NO");
			
			accion = scanner.nextLine();
			if(accion.equals("SI")) {
				terminoElPrograma = true;
			}
		}

	}

}
