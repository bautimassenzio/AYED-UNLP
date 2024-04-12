package TP2.ejercicio3;
import java.util.*;
import TP2.ejercicio1.*;
public class ContadorArbol {
	BinaryTree<Integer> arbolEnteros;
	
	public void cargarArbol() {
		arbolEnteros= new BinaryTree<Integer>(5);
		BinaryTree<Integer> nodo1= new BinaryTree(2);
		BinaryTree<Integer> nodo2= new BinaryTree(4);
		BinaryTree<Integer> nodo3= new BinaryTree(7);
		BinaryTree<Integer> nodo4= new BinaryTree(8);
		
		nodo1.addLeftChild(nodo3);
		nodo1.addRightChild(nodo4);
		nodo2.addRightChild(nodo4);
		arbolEnteros.addLeftChild(nodo1);
		arbolEnteros.addRightChild(nodo2);
		arbolEnteros.contarHojas();
	}
	
	public List<Integer> numerosParesInOrden(){
		List<Integer> lista= new LinkedList<Integer>();
		numerosParesInOrden(arbolEnteros,lista);
		return lista;
	}

	public List<Integer> numerosParesPostOrden(){
		List<Integer> lista= new LinkedList<Integer>();
		numerosParesPostOrden(arbolEnteros,lista);
		return lista;
	}
	
	public void numerosParesPostOrden(BinaryTree<Integer> arbol, List <Integer> lista){
		if (arbol==null) {
			return;
		}else {
			numerosParesPostOrden(arbol.getLeftChild(),lista);
			numerosParesPostOrden(arbol.getRightChild(),lista);
			if (arbol.getData() % 2 == 0) {
				lista.add(arbol.getData());
			}
		}		
	}
	
	public void numerosParesInOrden(BinaryTree<Integer> arbol, List<Integer> lista){
		if (arbol==null) {
			return;
		}else {
			numerosParesInOrden(arbol.getLeftChild(),lista);
			if (arbol.getData()% 2 == 0) {
				lista.add(arbol.getData());
			}
			numerosParesInOrden(arbol.getRightChild(),lista);
		}
	}
}
