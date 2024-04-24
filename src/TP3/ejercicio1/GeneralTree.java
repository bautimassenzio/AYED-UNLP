package TP3.ejercicio1;

import java.util.LinkedList;
import java.util.List;

import TP1.ejercicio8.Queue;

public class GeneralTree<T>{

	private T data;
	private List<GeneralTree<T>> children = new LinkedList<GeneralTree<T>>(); 

	public GeneralTree() {
		
	}
	public GeneralTree(T data) {
		this.data = data;
	}

	public GeneralTree(T data, List<GeneralTree<T>> children) {
		this(data);
		this.children = children;
	}	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public List<GeneralTree<T>> getChildren() {
		return this.children;
	}
	
	public void setChildren(List<GeneralTree<T>> children) {
		if (children != null)
			this.children = children;
	}
	
	public void addChild(GeneralTree<T> child) {
		this.getChildren().add(child);
	}

	public boolean isLeaf() {
		return !this.hasChildren();
	}
	
	public boolean hasChildren() {
		return !this.children.isEmpty();
	}
	
	public boolean isEmpty() {
		return this.data == null && !this.hasChildren();
	}

	public void removeChild(GeneralTree<T> child) {
		if (this.hasChildren())
			children.remove(child);
	}
	
	public int altura() {	 
		if (this.isEmpty()) {	
			return 0;
		}else {
			return altura(this);
		}
	}
	
	private int altura(GeneralTree<T> arbol) {
		if (arbol.hasChildren()) {
			int max= 0;
			int hijo;
			for (GeneralTree<T> child: arbol.getChildren()) {
				hijo = altura (child);
				if (hijo>max) {
					max=hijo;
				}
			}
			return max + 1;
		}else {
			return 0;
		}
	}
	
	
	public int nivel(T dato){
		if (this.isEmpty()) {
			return -1; //no se encuentra
		}else {
			int nivel=0;
			GeneralTree<T> aux;
			Queue <GeneralTree<T>> queue = new Queue<GeneralTree<T>>();
			queue.enqueue(this);
			queue.enqueue(null);
			while (!queue.isEmpty()) {
				aux = queue.dequeue();
				if (aux!=null) {
					if (aux.getData().equals(dato)) {
						return nivel;
					}
					List <GeneralTree<T>> children = aux.getChildren();
					for (GeneralTree<T> child: children) {
						queue.enqueue(child);
					}
				}else {
					nivel++;
					if (!queue.isEmpty()) {
						queue.enqueue(null);
					}
				}
			}
			return -1; //no se encuentra
		}
	  }

	public int ancho(){
		if (this.isEmpty()) {
			return -1;
		}else {
			int nodos=0;
			int max=-1;
			GeneralTree<T> aux;
			Queue <GeneralTree<T>> queue = new Queue<GeneralTree<T>>();
			queue.enqueue(this);
			queue.enqueue(null);
			while (!queue.isEmpty()) {
				aux=queue.dequeue();
				if (aux!=null) {
					nodos++;
					List <GeneralTree<T>> children = aux.getChildren();
					for (GeneralTree<T> child : children) {
						queue.enqueue(child);
					}
				}else {
					if (nodos>max) {
						max=nodos;
					}
					if (!queue.isEmpty()) {
						queue.enqueue(null);
					}
					nodos=0;
				}
			}
			return max;
		}
	}
	
	public boolean esAncestro(T a, T b) {
		if (this.isEmpty()) {
			return false;
		}else {
			GeneralTree<T> ancestro = buscarAncestro(a,this);
			if (ancestro!=null) {
				return buscar(ancestro,b);
			}
			return false;
		}
	}
	
	private GeneralTree<T> buscarAncestro(T a,GeneralTree<T>arbol){
		if (arbol.getData().equals(a)) {
			return arbol;
		}
		List<GeneralTree<T>> children = arbol.getChildren();
		for(GeneralTree<T> child: children) {
			GeneralTree<T> aux = buscarAncestro(a,child);
			if(aux!=null) {
				return aux;
			}
		}
		return null;
	}
	
	private boolean buscar (GeneralTree<T>arbol, T b) {
		if (arbol.getData().equals(b)) {
			return true;
		}
		for (GeneralTree<T> child: arbol.getChildren()) {
			boolean resultado = buscar(child,b);
			if (resultado) {
				return true;
			}
		}
		return false;
	}
}