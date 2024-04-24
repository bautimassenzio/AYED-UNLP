package TP3.ejercicio4;

import TP3.ejercicio1.GeneralTree;

public class ejercicio4 {
    public static void main(String[] args) {
        // Crear instancias de AreaEmpresa
        AreaEmpresa area1 = new AreaEmpresa("Area1", 10);
        AreaEmpresa area2 = new AreaEmpresa("Area2", 20);
        AreaEmpresa area3 = new AreaEmpresa("Area3", 30);
        AreaEmpresa area4 = new AreaEmpresa("Area4", 40);
        AreaEmpresa area5 = new AreaEmpresa("Area5", 50);

        // Crear nodos del árbol
        GeneralTree<AreaEmpresa> nodo1 = new GeneralTree<>(area1);
        GeneralTree<AreaEmpresa> nodo2 = new GeneralTree<>(area2);
        GeneralTree<AreaEmpresa> nodo3 = new GeneralTree<>(area3);
        GeneralTree<AreaEmpresa> nodo4 = new GeneralTree<>(area4);
        GeneralTree<AreaEmpresa> nodo5 = new GeneralTree<>(area5);

        // Añadir hijos a los nodos
        nodo3.addChild(nodo5);
        nodo2.addChild(nodo4);
        nodo1.addChild(nodo3);
        nodo1.addChild(nodo2);
        
        
        

        AnalizadorArbol analizador = new AnalizadorArbol();
        System.out.println(analizador.devolverMaximoPromedio(nodo1));
    }
}

