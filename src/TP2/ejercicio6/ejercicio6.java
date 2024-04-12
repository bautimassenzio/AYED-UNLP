package TP2.ejercicio6;

import TP2.ejercicio1.BinaryTree;

public class ejercicio6 {

		
	public static void imprimirArbol(BinaryTree<Integer> arbol) {
	    imprimirArbolRecursivo(arbol, 0);
	}

	private static void imprimirArbolRecursivo(BinaryTree<Integer> nodo, int nivel) {
	    if (nodo == null) {
	        return;
	    }

	    // Imprimir el nodo actual con su nivel
	    System.out.println("Nivel " + nivel + ": " + nodo.getData());

	    // Llamar recursivamente a los hijos, aumentando el nivel
	    imprimirArbolRecursivo(nodo.getLeftChild(), nivel + 1);
	    imprimirArbolRecursivo(nodo.getRightChild(), nivel + 1);
	}
	
	public static void main(String[] args) {
		BinaryTree<Integer> nodo8 = new BinaryTree<Integer>(8);
		BinaryTree<Integer> nodo7 = new BinaryTree<Integer>(7);
		
		BinaryTree<Integer> nodo5 = new BinaryTree<Integer>(5);
		nodo5.addLeftChild(nodo7);
		nodo5.addRightChild(nodo8);
		
		BinaryTree<Integer> nodo6 = new BinaryTree<Integer>(6);
		
		BinaryTree<Integer> nodo3 = new BinaryTree<Integer>(3);
		nodo3.addLeftChild(nodo5);
		nodo3.addRightChild(nodo6);
		
		BinaryTree<Integer> nodo2 = new BinaryTree<Integer>(2);
		BinaryTree<Integer> nodo4 = new BinaryTree<Integer>(4);
		nodo2.addRightChild(nodo4);
		
		BinaryTree<Integer> nodo1 = new BinaryTree<Integer>(1);
		nodo1.addRightChild(nodo3);
		nodo1.addLeftChild(nodo2);
		
		Transformacion obj = new Transformacion(nodo1);
		
		BinaryTree<Integer> resultado;
		resultado=obj.suma();	
		imprimirArbol(resultado);
	}

}
