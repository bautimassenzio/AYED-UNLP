package TP2.ejercicio6;

import TP2.ejercicio1.BinaryTree;

public class Transformacion {
	private BinaryTree<Integer>arbol;
	
	public Transformacion (BinaryTree<Integer>arbol) {
		this.arbol=arbol;
	}
	
	public BinaryTree<Integer>suma(){
		if (arbol.isEmpty()) {
			return null;
		}else {
			return suma(arbol);
		}
	}
	
	private BinaryTree<Integer>suma (BinaryTree<Integer> arbol){
		if (arbol==null) {
			return null;
		}else {
			BinaryTree<Integer>aux=new BinaryTree<Integer>();
			int suma=0;
			if (arbol.hasLeftChild()) {
				suma= suma+ arbol.getLeftChild().getData();
				aux.addLeftChild(suma(arbol.getLeftChild()));
				suma=suma+aux.getLeftChild().getData();
			}
			if (arbol.hasRightChild()) {
				suma= suma +arbol.getRightChild().getData();
				aux.addRightChild(suma(arbol.getRightChild()));
				suma=suma+aux.getRightChild().getData();
			}
			aux.setData(suma);
			return aux;
		}
	}
}