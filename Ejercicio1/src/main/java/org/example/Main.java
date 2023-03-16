package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Funciones f = new Funciones();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        int x = sc.nextInt();
        System.out.println("Introduce el segundo numero");
        int y = sc.nextInt();

        System.out.println(f.multiplicacion(x,y));
    }
}