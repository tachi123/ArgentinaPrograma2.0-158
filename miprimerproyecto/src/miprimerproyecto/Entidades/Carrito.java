package miprimerproyecto.Entidades;

public class Carrito {
	
	private Persona persona;
	private Producto producto1;
	private Producto producto2;
	private Producto producto3;
	
	public Carrito(Persona persona, Producto producto1, Producto producto2, Producto producto3) {
		this.setPersona(persona);
		this.setProducto1(producto1);
		this.setProducto2(producto2);
		this.setProducto3(producto3);
	}
	
	public Double costoFinal() {
		return this.getProducto1().getPrecio() + this.getProducto2().getPrecio() + this.getProducto3().getPrecio();
	}	
	
	public Persona getPersona() {
		return persona;
	}
	
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public Producto getProducto1() {
		return producto1;
	}
	public void setProducto1(Producto producto1) {
		this.producto1 = producto1;
	}
	public Producto getProducto2() {
		return producto2;
	}
	public void setProducto2(Producto producto2) {
		this.producto2 = producto2;
	}
	public Producto getProducto3() {
		return producto3;
	}
	public void setProducto3(Producto producto3) {
		this.producto3 = producto3;
	}
	
	
	
	

}
