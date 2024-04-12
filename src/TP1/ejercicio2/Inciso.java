package TP1.ejercicio2;

public class Inciso {
	
	public static int[] arregloN(int n) {
		int[] arreglo = new int [n];
		for (int i=0; i<n; i++) {
			arreglo[i]= n*(n+1);
		}
		return arreglo;
	}
}
