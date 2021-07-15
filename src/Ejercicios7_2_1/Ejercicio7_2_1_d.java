package Ejercicios7_2_1;
import java.util.Scanner;
/*
Construir un programa que lea dos números enteros y determine si el
producto de estos dos números es menor que 300
*/
public class Ejercicio7_2_1_d {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        System.out.println("Ingresa dos números enteros: ");
        System.out.println("Ingresa el primer número: ");
        int num1=op.nextInt();
        System.out.println("Ingresa el segundo número: ");
        int num2=op.nextInt();
        if(num1*num2<300){
            System.out.println("El producto de "+num1+" y "+num2+ " es menor que 300");
        } else{
            System.out.println("El producto de "+num1+" y "+num2+ " no es menor que 300");
        }
    
    }
}
