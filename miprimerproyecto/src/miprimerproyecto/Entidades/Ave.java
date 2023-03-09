package miprimerproyecto.Entidades;

public class Ave {

	public String nombre;
	public Integer calorias;
	
	public void volar() {
		this.calorias = calorias - 100;
	}
	
	public void comer() {
		this.calorias = calorias + 300;
	}
	
	
}
