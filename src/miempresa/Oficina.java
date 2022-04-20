package miempresa;

import java.util.Scanner;

public class Oficina {
	static Scanner kb;
  
	public static void main(String[] args) {
		kb=new Scanner(System.in);
		Funciones fun= new Funciones();
		Silla s1=null;
		Escritorio e1=null;
		Nootebok n1=null;
		Impresora i1;
		s1=fun.agregarsilla(50, "Silla gamer", 25000, "EEUU", 2021, true);
		e1=fun.agregarescritorio(20, "Mesita", 10000,"Esapaña", 2020, 100, 50);
		n1=fun.agregarnotebook(10, "Nootebok", 250000, "ASUS", 256);
		i1=fun.agregarimpresora(5, "Impresora", 23000, "Sony", 12);
        fun.mostrarproductos();
       
        System.out.println("Ingrese el descuento");
       float descuento; 
       descuento=kb.nextFloat();
      
        fun.aplicardescuento(descuento);
    
     fun.cambiar();
       kb.close();
        
	}

}
