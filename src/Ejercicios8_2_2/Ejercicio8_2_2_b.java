package Ejercicios8_2_2;
import java.util.Scanner;
/*
Construir un programa que permita leer un número entero y mostrar
todos los enteros comprendidos entre 1 y la parte entera de la raíz
cuadrada del número leído
*/
public class Ejercicio8_2_2_b {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        System.out.println("Digite un número");
        int num=op.nextInt();
        int i=1;
        while(i<=((int) Math.sqrt(num))){
            System.out.print(i+"\t");
            i++;
        }

    }
}
