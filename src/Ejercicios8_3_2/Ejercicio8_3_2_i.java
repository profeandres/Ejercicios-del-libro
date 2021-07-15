package Ejercicios8_3_2;

import java.util.Scanner;

/*
Construir un programa Java que lea una cadena y determine cuántas
veces está la vocal e
*/
public class Ejercicio8_3_2_i {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        System.out.println("Ingrese una cadena de texto (palabra o frase corta)");
        String cad=op.nextLine();
        char vocal;
        int vocal_e=0,i=0;
        do{
            vocal=cad.charAt(i);
            if (vocal=='e'){
                vocal_e++;
            }
            i++;
        }while(i<cad.length());
        System.out.println("La cadena "+cad+" tiene "+vocal_e+" vocales e.");
    }
}
