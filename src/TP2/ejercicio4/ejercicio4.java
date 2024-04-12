package TP2.ejercicio4;

import TP2.ejercicio1.BinaryTree;

public class ejercicio4 {
	
    public static BinaryTree<Integer> crearArbolLleno(int altura) {
        if (altura < 0) {
            return null;
        }

        BinaryTree<Integer> nodo = new BinaryTree<>(altura);

        nodo.addLeftChild(crearArbolLleno(altura - 1));
        nodo.addRightChild(crearArbolLleno(altura - 1));

        return nodo;
    }
	
	
	public static void main(String[] args) {
		BinaryTree<Integer> miArbol = crearArbolLleno(3);
		
		RedBinariaLlena red = new RedBinariaLlena(miArbol);
		
		System.out.println(red.retardoReenvio());
	}

}
