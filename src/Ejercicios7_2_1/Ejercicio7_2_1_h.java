package Ejercicios7_2_1;
import java.util.Scanner;
/*
Construir un programa que lea tres números enteros y determine cuál
es el menor
*/
public class Ejercicio7_2_1_h {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        System.out.println("---Comparemos tres números y veamos cual es el mayor--- \nIngresa el primer número: ");
        int num1=op.nextInt();
        System.out.println("Ingresa el segundo número: ");
        int num2=op.nextInt();
        System.out.println("Ingresa el tercer número: ");
        int num3=op.nextInt();
        int NumMenor=num1;
        if (num2<NumMenor){
            NumMenor=num2;
        }
        if (num3<NumMenor){
            NumMenor=num3;
        }
        System.out.println("El número menor  es: "+NumMenor);
        }
}
   
