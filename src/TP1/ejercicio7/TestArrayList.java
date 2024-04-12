package TP1.ejercicio7;

import java.util.Scanner;
import java.util.*;

public class TestArrayList {
	
	public static List<Integer> calcularSucesion(int n){
		List <Integer> lista = new ArrayList<>();
		lista.add(n);
		if (n!=1) {
			int aux;
			if (n % 2 == 0) {
				aux = n/2;
			} else {
				aux = 3*n + 1;
			}
			lista.addAll(calcularSucesion(aux));
		}
		return lista;
	}
	
	public static void invertirLista(List<Integer> lista) {
		if (lista.size()>1) {
			int num = lista.remove(0);
			invertirLista(lista);
			lista.add(num);
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//DECLARO ARRAYLIST
		ArrayList<Integer> listaEnteros = new ArrayList<>();
		
		int num;
		for (int i=0; i<5; i++) {
			System.out.println("Ingrese un numero");
			num = scanner.nextInt();
			listaEnteros.add(num);
		}
		
		//IMPRIMO
		System.out.println("Imprimo");
		
		for (int i=0;i<listaEnteros.size();i++) {
			System.out.println(listaEnteros.get(i));
		}
		
		//INCISO G 
		System.out.println("Inciso G Recursivo: n= 6");
		List<Integer> listaRecu= new ArrayList<>();
		listaRecu= calcularSucesion(6);
		
		for (int i=0; i<listaRecu.size();i++) {
			System.out.println(listaRecu.get(i));
		}
		
		//INVERTIR LISTA INCISO H
		System.out.println("Inciso H INVERTIR LISTA");
		invertirLista(listaRecu);
		for (int i=0; i<listaRecu.size();i++) {
			System.out.println(listaRecu.get(i));
		}
	}

}
