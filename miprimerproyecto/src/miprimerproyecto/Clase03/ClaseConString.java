package miprimerproyecto.Clase03;

public class ClaseConString {

	public static void main(String[] args) {

		String unaOracion = "Hola clase!";
		
		System.out.println(unaOracion);
		
		System.out.println("La longitud de la oracion:"+ unaOracion.length() );
		
		String concatenacion = "Mostrar el caracter que esta en la posición: \"" + unaOracion.charAt(4) + "\".";
		
		System.out.println(concatenacion);
		
		String txt1 = "Hola clase!";
		String txt2 = "hola clase!";
		
		if(txt1.equalsIgnoreCase(txt2)) {
			System.out.println("Si, son iguales");
		}else {
			System.out.println("No son iguales");
		}
		
		if(txt1.contains("Hola")) {
			System.out.println("Si la contine");
		}
		
		System.out.println(txt1.toUpperCase());
		
		System.out.println(txt1);
		
		String nombreYApellido = "Ramirez, Nahuel";
		
		String nombreYApellidoSeparado[] = nombreYApellido.split(",");
		
		String nombre = nombreYApellidoSeparado[0];
		String apellido = nombreYApellidoSeparado[1];
		
		System.out.println(nombre);
		
		String autores = "Nahuel, María, Micaela, Lujan";
		
		String autoresSeparados[] = autores.split(",");
		
		for(String unAutor : autoresSeparados) {
			System.out.println(unAutor);
		}
		
		
	}

}
