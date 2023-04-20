package com.pperezm;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        int inicio = 0;

        SortedSet<Integer> conjuntoA = new TreeSet<>();
        SortedSet<Integer> conjuntoB = new TreeSet<>();
        SortedSet<Integer> conjuntoC = new TreeSet<>();

        inicio = 0;
        while (inicio < 1000) {
            inicio++;
            conjuntoA.add(inicio);

            if (inicio % 3 == 0) {
                conjuntoB.add(inicio);
            }

            if (inicio % 5 == 0) {
                conjuntoC.add(inicio);
            }

        }

        Iterator valoresConjuntoA = conjuntoA.iterator();
        System.out.println("Los valores del conjunto A son: ");
        while (valoresConjuntoA.hasNext()) {
            System.out.println(valoresConjuntoA.next());
        }
        Iterator valoresConjuntoB = conjuntoB.iterator();
        System.out.println("Los valores del conjunto B son: ");
        while (valoresConjuntoB.hasNext()) {
                System.out.println(valoresConjuntoB.next());

        }
        Iterator valoresConjuntoC = conjuntoC.iterator();
        System.out.println("Los valores del conjunto C son: ");
        while (valoresConjuntoC.hasNext()) {
            System.out.println(valoresConjuntoC.next());

        }
        int tamañoA = conjuntoA.size();
        int tamañoB = conjuntoB.size();
        int tamañoC = conjuntoC.size();

        System.out.println("El tamaño del conjunto A = " + tamañoA);
        System.out.println("El tamaño del conjunto B = " + tamañoB);
        System.out.println("El tamaño del conjunto C = " + tamañoC);


        conjuntoB.addAll(conjuntoC);
        System.out.println("B union C contiene: " + conjuntoB);
        System.out.println("B union C el tamaño es: " + conjuntoB.size());



    }

}

