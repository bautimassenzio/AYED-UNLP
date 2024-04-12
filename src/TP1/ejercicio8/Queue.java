package TP1.ejercicio8;

import java.util.*;

public class Queue<T> {
	protected LinkedList<T> data;
	
	public Queue() {
		data = new LinkedList<>();
	}
	
	public void enqueue(T element) {
		data.addLast(element);
	}
	
	public T dequeue() {
		if (data.isEmpty()) {
			throw new IllegalStateException("Vacia"); 
		}else {
			return data.removeFirst();
		}
	}
	
	public T head() {
		if (data.isEmpty()) {
			throw new IllegalStateException("Vacia");
		}else {
			return data.getFirst();
		}
	}
	
	public boolean isEmpty() {
		return data.isEmpty();
	}
	
	public String toString() {
		return data.toString();
	}
	
	
}
