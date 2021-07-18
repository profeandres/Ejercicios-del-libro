package Ejercicios9_7;
import java.util.Arrays;
import java.util.Scanner;
/*
Construir un programa que lea un conjunto de 10 datos y, después de
leídos, determine cuántas veces está el número mayor
*/
public class Ejercicio9_7_j {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        int Vector1[]=new int[10];
        System.out.println("Digite 10 números enteros ");
        for (int i=0;i<10;i++){
            System.out.print("Ingrese el número "+i+": ");
            Vector1[i]=op.nextInt();
        }
        int nummayor=Vector1[0],cont=0;
        for (int i=0;i<10;i++){
            if (nummayor<Vector1[i]){
                nummayor=Vector1[i];
            }
        }
        for (int i=0;i<10;i++){
            if (Vector1[i]==nummayor){
                cont++;
            }
        }
        System.out.println("En el conjunto de números "+Arrays.toString(Vector1)+"\nEl número mayor es "+nummayor+" y está "+cont+" veces en el conjunto");


    }
}
