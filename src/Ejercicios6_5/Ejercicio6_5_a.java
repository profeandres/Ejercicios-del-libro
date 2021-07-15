package Ejercicios6_5;
import java.util.Scanner;
/*
Construir un programa Java que permita leer su edad y mostrar la mitad
de su edad
*/
public class Ejercicio6_5_a {
    private static Scanner op;
    public static void main(String[] args) {
        op = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        double edad= op.nextDouble();
        System.out.println("La mitad de su edad es: "+ edad/2);
    }    
}
