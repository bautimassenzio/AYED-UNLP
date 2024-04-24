package TP3.ejercicio9;

import java.util.Iterator;

import TP3.ejercicio1.GeneralTree;

public class ParcialArboles {
	
	public static boolean esDeSeleccion(GeneralTree<Integer>arbol) {
		if (arbol == null || arbol.isEmpty()) {
			return false;
		}else {
			return esDeSeleccionHelper(arbol);
		}
		
	}
	
	private static boolean esDeSeleccionHelper(GeneralTree<Integer>arbol){
		if (arbol.isLeaf()) {
			return true;
		}else {
			int min=9999;
			Iterator<GeneralTree<Integer>> it = arbol.getChildren().iterator();
			boolean ok= true;
			while (it.hasNext() && ok) { //uso iterator para no recorrer todo el arbol en caso de que no se cumpla la condicion
				GeneralTree<Integer> child = it.next();
				if (child.getData()<min) {
					min=child.getData();
				}
				ok=esDeSeleccionHelper(child);
			}
			return arbol.getData().equals(min) && ok;
		}
	}
	
}
