package Ejercicios6_5;

import java.util.Scanner;

/*
Construir un programa Java que permita leer su nombre, después leer
su apellido y mostrar en pantalla su nombre concatenado con su
apellido en una sola variable
*/
public class Ejercicio6_5_c {
    private static Scanner op;
    public static void main(String[] args) {
        op = new Scanner(System.in);
        System.out.print("escribe tu nombre: ");
        String nombre= op.next();
        System.out.print("escribe tu apellido: ");
        String apellido= op.next();
        String contatena=nombre+" "+apellido;
        System.out.println(contatena);
    }
}
