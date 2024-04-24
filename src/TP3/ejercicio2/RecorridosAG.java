package TP3.ejercicio2;

import java.util.*;

import TP3.ejercicio1.GeneralTree;
import TP1.ejercicio8.Queue;
public class RecorridosAG {
	
	public List<Integer> numerosImparesMayoresQuePreOrden(GeneralTree<Integer>a, Integer n){
		if (a==null || a.isEmpty()) {
			return null; //mejor retornar lista vacia
		} else {
			List<Integer> lista = new LinkedList<Integer>();
			numerosImparesMayoresQuePreOrden(a,lista,n);
			return lista;
			}
	}

	
	private void numerosImparesMayoresQuePreOrden(GeneralTree<Integer> arbol, List<Integer> lista, Integer n) {
		if (arbol.getData()>n && arbol.getData() %  2 != 0) {	//hay que preguntar isEmpty? no tiene mucho sentido, hijos vacios???		
			lista.add(arbol.getData());
		}
		if (arbol.hasChildren()) { //no es necesario preguntar si tiene hijos (la implementacion es lista vacia)
			List<GeneralTree<Integer>> children = arbol.getChildren();
			for (GeneralTree<Integer> child:children) {
				numerosImparesMayoresQuePreOrden(child,lista,n);
			}
		}
		
	}
	
	public List<Integer> numerosImparesMayoresQueInOrden(GeneralTree<Integer>a, Integer n){
		if (a==null || a.isEmpty()) {
			return null;
		} else {
			List<Integer> lista = new LinkedList<Integer>();
			numerosImparesMayoresQueInOrden(a,lista,n);
			return lista;
			}
	}

	
	private void numerosImparesMayoresQueInOrden(GeneralTree<Integer> arbol, List<Integer> lista, Integer n) {
		List<GeneralTree<Integer>> children= arbol.getChildren();
		if (arbol.hasChildren()) {
			numerosImparesMayoresQueInOrden(children.get(0),lista,n);
		}
		if (arbol.getData()>n || arbol.getData() % 2 != 0) {
			lista.add(arbol.getData());
		}
		for (int i = 1; i< children.size();i++) {
			numerosImparesMayoresQueInOrden(children.get(i),lista,n);
		}
	}
	
	public List<Integer> numerosImparesMayoresQuePostOrden(GeneralTree<Integer>a, Integer n){
		if (a==null || a.isEmpty()) {
			return null;
		} else {
			List<Integer> lista = new LinkedList<Integer>();
			numerosImparesMayoresQuePostOrden(a,lista,n);
			return lista;
			}
	}
	

	
	private void numerosImparesMayoresQuePostOrden(GeneralTree<Integer> arbol, List<Integer> lista, Integer n) {
		if (arbol.hasChildren()) {
			List<GeneralTree<Integer>> children = arbol.getChildren();
			for (GeneralTree<Integer> child: children) {
				numerosImparesMayoresQueInOrden(child,lista,n);
			}
			if (arbol.getData()>n && arbol.getData() % 2 !=0) {
				lista.add(arbol.getData());
			}
		}		
	}
	

	public List<Integer> numerosImparesMayoresQuePorNiveles(GeneralTree<Integer>a,Integer n){
		List<Integer> result = new LinkedList<Integer>();
		if (a==null || a.isEmpty()) {
			return result;
		}
		GeneralTree<Integer> aux;
		Queue<GeneralTree<Integer>> queue = new Queue<GeneralTree<Integer>>();
		queue.enqueue(a);
		while (!queue.isEmpty()) {
			aux=queue.dequeue();
			if (aux.getData()>n && aux.getData() % 2 !=0) {
				result.add(aux.getData());
			}
			List<GeneralTree<Integer>> children = aux.getChildren();
			for (GeneralTree<Integer> child: children) {
				queue.enqueue(child);
			}
		}
		return result;
	}	
	
}
