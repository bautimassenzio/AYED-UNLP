package TP2.ejercicio9;

import java.util.*;

import TP2.ejercicio1.BinaryTree;

public class ejercicio9 {
	
	public static String imprimirArrayList(List<Integer> lista) {
        StringBuilder sb = new StringBuilder();
        for (Integer numero : lista) {
            sb.append(numero).append("\n");
        }
        return sb.toString();
    }
	
	public static void imprimirArbol(BinaryTree<List<Integer>> arbol) {
	    imprimirArbolRecursivo(arbol, 0);
	}

	private static void imprimirArbolRecursivo(BinaryTree<List<Integer>> nodo, int nivel) {
	    if (nodo == null) {
	        return;
	    }

	    // Imprimir el nodo actual con su nivel
	    System.out.println("Nivel " + nivel + ": " +  imprimirArrayList(nodo.getData()));

	    // Llamar recursivamente a los hijos, aumentando el nivel
	    imprimirArbolRecursivo(nodo.getLeftChild(), nivel + 1);
	    imprimirArbolRecursivo(nodo.getRightChild(), nivel + 1);
	}
	
	public static void main(String[] args) {
		// Crear los nodos del árbol
		BinaryTree<Integer> nodeMinus5 = new BinaryTree<>(-5);
		BinaryTree<Integer> node10 = new BinaryTree<>(10);
		BinaryTree<Integer> node1 = new BinaryTree<>(1);
		BinaryTree<Integer> node50 = new BinaryTree<>(50);
		BinaryTree<Integer> nodeMinus9 = new BinaryTree<>(-9);
		BinaryTree<Integer> node4 = new BinaryTree<>(4);
		BinaryTree<Integer> node6 = new BinaryTree<>(6);

		// Establecer las relaciones padre-hijo
		node10.addLeftChild(node1);
		nodeMinus9.addRightChild(node4);
		node4.addRightChild(node6);

		// Crear los nodos de nivel 2
		BinaryTree<Integer> node5 = new BinaryTree<>(5);
		BinaryTree<Integer> node30 = new BinaryTree<>(30);

		// Establecer las relaciones padre-hijo
		node5.addLeftChild(nodeMinus5);
		node5.addRightChild(node10);
		node30.addLeftChild(node50);
		node30.addRightChild(nodeMinus9);

		// Crear la raíz del árbol
		BinaryTree<Integer> root = new BinaryTree<>(20);

		// Establecer las relaciones padre-hijo
		root.addLeftChild(node5);
		root.addRightChild(node30);
		
		ParcialArboles parcial = new ParcialArboles();
		//Creo arbol del listas
		
		BinaryTree<List<Integer>> resultado= parcial.sumAndDif(root);
		imprimirArbol(resultado);
	}

}
