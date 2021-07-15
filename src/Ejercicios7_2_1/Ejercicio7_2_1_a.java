package Ejercicios7_2_1;
import java.util.Scanner;
/*
Construir un programa que lea un número entero y determine si es
menor que 500
*/
public class Ejercicio7_2_1_a {
    private static Scanner op;
    public static void main(String[] args) {
    op=new Scanner(System.in);
    System.out.println("Ingrese un número entero: ");
    int num=op.nextInt();
    if (num<500){
        System.out.println("el número "+num+" es menor que 500");
    }else if (num==500){
        System.out.println("el número "+num+" es igual a 500");
    }else if (num>500){
        System.out.println("el número "+num+" es mayor que 500");
    }
    }
}
