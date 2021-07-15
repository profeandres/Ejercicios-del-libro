package Ejercicios8_3_2;
import java.util.Scanner;
/*
Construir un programa Java que permita leer un número entero y
determinar cuántos dígitos impares tiene
*/
public class Ejercicio8_3_2_c {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        System.out.println("Digite un número entero: ");
        int num=op.nextInt(); 
        int numdo=num,cifras=0;
        do{
            if (numdo%2!=0){
                cifras++;
            }
            numdo=numdo/10;
        }while(numdo!=0);
        System.out.println("el número "+num+" tiene "+cifras+" cifras impares");
    }
}
