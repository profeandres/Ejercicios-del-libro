package Ejercicios8_2_2;
import java.util.Scanner;
/*
Construir un programa que permita leer un número entero y mostrar
todos los enteros comprendidos entre 1 y la mitad del número leído
*/
public class Ejercicio8_2_2_a {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        int num=op.nextInt();
        int i=1;
        while(i<=((int) num/2)){
            System.out.print(i +"\t");
            i++;
        }
    }
}
