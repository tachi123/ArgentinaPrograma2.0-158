package miprimerproyecto.Clase05;

import miprimerproyecto.Entidades.Ave;
import miprimerproyecto.Entidades.Carrito;
import miprimerproyecto.Entidades.Persona;
import miprimerproyecto.Entidades.Producto;

public class TrabajandoConClases {

	public static void main(String[] args) {
		//pruebaConAve();

		//Instancias de productos
		Producto harina = new Producto("harina");
		
		harina.setNombre("Harina 000");
		harina.setDescripcion("Harina sin levadura");
		harina.setPesoKg(1);
		harina.setPrecio(125.5);
		
		Producto carne = new Producto("Roast beef","Es carne de ternera",5, 5050.0);
		Producto leche = new Producto("Leche","Ultrapasteurizada",1 , 250.0);
		
		//Instancio personas
		Persona nahuel = new Persona("Nahuel","Apellido");
		
		//Instanciar un carrito
		
				
		Carrito unCarrito = new Carrito(nahuel,harina,carne,leche);
		
		System.out.println("El precio del carrito es:"+unCarrito.costoFinal());
		
				
	}
	
	public static void pruebaConAve() {
		Ave gallina = new Ave();
		
		gallina.nombre = "Gallina";
		
		gallina.calorias = 0;
		
		gallina.comer();
		
		System.out.println("calorias:"+gallina.calorias);
		
		gallina.volar();
		
		System.out.println("calorias:"+gallina.calorias);
	}

}
