package miempresa;

public class Muebles extends Producto {
  private String origen;
  private int creacion;
	public Muebles(int stock, String nombre, float precio,String origen, int creacion) {
		super(stock, nombre, precio);
		this.creacion=creacion;
		this.origen=origen;	
		// TODO Auto-generated constructor stub
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public int getCreacion() {
		return creacion;
	}
	public void setCreacion(int creacion) {
		this.creacion = creacion;
	}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+("\nOrigen:"+getOrigen()+
				                 "\nCreacion"+getCreacion());
	}
}
