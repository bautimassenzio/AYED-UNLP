package TP1.ejercicio5;

public class ejercicio5 {

	public static void main(String[] args) {
		
		//INCISO A
		int arreglo []= {1,45,20,78};
		
		Procesar resultados= Procesar.procesarArreglo(arreglo);
		
		System.out.println("Inciso A");
		
		System.out.println("maximo " + resultados.getMax());
		System.out.println("minimo " + resultados.getMin());
		System.out.println("promedio " + resultados.getProm());
		
		
		//INCISO B
		Procesar objetoMutable= new Procesar(0,0,0);
		
		Procesar.procesarArregloB(arreglo, objetoMutable);
		
		System.out.println("Inciso B");
		
		System.out.println("maximo " + objetoMutable.getMax());
		System.out.println("minimo " + objetoMutable.getMin());
		System.out.println("promedio " + objetoMutable.getProm());
		
		
		//EL INCISO C LO PODEMOS HACER UTILIZANDO LAS VARIABLES DE INSTANCIAS
	}

}
