package TP2.ejercicio4;

import TP2.ejercicio1.*; //Importo clase arbol

public class RedBinariaLlena {
	BinaryTree<Integer> arbol;
	
	public RedBinariaLlena(BinaryTree<Integer> arbol){
		this.arbol=arbol;
	}
	
	public int retardoReenvio() {
		if(arbol==null|arbol.isEmpty()) {
			return 0;
		}else {
			return retardoReenvio(this.arbol); //pregrunto isempty aca
	
		}
	}
	
    private int retardoReenvio(BinaryTree<Integer> arbol) {
        if(arbol.isLeaf())
                return arbol.getData();
        else {
                int izq=0;
                int der=0;
                if(arbol.hasLeftChild())
                    izq=retardoReenvio(arbol.getLeftChild());
                if(arbol.hasRightChild())
                	der=retardoReenvio(arbol.getRightChild());
                return arbol.getData()+Math.max(izq, der);
                
        }
}
	
}
