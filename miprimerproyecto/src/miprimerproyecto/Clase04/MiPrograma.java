package miprimerproyecto.Clase04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

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

		
		//Lectura de archivos linea por línea para evitar sobrecarga de memoria.
		try {
            Scanner scn = new Scanner(new File(rutaRelativa));
            
            while(scn.hasNext()){
                System.out.println(scn.nextLine());
            }
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
		
	}

}
