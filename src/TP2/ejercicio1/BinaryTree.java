package TP2.ejercicio1;

import TP1.ejercicio8.Queue;

public class BinaryTree <T> {
	private T data;
	private BinaryTree<T> leftChild;   
	private BinaryTree<T> rightChild; 

	
	public BinaryTree() {
		super();
	}

	public BinaryTree(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	/**
	 * Preguntar antes de invocar si hasLeftChild()
	 * @return
	 */
	public BinaryTree<T> getLeftChild() {
		return leftChild;
	}
	/**
	 * Preguntar antes de invocar si hasRightChild()
	 * @return
	 */
	public BinaryTree<T> getRightChild() {
		return this.rightChild;
	}

	public void addLeftChild(BinaryTree<T> child) {
		this.leftChild = child;
	}

	public void addRightChild(BinaryTree<T> child) {
		this.rightChild = child;
	}

	public void removeLeftChild() {
		this.leftChild = null;
	}

	public void removeRightChild() {
		this.rightChild = null;
	}

	public boolean isEmpty(){
		return (this.isLeaf() && this.getData() == null);
	}

	public boolean isLeaf() {
		return (!this.hasLeftChild() && !this.hasRightChild());

	}
		
	public boolean hasLeftChild() {
		return this.leftChild!=null;
	}

	public boolean hasRightChild() {
		return this.rightChild!=null;
	}
	@Override
	public String toString() {
		return this.getData().toString();
	}

	public  int contarHojas() { //preguntar por null al principio
	   if (!this.isEmpty()) {
		   
		   if (this.isLeaf()) {
			   return 1;
		   } else { 
			   int hojaIz = 0;
			   int hojaDe = 0;
			   if (this.hasLeftChild()) {
				   hojaIz = this.getLeftChild().contarHojas();	   
			   }
			   if (this.hasRightChild()) {
				   hojaDe = this.getRightChild().contarHojas();
			   }
		   
			   return hojaIz + hojaDe;
		   	}
	} else {
		return 0;
	   }
	}
		
    	 
    public BinaryTree<T> espejo(){
    	BinaryTree<T> arbolEspejo = new BinaryTree<T>();
    	if (!this.isEmpty()) {
    		arbolEspejo.setData(this.getData());
    		if (this.hasLeftChild()) {
    			arbolEspejo.addRightChild(this.getLeftChild().espejo());
    		}
    		if (this.hasRightChild()) {
    			arbolEspejo.addLeftChild(this.getRightChild().espejo());
    		}
    	}
    	return arbolEspejo;
    }

	// 0<=n<=m
	public void entreNiveles(int n, int m){
		BinaryTree<T> aux = null;
		Queue<BinaryTree<T>> cola = new Queue<BinaryTree<T>>();
		cola.enqueue(this); //encolo este arbol
		cola.enqueue(null); //marca fin de nivel
		int nivel = 0; // contador de nivel
		while (!cola.isEmpty() && nivel<= m) { //Mientras la cola no este vacia y el nivel actual sea menor a m
			aux = cola.dequeue();
			if (aux != null) { //es un arbol
				if (nivel>=n && nivel<=m)
					System.out.println(aux.getData());
				if (aux.hasLeftChild())
					cola.enqueue(aux.getLeftChild()); //si existen hijos se encolan
				if (aux.hasRightChild())
					cola.enqueue(aux.getRightChild());
			}else { //es una marca de finl de nivel
				nivel++;
				if (!cola.isEmpty())
					cola.enqueue(null);
			}
		}
   }
		
}
