package Ejercicios6_5;
import java.util.Scanner;

/*
Construir un programa Java que permita leer su edad y determina
cuántos años tendrá dentro 10 años
*/
public class Ejercicio6_5_b {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        System.out.println("ingrese su edad");
        int edad=op.nextInt();
        System.out.println("Dentro de 10 años tendrás "+(edad+10));
    }
}
