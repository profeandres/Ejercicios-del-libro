package Ejercicios9_7;
import java.util.Arrays;
import java.util.Scanner;
/*
Construir un programa que lea un conjunto de 10 datos y, después de
leídos, determine en qué posición está el número menor
*/
public class Ejercicio9_7_a {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        int Vector1[]= new int[10];
        for (int i=0;i<10;i++){
            Vector1[i]=op.nextInt();
        }
        int numeromenor=Vector1[0],posición=0;
        for (int i=1;i<10;i++){
            if (numeromenor>Vector1[i]){
                numeromenor=Vector1[i];
                posición=i;
            }
        }
        System.out.println("En el array"+Arrays.toString(Vector1)+"\nel número menor esta en la posición:"+posición);
    }
}
