package TP1.ejercicio8;

public class CircularQueue <T> extends Queue <T>{
	
	public T shift() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T firstElement = data.removeFirst();
        data.addLast(firstElement);
        return firstElement;
    }
}
