package Ejercicios9_7;
import java.util.Arrays;
import java.util.Scanner;
/*
Construir un programa que lea un conjunto de 10 datos y, después de
leídos, determine en qué posición está el menor número impar
*/
public class Ejercicio9_7_d {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        int Vector1[]=new int[10];
        System.out.println("Introduzca los 10 números enteros del vector");
        for (int i=0;i<10;i++){
            Vector1[i]=op.nextInt();
        }
        System.out.println(Arrays.toString(Vector1));
        int numimparmenor=0;
        int posicion=0;
        for (int i=0;i<10;i++){
            if (Vector1[i]%2!=0){
                numimparmenor=Vector1[i];
                posicion=i;
                break;
            }
        }
        for (int i=0;i<10;i++){
            if (numimparmenor>Vector1[i] & Vector1[i]%2!=0){
                numimparmenor=Vector1[i];
                posicion=i;
            }
        }
        if (numimparmenor==0){
            System.out.println("No hay digitos impares en el vector "+Arrays.toString(Vector1));
        }else{
            System.out.println("Para el vector "+Arrays.toString(Vector1)+"\nel número menor impar es "+numimparmenor+" y esta en la posición "+posicion);
        }
    }
}
