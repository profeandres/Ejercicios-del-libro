package Ejercicios4_4;
/*
Construir un programa que calcule el valor de elevar el número e a la
potencia 4
*/
public class Ejercicio4_4_P1_g {
    public static void main(String[] args) {
        System.out.println("el número e elevado a la 4 es: "+(double) Math.round(Math.pow(Math.E,4)*10000)/10000);
    }
}
