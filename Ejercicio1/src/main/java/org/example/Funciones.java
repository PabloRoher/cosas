package org.example;

public class Funciones {
    int x;
    int y;

    int solucionM = 1;

    int contarM = 1;

    public Funciones(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Funciones() {
    }

    public int multiplicacion(int x,int y) {
        solucionM *= x;
        if (y == contarM){
            return solucionM;
        }else {
            contarM++;
            return multiplicacion(x,y);
        }
    }

    


}
