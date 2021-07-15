package Ejercicios7_2_1;
import java.util.Scanner;
/*
Construir un programa que lea tres números enteros y determine cuál
es el mayor
*/
public class Ejercicio7_2_1_g {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        System.out.println("---Comparemos tres números y veamos cual es el mayor--- \nIngresa el primer número: ");
        int num1=op.nextInt();
        System.out.println("Ingresa el segundo número: ");
        int num2=op.nextInt();
        System.out.println("Ingresa el tercer número: ");
        int num3=op.nextInt();
        int NumMayor=num1;
        if (num2>NumMayor){
            NumMayor=num2;
        }
        if (num3>NumMayor){
            NumMayor=num3;
        }
        System.out.println("El número más grande es: "+NumMayor);
        }
}
