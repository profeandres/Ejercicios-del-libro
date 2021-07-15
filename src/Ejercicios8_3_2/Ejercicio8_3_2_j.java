package Ejercicios8_3_2;
import java.util.Scanner;
/*
Construir un programa Java que lea una cadena y determine cuántas
veces está una vocal que digite el mismo usuario
*/
public class Ejercicio8_3_2_j {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        System.out.println("Please, introduce a string (a short phrase or word)");
        String cad=op.nextLine();
        System.out.println("Please, introduce the vowel you want to count: ");
        char vowel=(op.nextLine()).charAt(0);
        int i=0,countvowel=0;
        do{
            char chartest=cad.charAt(i);
            if (vowel==chartest){
                countvowel++;
            }
            i++;
        }while(i<cad.length());
        System.out.println("The string typed has "+countvowel+" vowels "+vowel);
    }
}
