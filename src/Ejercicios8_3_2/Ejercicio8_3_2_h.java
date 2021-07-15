package Ejercicios8_3_2;
import java.util.Scanner;
/*
Construir un programa Java que lea una cadena y determine cuántas
vocales tiene
*/
public class Ejercicio8_3_2_h {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        System.out.println("Introduzca una cadena de texto (frase corta o palabra)");
        String cad=op.nextLine();
        char vocal;
        int i=0,vocales=0;
        do{
             vocal=cad.charAt(i);
             if (vocal=='a'|vocal=='e'|vocal=='i'|vocal=='o'|vocal=='u'){
                vocales++;
             }
             i++;
        }while(i<cad.length());
        System.out.println("la cadena de texto "+cad+" tiene "+vocales+ " vocales.");

    }
}
