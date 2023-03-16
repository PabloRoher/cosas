package org.example;

import java.util.Scanner;

public class Menu {

    public void menu(){

        boolean bucle = true;

        while (bucle) {

            System.out.println("Elige una opcion");
            System.out.println("1. Recursividad mediante multiplicacion sucesiva");
            System.out.println("2. Recursividad mediante logaritmos");
            System.out.println("3. Salir");

            Scanner sc = new Scanner(System.in);
            int opcion = sc.nextInt();
            Funciones f = new Funciones();
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Introduce el primer numero");
            int x = sc2.nextInt();
            System.out.println("Introduce el segundo numero");
            int y = sc2.nextInt();

            System.out.println(f.multiplicacion(x, y));
            switch (opcion) {
                case 1:
                    f.multiplicacion(x, y);
                    break;
                case 2:
                    f.calcularPorLog(x,y);
                    break;
                case 3:
                    bucle = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    menu();
            }
        }


    }
}
