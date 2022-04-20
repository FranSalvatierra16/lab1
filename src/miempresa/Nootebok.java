package miempresa;

public class Nootebok extends Informatico{
private int memoria;
	public Nootebok(int stock, String nombre, float precio, String marca, int memoria) {
		super(stock, nombre, precio, marca);
		// TODO Auto-generated constructor stub
		this.memoria=memoria;
	}
	public int getMemoria() {
		return memoria;
	}
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+("\nMemoria: "+getMemoria());
	}
}
