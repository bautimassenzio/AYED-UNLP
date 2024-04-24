package TP3.ejercicio7;

import java.util.*;

import TP3.ejercicio1.GeneralTree;

public class Caminos {
	private GeneralTree<Integer> arbol;
	
	public Caminos(GeneralTree<Integer> arbol) {
		this.arbol = arbol;
	}

	public List<Integer> caminoAHojaMasLejana(){
		if (arbol==null || arbol.isEmpty()) {
			return new LinkedList<Integer>(); //retorno una lista vacia
		}
		return caminoAHojaMasLejana(arbol);
	}
	
	private List<Integer> caminoAHojaMasLejana(GeneralTree<Integer>arbol) {
		if (arbol.isLeaf()) {
			List<Integer> aux = new LinkedList<Integer>();
			aux.add(arbol.getData());
			return aux;
		}else {
			int max=-1;
			List<Integer> resultado=new LinkedList<Integer>();
			for(GeneralTree<Integer> child: arbol.getChildren()) {
				List<Integer> aux= caminoAHojaMasLejana(child);
				aux.add(arbol.getData()); 
				if (aux.size()>max) {
					max=aux.size();
					resultado=aux;
				}
			}
			return resultado;
		}
		
	}
}
