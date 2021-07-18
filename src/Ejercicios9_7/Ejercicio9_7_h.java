package Ejercicios9_7;
import java.util.Arrays;
import java.util.Scanner;
/*
Construir un programa que lea un conjunto de 10 datos y, después de
leídos, determine cuántos números terminados en 5 hay en el vector
*/
public class Ejercicio9_7_h {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        int Vector1[]=new int[10];
        System.out.println("Ingrese 10 números enteros");
        for (int i=0;i<10;i++){
            Vector1[i]=op.nextInt();
        }
        int cont=0;
        for (int i=0;i<10;i++){
            if (Vector1[i]-(int) Vector1[i]/10*10==5){
                cont++;
            }
        }
        System.out.println("En el array "+Arrays.toString(Vector1)+" Hay "+cont+" números que terminan en 5.");
    }
}
