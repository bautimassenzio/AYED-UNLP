package TP3.ejercicio1;

public class ejercicio1 {

	public static void main(String[] args) {
		/*GeneralTree<String> root = new GeneralTree<>("Raíz");

		GeneralTree<String> nivel1 = new GeneralTree<>("Nivel 1");
		root.addChild(nivel1);

		GeneralTree<String> nivel2 = new GeneralTree<>("Nivel 2");
		nivel1.addChild(nivel2);

		GeneralTree<String> nivel3 = new GeneralTree<>("Nivel 3");
		nivel2.addChild(nivel3);

		GeneralTree<String> nivel4 = new GeneralTree<>("Nivel 4");
		GeneralTree<String> nivel5 = new GeneralTree<>("Nivel 5");
		nivel3.addChild(nivel4);
		nivel3.addChild(nivel4);
		nivel3.addChild(nivel4);
		nivel3.addChild(nivel4);
		nivel3.addChild(nivel5);
		
		System.out.println(root.altura());
		
		System.out.println(root.nivel("Nivel 4"));
		
		System.out.println(root.ancho()); */
		
		GeneralTree<Integer> root = new GeneralTree<>(1);

		GeneralTree<Integer> child1 = new GeneralTree<>(2);
		GeneralTree<Integer> child2 = new GeneralTree<>(3);
		root.addChild(child1);
		root.addChild(child2);

		GeneralTree<Integer> grandChild1 = new GeneralTree<>(4);
		GeneralTree<Integer> grandChild2 = new GeneralTree<>(5);
		child1.addChild(grandChild1);
		child1.addChild(grandChild2);

		GeneralTree<Integer> grandChild3 = new GeneralTree<>(6);
		child2.addChild(grandChild3);

		GeneralTree<Integer> greatGrandChild1 = new GeneralTree<>(7);
		grandChild1.addChild(greatGrandChild1);

		System.out.println(root.ancho());
	}

}
