package TP2.ejercicio8;

import TP2.ejercicio1.BinaryTree;

public class ParcialArboles {
	
	public boolean esPrefijo(BinaryTree<Integer>arbol1, BinaryTree<Integer>arbol2) {
		if (arbol1==null) { //si arbol1 es null es prefijo de cualquier arbol
			return true;
		}
		
		if (arbol2==null) { //si arbol2 es null, arbol1 no es prefijo de nadie
			return false;
		}
		
		if (arbol1.getData()!=arbol2.getData()) { //si un nodo del arbol1 es distinto, es falso 
			return false;
		}
		
		boolean nodoIzq = esPrefijo(arbol1.getLeftChild(),arbol2.getLeftChild());
		boolean nodoDer = esPrefijo(arbol1.getRightChild(),arbol2.getRightChild());
		
		return nodoIzq && nodoDer;
	}
}
