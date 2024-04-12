package TP2.ejercicio9;

import java.util.*;

import TP2.ejercicio1.BinaryTree;

public class ParcialArboles {
	
	
	public BinaryTree<List<Integer>> sumAndDif(BinaryTree<Integer> arbol){
		return sumAndDif(arbol,null);
	}
	
	private BinaryTree<List<Integer>> sumAndDif(BinaryTree<Integer> arbol, BinaryTree<List<Integer>> padre){
		if (arbol==null) {
			return null;
		}else {
			List<Integer> lista = new ArrayList<Integer>();	
			if (padre!=null) {
				lista.add(arbol.getData()+padre.getData().get(0));
				lista.add(arbol.getData()-padre.getData().get(1));
			}else {
				lista.add(arbol.getData()+0);
				lista.add(arbol.getData()-0);
			}
			BinaryTree<List<Integer>> aux = new BinaryTree<List<Integer>>();
			aux.setData(lista);
			
			if (arbol.hasLeftChild()) {
				aux.addLeftChild(sumAndDif(arbol.getLeftChild(), aux));
			}
			if (arbol.hasRightChild()) {
				aux.addRightChild(sumAndDif(arbol.getRightChild(),aux));
			}
			return aux;
		}
	}
}
