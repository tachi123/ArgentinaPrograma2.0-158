package miprimerproyecto;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Sintaxis Básico
		char unaLetra = 'b';   
		boolean unValorBooleano = true;
		int miPrimerContador = 66;
		double unValor = 1.68;
		float otroNum = 2.344f;
		
		System.out.println(unaLetra);
		
		// OPERACIONES BASICAS
		int suma   = 10 + 20;		
		int resta  = 15 - 12;
		int mult   = 10 * 3;
		int div    = 8 / 3;
		int modulo = 8 % 3;
		
		
		int calculoCombinado = 3 * 2 + 3;
		int calculoCombinado2= 3 + 3 * 2;
		
		if(calculoCombinado == calculoCombinado2) {
			System.out.println("Si da igual");
		}else {
			System.out.println("El calculo combinado no se resuelve bien separando en términos");
		}
		
		System.out.print("Suma :");
		System.out.println(suma );
		
		suma = (int) 10.5;
		
		System.out.println("Suma :"+suma+" es el resultado de la suma de 10 + 20");
		
		
		//Prueba de creación de predicados y almacenar el resultado final de la evaluación en un boolean
		boolean booleandoPrueba = 10 > 20;
		System.out.println(booleandoPrueba);
		booleandoPrueba = 15 >= 12;
	    System.out.println(booleandoPrueba);
	    booleandoPrueba = 10 == 3;
	    System.out.println(booleandoPrueba);
	    booleandoPrueba = 8 != 3;
	    System.out.println(booleandoPrueba);
	    
	    //Prueba de predicados múltiples
	    boolean unBooleano = true;
	    boolean otroBooleano = false;
	    System.out.println("NOT:"+!unBooleano); // false
	    System.out.println("AND:"+ (unBooleano && otroBooleano));// false
	    System.out.println("OR:"+ (unBooleano || otroBooleano ));// true SE ANALIZAN AMBOS OPERANDOS
	    System.out.println("Múltiple:"+ (unBooleano && (otroBooleano || true)));// true   
		
	    int unNum = 5;
	    
	    if(unNum > 10) {
	    	System.out.println("Es mayor a 10");
	    }else {
	    	System.out.println("No es mayor a 10");
	    }
	    
	}

}
