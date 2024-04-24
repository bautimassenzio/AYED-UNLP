package TP3.ejercicio9;

import TP3.ejercicio1.GeneralTree;

public class ejercicio9 {

	public static void main(String[] args) {
		GeneralTree<Integer> root = new GeneralTree<>(1);

        // Crear hijos del nodo raíz
        GeneralTree<Integer> node2 = new GeneralTree<>(2);
        GeneralTree<Integer> node3 = new GeneralTree<>(1);
        GeneralTree<Integer> node4 = new GeneralTree<>(4);

        // Añadir hijos al nodo raíz
        root.addChild(node2);
        root.addChild(node3);
        root.addChild(node4);

        // Crear y añadir hijos al nodo 2
        GeneralTree<Integer> node5 = new GeneralTree<>(2);
        GeneralTree<Integer> node6 = new GeneralTree<>(6);
        node2.addChild(node5);
        node2.addChild(node6);

        // Crear y añadir hijos al nodo 3
        GeneralTree<Integer> node7 = new GeneralTree<>(1);
        node3.addChild(node7);

        // Crear y añadir hijos al nodo 4
        GeneralTree<Integer> node8 = new GeneralTree<>(4);
        GeneralTree<Integer> node9 = new GeneralTree<>(9);
        node4.addChild(node8);
        node4.addChild(node9);
        
        System.out.println(ParcialArboles.esDeSeleccion(root));

	}

}
