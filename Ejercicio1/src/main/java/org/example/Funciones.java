package org.example;

public class Funciones {
    int x;
    int y;

    int solucion = 1;


    public Funciones(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Funciones() {
    }

    public double multiplicacion(int x,int y) {
        solucion *= x;
        if (y == 1){
            return solucion;
        }else {
            y--;
            return multiplicacion(x,y);
        }
    }

    public double calcularPorLog(int x, int y) {
        if (y == 0) {
            return 1;
        }
        double temp = calcularPorLog(x, y / 2);
        if (y % 2 == 0) {
            return temp * temp;
        } else {
            return x * temp * temp;
        }
    }


}
