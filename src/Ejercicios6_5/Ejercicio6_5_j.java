package Ejercicios6_5;
import java.util.Scanner;

/*
Construir un programa Java que recibe tres de sus datos personales y
los muestre por consola de forma organizada
*/
public class Ejercicio6_5_j {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        String EstCivil,Nombre,Apellido;
        System.out.println("Ingres su nombre: ");
        Nombre=op.nextLine();
        System.out.println("Ingres su apellido: ");
        Apellido=op.nextLine();
        System.out.println("Ingres su Estado Civil: ");
        EstCivil=op.nextLine();
        System.out.println("\n\n\n-----Información Personal-----");
        System.out.println("Nombre: "+Nombre+"\nApellido: "+Apellido+"\nEstado Civil: "+EstCivil);
    }
    
}