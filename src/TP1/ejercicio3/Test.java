package TP1.ejercicio3;

public class Test {

	public static void main(String[] args) {
		Estudiante estudiantes[]= new Estudiante [2];
		Profesor profesores[]= new Profesor[3];
		
		Profesor profesor1= new Profesor("pepito", "tocamela", "puto@gmail.com", "2","unlp");
		Profesor profesor2= new Profesor("pepito2", "tocamela2", "puto@gmail.com2", "22","unlp2");
		Profesor profesor3= new Profesor("pepito3", "tocamela3", "puto@gmail.com3", "23","unlp3");
		
		profesores[0]=profesor1;
		profesores[1]=profesor2;
		profesores[2]=profesor3;
		
		Estudiante estudiante1= new Estudiante("ricardo","mamalo","2","gay@gmail.com","calle 43");
		Estudiante estudiante2= new Estudiante("ricardo2","mamalo2","22","gay@gmail.com2","calle 432");
		
		estudiantes[0]=estudiante1;
		estudiantes[1]=estudiante2;
		
		System.out.println("Imprimo profesores");
		
		for (int i=0; i<3; i++) {
			System.out.println(profesores[i].tusDatos());
		}
		
		System.out.println("Imprimo estudiantes");
		
		for (int i=0; i<2; i++) {
			System.out.println(estudiantes[i].tusDatos());
		}
		
	}

}
