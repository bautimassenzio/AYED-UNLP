package TP3.ejercicio4;

import java.util.*;

import TP1.ejercicio8.Queue;
import TP3.ejercicio1.GeneralTree;

public class AnalizadorArbol {
	
	
	public double devolverMaximoPromedio(GeneralTree<AreaEmpresa>arbol) {
		if (arbol==null || arbol.isEmpty()) {
			return -1;
		}else {
			GeneralTree<AreaEmpresa> aux;
			Queue<GeneralTree<AreaEmpresa>> queue= new Queue<GeneralTree<AreaEmpresa>>();
			queue.enqueue(arbol);
			queue.enqueue(null);
			int suma=0;
			int cant=0;
			int max=-1;
			int prom;
			while (!queue.isEmpty()) {
				aux= queue.dequeue();
				if (aux!=null) {
					cant++;
					suma= suma + aux.getData().getTardanza();
					List<GeneralTree<AreaEmpresa>> children = aux.getChildren();
					for(GeneralTree<AreaEmpresa> child:children) {
						queue.enqueue(child);
					}
				}else {
					prom=suma/cant;
					if (prom>max) {
						max=prom;
					}
					if (!queue.isEmpty()) {
						queue.enqueue(null);
					}
					suma=0;
					cant=0;
				}
			}
			return max;
		}
	}
}
