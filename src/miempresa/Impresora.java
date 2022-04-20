package miempresa;

public class Impresora extends Informatico {
private int impresiones_min;
	public Impresora(int stock, String nombre, float precio, String marca, int impresiones_min) {
		super(stock, nombre, precio, marca);
		// TODO Auto-generated constructor stub
		this.impresiones_min=impresiones_min;
	}
	public int getImpresiones_min() {
		return impresiones_min;
	}
	public void setImpresiones_min(int impresiones_min) {
		this.impresiones_min = impresiones_min;
	}
	
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString()+("\nimpresiones por min: "+getImpresiones_min());
		}

}
