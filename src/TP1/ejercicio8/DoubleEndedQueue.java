package TP1.ejercicio8;

public class DoubleEndedQueue<T> extends Queue<T> {
	
	public void enqueueFirst(T element) {
		data.addFirst(element);
	}
}
