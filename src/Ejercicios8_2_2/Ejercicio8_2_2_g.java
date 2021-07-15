package Ejercicios8_2_2;
import java.util.Scanner;
/*
Construir un programa que permita leer una cadena y mostrarla por
consola carácter por carácter (verticalmente)
*/
public class Ejercicio8_2_2_g {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        System.out.println("Escribe una palabra o frase corta");
        String cadena=op.nextLine();
        int i=0;
        while (i<cadena.length()){
            System.out.println(cadena.charAt(i));
            i++;
        }
    }
}
