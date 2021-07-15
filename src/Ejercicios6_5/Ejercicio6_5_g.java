package Ejercicios6_5;

import java.util.Scanner;

/*
Construir un programa Java que permita leer su estatura y determinar
a cuánto es igual la raíz cuadrada de su edad
*/
public class Ejercicio6_5_g {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        System.out.println("Digite su estatura");
        double estatura=op.nextDouble();
        System.out.println("La raiz cuadrada de su estatura es: "+ ((double) Math.round(Math.sqrt(estatura)*100)/100));
    }
}
