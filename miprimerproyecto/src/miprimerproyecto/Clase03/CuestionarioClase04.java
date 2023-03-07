package miprimerproyecto.Clase03;

public class CuestionarioClase04 {

	public static void main(String[] args) {
		
		String unString = "\\ \"  ";
		
		System.out.println(unString);
		
		//Segunda pregunta
		
		String txt2 = "hola que tal?";
		
		System.out.println(txt2.toUpperCase().replace("hola","chau"));
		
		//Tercero pregunta
		
		int numeros[] = new int[]{1,37,16};
		
		System.out.println(numeros[2]);

		
		//Cuarta pregunta
		//Dada la siguiente sentencia: 
		//String[] separado = "3_tristes tigres_del_13".split("_") , indique la opción correcta:
		
		String[] separado = "3_tristes tigres_del_13".split("_");
		// { "3", "tristes tigres", "del" , "13"}
		
		System.out.println("Cantidad de elementos:"+separado.length);
		
		System.out.println(separado[1]);
		
		
		//Quinta pregunta: Si tenemos el siguiente código, ¿cuál es la salida esperada?
		
		char letras[] = {'a','b','c','d'};

		int numeros2[] = new int[]{1,37,16};

		for(int i=0;i<numeros2.length;i++){
			if (numeros2[i] < 30) {
				System.out.println(letras[i+1]);
			} else {
				System.out.println(numeros2[i]);
			}
		}
		
		
	}

}
