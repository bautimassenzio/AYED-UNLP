package TP3.ejercicio5;

import TP3.ejercicio1.GeneralTree;

public class ejercicio5 {

	public static void main(String[] args) {
        // Crear un nuevo árbol general con un entero como dato raíz
        GeneralTree<Integer> tree = new GeneralTree<>(1);

        // Crear hijos para el árbol
        GeneralTree<Integer> child1 = new GeneralTree<>(2);
        GeneralTree<Integer> child2 = new GeneralTree<>(3);
        GeneralTree<Integer> child3 = new GeneralTree<>(4);

        // Agregar hijos al árbol
        tree.addChild(child1);
        tree.addChild(child2);
        tree.addChild(child3);

        // Crear y agregar nietos al árbol
        GeneralTree<Integer> grandChild1 = new GeneralTree<>(5);
        GeneralTree<Integer> grandChild2 = new GeneralTree<>(6);
        child1.addChild(grandChild1);
        child2.addChild(grandChild2);
        
        System.out.println(tree.esAncestro(3, 6));

	}

}
