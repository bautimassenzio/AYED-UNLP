package TP2.ejercicio7;

import TP2.ejercicio1.BinaryTree;

public class ejercicio7 {
	
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
    	BinaryTree<Integer> root = new BinaryTree<>(2);

        BinaryTree<Integer> node7 = new BinaryTree<>(7);
        BinaryTree<Integer> nodeMinus5 = new BinaryTree<>(-5);

        root.addLeftChild(node7);
        root.addRightChild(nodeMinus5);

        BinaryTree<Integer> node23 = new BinaryTree<>(23);
        node7.addLeftChild(node23);

        BinaryTree<Integer> node6 = new BinaryTree<>(6);
        node7.addRightChild(node6);

        BinaryTree<Integer> nodeMinus3 = new BinaryTree<>(-3);
        node23.addLeftChild(nodeMinus3);
        
        BinaryTree<Integer> node4= new BinaryTree<>(4); 
        
        BinaryTree<Integer> node19 = new BinaryTree<>(19);
        nodeMinus5.addRightChild(node19);
        node19.addRightChild(node4);

        BinaryTree<Integer> leaf55 = new BinaryTree<>(55); 
        node6.addLeftChild(leaf55); 

        BinaryTree<Integer> leaf11= new BinaryTree<>(11); 
        node6.addRightChild(leaf11); 
        
        
        
        BinaryTree<Integer> leaf18= new BinaryTree<>(18); 
        node4.addLeftChild(leaf18);
		
        ParcialArboles parcial = new ParcialArboles(root);
        
        System.out.println(parcial.isLeftTree(-3));
        
		imprimirArbol(root);
    }
}

