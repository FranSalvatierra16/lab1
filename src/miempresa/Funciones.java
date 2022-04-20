package miempresa;



public class Funciones {
private Producto[] lista_producto;
private int vProducto;

public Funciones(){
	lista_producto= new Producto[20];
	vProducto=0;
}
public Silla agregarsilla(int stock, String nombre, float precio, String origen, int creacion, Boolean ruedas)
{
	 Silla nuevasilla=new Silla(stock, nombre, precio, origen, creacion, ruedas);
	 int pos=buscarUltimapos();
	 
	 lista_producto[pos]=nuevasilla;
	vProducto++;
	 return nuevasilla; 
}
public Escritorio agregarescritorio(int stock, String nombre, float precio, String origen, int creacion, int ancho, int alto)
{
	 Escritorio nuevoescritorio=new Escritorio(stock, nombre, precio, origen, creacion, ancho, alto) ;
	 int pos=buscarUltimapos();
	 
	 lista_producto[pos]=nuevoescritorio;
	vProducto++;
	 return nuevoescritorio; 
}
public Nootebok agregarnotebook(int stock, String nombre, float precio, String marca, int memoria)
{
	Nootebok nuevo=new Nootebok(stock, nombre, precio, marca, memoria) ;
	 int pos=buscarUltimapos();
	 
	 lista_producto[pos]=nuevo;
	vProducto++;
	 return nuevo; 
}
public Impresora agregarimpresora(int stock, String nombre, float precio, String marca, int impresiones_min)
{
	Impresora nuevo=new Impresora(stock, nombre, precio, marca, impresiones_min) ;
	 int pos=buscarUltimapos();
	 
	 lista_producto[pos]=nuevo;
	vProducto++;
	 return nuevo; 
}
public int buscarUltimapos()
{
	int i=0;
	while(lista_producto[i]!=null&&i<=vProducto)
	{
		i++;
	}
	return i;
}
public void mostrarproductos() {
	
	 int i=0;
	 while(lista_producto[i]!=null) {

	 System.out.println(lista_producto[i].toString());
	 i++;
	 		
	 	}
	 }

public void aplicardescuento(float descuento) {
	int i=0;
float valor = 0;
descuento=100-descuento;

while(lista_producto[i]!=null) {
	System.out.println("hola");
	
	if(lista_producto[i].getClass()==Impresora.class) {
		
		System.out.println("sss"+lista_producto[i].getPrecio());
		valor=(lista_producto[i].getPrecio()*descuento/100);
		System.out.println("sss"+valor);
		lista_producto[i].setPrecio(valor);
		
		i++;
		
	}else if(lista_producto[i].getClass()==Nootebok.class) {
		
		System.out.println("sss"+lista_producto[i].getPrecio());
		valor=(lista_producto[i].getPrecio()*descuento/100);
		System.out.println("sss"+valor);
		lista_producto[i].setPrecio(valor);
		
		i++;
		
	}
	else
	{
		i++;
	}
}
}
public void cambiar() {
	int i=0;
float valor ;


while(lista_producto[i]!=null) {

	System.out.println(lista_producto[i].toString());
	if(lista_producto[i].getClass()==Impresora.class) {
		
	
		
		valor=(float) (lista_producto[i].getPrecio()*1.15);
		
		lista_producto[i].setPrecio(valor);
		System.out.println("Nuevo precio: " +lista_producto[i].getPrecio());
		
		i++;
		
	}else if(lista_producto[i].getClass()==Nootebok.class) {
		
		valor=(float) (lista_producto[i].getPrecio()*(1.2));
		
		
		lista_producto[i].setPrecio(valor);
		System.out.println("Nuevo precio: " +lista_producto[i].getPrecio());
		i++;
		
	}
else if(lista_producto[i].getClass()==Silla.class) {
		
		valor=(float) (lista_producto[i].getPrecio()*(1.05));
		
		
		lista_producto[i].setPrecio(valor);
		System.out.println("Nuevo precio: " +lista_producto[i].getPrecio());
		i++;
		
	}
else if(lista_producto[i].getClass()==Escritorio.class) {
	
	valor=(float) (lista_producto[i].getPrecio()*(1.10));
	
	
	lista_producto[i].setPrecio(valor);
	System.out.println("Nuevo precio: " +lista_producto[i].getPrecio());
	i++;
	
}

	
}
}
}
