package Ejercicios8_2_2;
/*
Construir un programa que muestre por consola 10 números aleatorios
comprendidos entre 1 y 100
*/
public class Ejercicio8_2_2_h {

    public static void main(String[] args) {
        int i=0;
        while (i<10){
            System.out.print((int) (Math.random()*100)+"\t");
            i++;
        }
    }
}
