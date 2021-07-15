package Ejercicios7_2_1;
import java.util.Scanner;
/*
Construir un programa que lea un número entero y determine si la
mitad es mayor que 100
*/
public class Ejercicio7_2_1_f {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        System.out.println("Ingresa un número entero: ");
        int num=op.nextInt();
        if ((num/2)>100){
            System.out.println("La mitad de "+num+" es mayor que 100");
        } else{
            System.out.println("La mitad de "+num+" no es mayor que 100");
        }
    }
}
