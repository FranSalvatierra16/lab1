package miempresa;

public class Producto {
	private int stock;
private String nombre;
private float precio;

public Producto(int stock, String nombre, float precio){
	this.stock=stock;
	this.nombre=nombre;
	this.precio=precio;
	
}
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public float getPrecio() {
	return precio;
}
public void setPrecio(float precio) {
	this.precio = precio;
}
public String toString() {
	// TODO Auto-generated method stub
	return "\nNombre: "+getNombre()+ 
		   "\nStock: "+getStock()+  
		   "\nPrecio: "+getPrecio();
}

}
