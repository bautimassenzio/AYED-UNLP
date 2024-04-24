package TP3.ejercicio6;

import TP3.ejercicio1.GeneralTree;

public class RedAguaPotable {
	private GeneralTree<Character> arbol;

	public RedAguaPotable(GeneralTree<Character> arbol) {
		super();
		this.arbol = arbol;
	}
	
	
	public double minimoCaudal(double caudal) {
		if (arbol ==null || arbol.isEmpty()) {
			return -1;
		}else {
			return minimoCaudal(arbol,caudal);
		}
	}
	
	private double minimoCaudal(GeneralTree<Character> arbol, double caudal) {
		if (arbol.isLeaf()) {
			return caudal;
		}else {
			double min = 9999;
			int cantHijos = arbol.getChildren().size();
			double calculo = caudal/cantHijos;	
			for(GeneralTree<Character> child: arbol.getChildren()) {
				double aux = minimoCaudal(child,calculo);
				if (aux<min) {
					min=aux;
				}
			}
			return min;
		}
	}
	
}
