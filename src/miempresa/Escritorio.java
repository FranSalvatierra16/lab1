package miempresa;

public class Escritorio extends Muebles {
	private int ancho;
	private int alto;

	public Escritorio(int stock, String nombre, float precio, String origen, int creacion, int ancho, int alto) {
		super(stock, nombre, precio, origen, creacion);
		this.alto=alto;
		this.ancho=ancho;
		// TODO Auto-generated constructor stub
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+("\nAncho:"+getAncho()+
				                 "\nAlto: "+getAlto());
	}
}
