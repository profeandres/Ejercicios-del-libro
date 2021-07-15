package Ejercicios7_2_1;
import java.util.Scanner;
/*
Construir un programa que lea dos números enteros y determine si la
suma de los dos números es mayor que 100
*/
public class Ejercicio7_2_1_c {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        int num1,num2;
        System.out.println("ingresa dos números enteros para saber cual es mayor\n");
        System.out.println("Ingresa el primer número: ");
        num1=op.nextInt();
        System.out.println("Ingresa el segundo número: ");
        num2=op.nextInt();
        
        if (num1+num2>100){
            System.out.println("la suma de "+num1+" y "+num2+" es mayor que 100");
        } else {
            System.out.println("la suma de "+num1+" y "+num2+" no es mayor que 100");
        }
    }
}
