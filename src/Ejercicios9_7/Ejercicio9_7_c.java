package Ejercicios9_7;
import java.util.Arrays;
import java.util.Scanner;
/*
Construir un programa que lea un conjunto de 10 datos y, después de
leídos, determine en qué posición está el menor número par
*/
public class Ejercicio9_7_c {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        System.out.println("");
        int[] Vector1= new int[10];
        for (int i=0;i<10;i++){
            Vector1[i]=op.nextInt();
        }
        int numeromenorpar=0;
        int posicion=0;
        for (int i=0;i<10;i++){
            if (Vector1[i]%2==0){
                numeromenorpar=Vector1[i];
                posicion=i;
                break;
            }
        }
        for (int i=posicion;i<10;i++){
            if (Vector1[i]%2==0 & numeromenorpar>Vector1[i]){
                numeromenorpar=Vector1[i];
                posicion=i;
            }
        }
        System.out.println(Arrays.toString(Vector1));
        if (numeromenorpar==0){
            System.out.println("Ningún dígito de este vector es par");
        }else{
            System.out.println("El número menor par es: "+numeromenorpar+" y está en la posición "+posicion);
        }
    }
}
