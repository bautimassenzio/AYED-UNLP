package TP3.ejercicio7;

import java.util.*;

import TP3.ejercicio1.GeneralTree;

public class ejercicio7 {

	public static void main(String[] args) {
        /*// Crear el nodo raíz
        GeneralTree<Integer> root = new GeneralTree<>(1);

        // Crear hijos del nodo raíz
        GeneralTree<Integer> child1 = new GeneralTree<>(2);
        GeneralTree<Integer> child2 = new GeneralTree<>(3);
        GeneralTree<Integer> child3 = new GeneralTree<>(4);

        // Agregar hijos al nodo raíz
        root.addChild(child1);
        root.addChild(child2);
        root.addChild(child3);

        // Crear nietos y agregarlos a los hijos del nodo raíz
        GeneralTree<Integer> grandChild1 = new GeneralTree<>(5);
        GeneralTree<Integer> grandChild2 = new GeneralTree<>(6);
        child1.addChild(grandChild1);
        child2.addChild(grandChild2); */
		
		GeneralTree<Integer> root = new GeneralTree<>(10);

        // Crear hijos del nodo raíz
        GeneralTree<Integer> child1 = new GeneralTree<>(20);
        GeneralTree<Integer> child2 = new GeneralTree<>(30);
        GeneralTree<Integer> child3 = new GeneralTree<>(40);

        // Agregar hijos al nodo raíz
        root.addChild(child1);
        root.addChild(child2);
        root.addChild(child3);

        // Crear nietos y agregarlos a los hijos del nodo raíz
        GeneralTree<Integer> grandChild1 = new GeneralTree<>(50);
        GeneralTree<Integer> grandChild2 = new GeneralTree<>(60);
        GeneralTree<Integer> grandChild3 = new GeneralTree<>(70);
        child1.addChild(grandChild1);
        child2.addChild(grandChild2);
        child3.addChild(grandChild3);

        // Crear bisnieto y agregarlo al nieto
        GeneralTree<Integer> greatGrandChild1 = new GeneralTree<>(80);
        grandChild3.addChild(greatGrandChild1);
        GeneralTree<Integer> nodito = new GeneralTree<>(90);
        
        greatGrandChild1.addChild(nodito);
		
        Caminos caminos = new Caminos(root);
        
        List<Integer> resultado=caminos.caminoAHojaMasLejana();
        
        for (Integer num:resultado) {
        	System.out.println(num);
        }

	}

}
