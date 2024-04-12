package TP2.ejercicio5;

import TP1.ejercicio8.Queue;
import TP2.ejercicio1.BinaryTree;

public class ProfundidadDeArbolBinario {
	BinaryTree<Integer> arbol;
	
	
	public int sumaElementosProfundidad(int p) {
		BinaryTree<Integer> arbol=null;
		
		Queue<BinaryTree<Integer>> queue = new Queue<>();
		int nivel=0;
		int sumaNodos=0;
		queue.enqueue(this.arbol); //encola la raiz (si hay mas nodos desencola todo) ?
		queue.enqueue(null);
		if(p>0) {
			while(!queue.isEmpty()) {
				arbol=queue.dequeue();
				if(arbol != null) {
					if(nivel == p)
						sumaNodos+=arbol.getData();
					if(arbol.hasLeftChild())
						queue.enqueue(arbol.getLeftChild());
					if(arbol.hasRightChild())
						queue.enqueue(arbol.getRightChild());
				}
				else {
					nivel++;
					if(nivel>p)
						return sumaNodos;
					if(!queue.isEmpty())
						queue.enqueue(null);
				}
			}
		}
		return sumaNodos;		
	}
	
	
}
