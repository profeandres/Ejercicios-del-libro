package Ejercicios9_7;
import java.util.Arrays;
import java.util.Scanner;
/*
Construir un programa que lea un conjunto de 10 datos y, después de
leídos, determine cuántas veces está el número menor
*/
public class Ejercicio9_7_i {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        int Vector1[]= new int[10];
        System.out.println("Ingrese 10 números enteros");
        for (int i=0;i<10;i++){
            System.out.print("Digite el número "+i+": ");
            Vector1[i]=op.nextInt();
        }
        int nummenor=Vector1[0],cont=0;
        System.out.println(Arrays.toString(Vector1));
        for (int i=0;i<10;i++){
            if (nummenor>Vector1[i]){
                nummenor=Vector1[i];
            }
        }
        System.out.println(nummenor);
        for (int i=0;i<10;i++){
            if (Vector1[i]==nummenor){
                cont++;
            }
        }
        System.out.println("Para este conjunto de numeros: "+Arrays.toString(Vector1)+"\nEl número menor es "+nummenor+" y este mismo número está "+cont+" veces en el conjunto");
    }
}
