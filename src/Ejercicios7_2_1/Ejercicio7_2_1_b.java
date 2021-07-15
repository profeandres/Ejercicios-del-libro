package Ejercicios7_2_1;
import java.util.Scanner;
/*
Construir un programa que lea dos números enteros y determine si el
1º valor leído es mayor que el 2º valor leído
*/
public class Ejercicio7_2_1_b {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        int num1,num2;
        System.out.println("ingresa dos números enteros para saber cual es mayor\n");
        System.out.println("Ingresa el primer número: ");
        num1=op.nextInt();
        System.out.println("Ingresa el segundo número: ");
        num2=op.nextInt();
        
        if (num1>num2){
            System.out.println("el número "+num1+" es mayor que "+num2);
        } else if (num1<num2){
            System.out.println("el número "+num2+" es mayor que "+num1);
        }
    }
}
