package miempresa;

public class Informatico extends Producto{
private String marca;
	public Informatico(int stock, String nombre, float precio, String marca) {
		super(stock, nombre, precio);
		// TODO Auto-generated constructor stub
		this.marca=marca;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+("\nMarca: "+getMarca());
	}
}
