package TP1.ejercicio5;

public class Procesar {
	private int max;
	private int min;
	private double prom;
	
	
	
	public Procesar(int max, int min, double prom) {
		super();
		this.max = max;
		this.min = min;
		this.prom = prom;
	}
	
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public double getProm() {
		return prom;
	}
	public void setProm(double prom) {
		this.prom = prom;
	}
	
	
	public static Procesar procesarArreglo(int [] arreglo) {
		int dim = arreglo.length;
		int max = -1;
		int min = 9999;
		int suma=0;
		for (int i=0; i<dim; i++) {
			if (arreglo[i]>max) {
				max=arreglo[i];
			}
			if (arreglo[i]<min) {
				min=arreglo[i];
			}
			suma= suma + arreglo[i];
			
		}
		double prom= suma/dim;
		
		return new Procesar(max,min,prom);
		
	}
	
	public static void procesarArregloB(int [] arreglo, Procesar objeto) {
		int dim = arreglo.length;
		int max = -1;
		int min = 9999;
		int suma=0;
		for (int i=0; i<dim; i++) {
			if (arreglo[i]>max) {
				max=arreglo[i];
			}
			if (arreglo[i]<min) {
				min=arreglo[i];
			}
			suma= suma + arreglo[i];
			
		}
		double prom= suma/dim;
		objeto.setMax(max);
		objeto.setMin(min);
		objeto.setProm(prom);
	}
	
}
