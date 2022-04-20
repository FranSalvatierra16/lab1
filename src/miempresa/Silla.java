package miempresa;

public class Silla extends Muebles {
  private Boolean ruedas;
	public Silla(int stock, String nombre, float precio, String origen, int creacion, Boolean ruedas) {
		super(stock, nombre, precio, origen, creacion);
		this.ruedas=ruedas;
		// TODO Auto-generated constructor stub
	}
	
	public Boolean getRuedas() {
		return ruedas;
	}
	public void setRuedas(Boolean ruedas) {
		this.ruedas = ruedas;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		if(ruedas.equals(true)) {
		return super.toString()+("\nRuedas:SI");
		}else
		{
			return super.toString()+("\nRuedas:NO");
		}
	}
}
