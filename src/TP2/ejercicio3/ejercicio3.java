package TP2.ejercicio3;
import java.util.*;
public class ejercicio3 {

	public static void main(String[] args) {
		ContadorArbol contador = new ContadorArbol();
		contador.cargarArbol();
		
		//In Orden
		List <Integer> lista = new LinkedList<Integer>();		
		lista = contador.numerosParesInOrden();
		
		for (int i =0; i<lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		//Post Orden
		List<Integer> lista2 = new LinkedList<Integer>();
		lista2 = contador.numerosParesPostOrden();
		
		for (int i =0; i<lista2.size(); i++) {
			System.out.println(lista2.get(i));
		}
	}

}
