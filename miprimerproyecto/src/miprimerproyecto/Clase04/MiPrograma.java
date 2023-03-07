package miprimerproyecto.Clase04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MiPrograma {

	public static void main(String[] args) {
		
		//Ubicación completa donde esta el archivo
		String pathAbsolutoORutaAbsoluta = "J:\\Documents\\GitHub\\ArgentinaPrograma2.0-158\\miprimerproyecto\\recursos\\ArchivoTexto.txt";
		
		String rutaRelativa = "recursos/ArchivoTexto.txt";
		
		Path pathRelativo = Paths.get(rutaRelativa);
		
		try {
			for(String linea : Files.readAllLines(pathRelativo)) {
				System.out.println(linea);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(pathRelativo.toAbsolutePath());
		
		
	}

}
