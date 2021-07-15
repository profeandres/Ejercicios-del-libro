package Ejercicios8_3_2;
import java.util.Scanner;
/*
Construir un programa Java que lea una cadena y que determine
cuántas sílabas tiene
*/
public class Ejercicio8_3_2_k {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        System.out.println("type a string of characters");
        String cad=op.nextLine();
        int i=0,vowels=0;
        do{
            char vowel=cad.charAt(i);
            if (vowel=='a' | vowel=='e'|vowel=='i'|vowel=='o'|vowel=='u'){
                vowels++;
            }
        }while(i<cad.length());

        System.out.println("There are "+vowels+" Syllables");


    }
}
