package Ejercicios8_2_2;
import java.util.Scanner;
/*
Construir un programa que permita leer un número entero y mostrar
todos los enteros comprendidos 1 y la parte entera de la raíz cúbica del
número leído
*/
public class Ejercicio8_2_2_c {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        System.out.println("Digite un número");
        int num=op.nextInt();
        int i=1;
        while(i<=((int) Math.cbrt(num))){
            System.out.println(i+"\t");
            i++;
        }
    }
}
