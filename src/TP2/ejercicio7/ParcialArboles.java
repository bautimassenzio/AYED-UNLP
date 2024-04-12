package TP2.ejercicio7;

import TP2.ejercicio1.BinaryTree;

public class ParcialArboles {
	BinaryTree <Integer> arbolEnteros;
	
	
	
	public ParcialArboles(BinaryTree<Integer> arbolEnteros) {
		super();
		this.arbolEnteros = arbolEnteros;
	}

	public boolean isLeftTree(int num) {
		BinaryTree<Integer> subarbol= buscar(arbolEnteros,num);
		if (subarbol==null) {
			return false;
		}else {
			int cantIz, cantDer;
			if (subarbol.hasLeftChild()) {
				cantIz= contarNodos(subarbol.getLeftChild());
			}else {
				cantIz=-1;
			}
			if (subarbol.hasRightChild()) {
				cantDer=contarNodos(subarbol.getRightChild());
			}else {
				cantDer=-1;
			}
			
			return cantIz>cantDer;
		}
	}
	
	private int contarNodos(BinaryTree<Integer> arbol) {
		if (arbol==null) {
			return 0;
		}else {
			int cant=0;
			if (arbol.hasLeftChild() && !arbol.hasRightChild()) {
				cant++;
			}else if (arbol.hasRightChild() && !arbol.hasLeftChild()) {
				cant++;
			}
			
			cant+= contarNodos(arbol.getLeftChild());
			cant+= contarNodos(arbol.getRightChild());
			return cant;
		}
	}
	
	private BinaryTree<Integer> buscar(BinaryTree<Integer> arbol, int num){
		if (arbol==null) {
			return null;
		} else {
			if (num == arbol.getData()) {
				return arbol;
			}
			BinaryTree<Integer> subIz= buscar(arbol.getLeftChild(),num);
			if (subIz!=null) {
				return subIz;
			}
			
			BinaryTree<Integer> subDer = buscar(arbol.getRightChild(),num);
			if (subDer!=null) {
				return subDer;
			}
			return null;
		}
	}
}
