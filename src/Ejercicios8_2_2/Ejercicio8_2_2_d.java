package Ejercicios8_2_2;
import java.util.Scanner;
/*
Construir un programa que permita leer dos números enteros y mostrar
todos los números enteros comprendidos entre el número menor y el
número mayor
*/

public class Ejercicio8_2_2_d {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        System.out.print("Digite dos número enteros \n\nPrimer número: ");
        int num1=op.nextInt();
        System.out.print("Segundo número: ");
        int num2=op.nextInt();
        while (num1<=num2){
            System.out.println(num1+"\t");
            num1++;
        }
    }
}
