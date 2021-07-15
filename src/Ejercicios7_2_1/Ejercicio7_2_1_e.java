package Ejercicios7_2_1;
import java.util.Scanner;
/*
Construir un programa que lea un número entero y determine cuántos
dígitos tiene
*/
public class Ejercicio7_2_1_e {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        System.out.println("Ingresa un número entero: ");
        int num=op.nextInt();
        String num1= String.valueOf(num);
        System.out.println("El número "+num+" tiene "+num1.length()+" dígitos");

    }
}
