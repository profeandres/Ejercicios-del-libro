package Ejercicios8_3_2;
import java.util.Scanner;
/*
Construir un programa Java que permita leer un número entero y determinar cuántos dígitos tiene.
*/
public class Ejercicio8_3_2_a {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        System.out.println("Digite un número entero: ");
        int num=op.nextInt();
        int cifras=0,numdo=num;
        do{
            numdo=numdo/10;
            cifras++;
        } while (numdo!=0);

        System.out.println("El número "+num+" tiene "+cifras+" cifras");
    }
}
