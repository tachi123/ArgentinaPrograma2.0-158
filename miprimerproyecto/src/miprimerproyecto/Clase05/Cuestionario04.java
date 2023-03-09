package miprimerproyecto.Clase05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Cuestionario04 {

	public static void main(String[] args) {
		
		String rutaRelativa = "recursos/ArchivoTexto.txt";
		Path pathRelativo = Paths.get(rutaRelativa);
		
		try {
			for(String linea : Files.readAllLines(pathRelativo) ) {
				if(linea.startsWith("*")) {
					System.out.println(linea);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
