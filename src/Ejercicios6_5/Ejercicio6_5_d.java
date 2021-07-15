package Ejercicios6_5;
import java.util.Scanner;
/*
Construir un programa Java que permita leer su nombre y mostrar
solamente las dos primeras letras
*/
public class Ejercicio6_5_d {
    private static Scanner op;
    public static void main(String[] args) {
        op = new Scanner(System.in);
        System.out.println("Escribe tu nombre ");
        String nombre=op.nextLine();
        System.out.println(nombre.substring(0, 2));
    }
}
