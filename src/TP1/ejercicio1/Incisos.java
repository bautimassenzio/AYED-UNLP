package TP1.ejercicio1;

public class Incisos {
	
	public static void incisoA (int a, int b) {
		for (int i=a; i<=b; i++) {
			System.out.println(i);
		}
	}
	
	public static void incisoB(int a, int b) {
		int i =a;
		while (i<=b) {
			System.out.println(i);
			i++;
		}
	}
	
	public static void incisoC(int a, int b) {
		if (a<=b) {
			System.out.println(a);
			incisoC(a+1,b);
		}
	}
}
