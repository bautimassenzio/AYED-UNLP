package TP3.ejercicio6;

import TP3.ejercicio1.GeneralTree;

public class ejercicio6 {

	public static void main(String[] args) {
	/*	// Crear el nodo raíz
        GeneralTree<Character> root = new GeneralTree<>('A');

        // Crear hijos del nodo raíz
        GeneralTree<Character> nodeB = new GeneralTree<>('B');
        GeneralTree<Character> nodeC = new GeneralTree<>('C');
        GeneralTree<Character> nodeD = new GeneralTree<>('D');

        // Añadir hijos al nodo raíz
        root.addChild(nodeB);
        root.addChild(nodeC);
        root.addChild(nodeD);

        // Crear y añadir hijos al nodo B
        GeneralTree<Character> nodeE = new GeneralTree<>('E');
        GeneralTree<Character> nodeF = new GeneralTree<>('F');
        nodeB.addChild(nodeE);
        nodeB.addChild(nodeF);

        // Crear y añadir hijos al nodo C
        GeneralTree<Character> nodeG = new GeneralTree<>('G');
        nodeC.addChild(nodeG);

        // Crear y añadir hijos al nodo D
        GeneralTree<Character> nodeH = new GeneralTree<>('H');
        GeneralTree<Character> nodeI = new GeneralTree<>('I');
        nodeD.addChild(nodeH);
        nodeD.addChild(nodeI);
        
         */
		
        // Crear el nodo raíz
        GeneralTree<Character> root = new GeneralTree<>('A');

        // Crear hijos del nodo raíz
        GeneralTree<Character> nodeB = new GeneralTree<>('B');
        GeneralTree<Character> nodeC = new GeneralTree<>('C');
        GeneralTree<Character> nodeD = new GeneralTree<>('D');
        GeneralTree<Character> nodeE = new GeneralTree<>('E');
        GeneralTree<Character> nodeP = new GeneralTree<>('P');

        // Añadir hijos al nodo raíz
        root.addChild(nodeB);
        root.addChild(nodeC);
        root.addChild(nodeD);
        root.addChild(nodeE);
        root.addChild(nodeP);

        // Crear y añadir hijos al nodo B
        GeneralTree<Character> nodeF = new GeneralTree<>('F');
        GeneralTree<Character> nodeG = new GeneralTree<>('G');
        nodeB.addChild(nodeF);
        nodeB.addChild(nodeG);

        // Crear y añadir hijos al nodo C
        GeneralTree<Character> nodeH = new GeneralTree<>('H');
        GeneralTree<Character> nodeI = new GeneralTree<>('I');
        nodeC.addChild(nodeH);
        nodeC.addChild(nodeI);

        // Crear y añadir hijos al nodo D
        GeneralTree<Character> nodeJ = new GeneralTree<>('J');
        GeneralTree<Character> nodeK = new GeneralTree<>('K');
        nodeD.addChild(nodeJ);
        nodeD.addChild(nodeK);
        
        RedAguaPotable obj = new RedAguaPotable(root);
        System.out.println(obj.minimoCaudal(1000));

	}

}
