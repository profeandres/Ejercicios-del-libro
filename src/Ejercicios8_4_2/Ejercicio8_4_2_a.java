package Ejercicios8_4_2;

import java.util.Scanner;

/*
Construir un programa Java que permita leer un número entero
positivo y mostrar todos los números comprendidos entre 1 y el
número leído
*/
public class Ejercicio8_4_2_a {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        int num=op.nextInt();
        for (int i=1;i<num;i++){
            System.out.println(i);
        }
    }
}
