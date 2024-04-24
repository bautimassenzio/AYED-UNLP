package TP2.ejercicio9;

import java.util.*;

import TP2.ejercicio1.BinaryTree;

public class ParcialArboles {
	
	
	public BinaryTree<List<Integer>>sumAndDif(BinaryTree<Integer> arbol){
		if (arbol==null | arbol.isEmpty()) {
			return null;
		}else {
			return sumAndDif(arbol,0,0);
		}
	}
	
	private BinaryTree<List<Integer>>sumAndDif(BinaryTree<Integer> arbol, int padre, int dif){
		BinaryTree<List<Integer>> aux = new BinaryTree<List<Integer>>();
		List<Integer> lista = new LinkedList<Integer>();
		lista.add(arbol.getData()+padre);
		lista.add(arbol.getData()-dif);
		aux.setData(lista);
		int valoraux=arbol.getData();
		if (arbol.hasLeftChild()) {
			aux.addLeftChild(sumAndDif(arbol.getLeftChild(),lista.get(0),valoraux));
		}
		if (arbol.hasRightChild()) {
			aux.addRightChild(sumAndDif(arbol.getRightChild(),lista.get(0),valoraux));
		}
		return aux;
	}
}
