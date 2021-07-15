package Ejercicios8_3_2;
import java.util.Scanner;
/*
Construir un programa Java que permita leer un número entero 
y determinar cuántos dígitos pares tiene
*/
public class Ejercicio8_3_2_b {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        System.out.println("Digite un número entero: ");
        int num=op.nextInt();
        int numdo=num,cifras=0;
        do{
            if (numdo%2==0){
                cifras++;
            }
            numdo=numdo/10;
        }while(numdo!=0);

        System.out.println("El número "+num+" tiene "+cifras+ " cifras pares");
       
        /* int prueba=456/10;
        System.out.println(prueba);
        System.out.println(prueba%2);
        prueba/=10;
        System.out.println(prueba);
        System.out.println(prueba%2); */
    }
}