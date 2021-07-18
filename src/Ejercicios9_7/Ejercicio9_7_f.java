package Ejercicios9_7;
import java.util.Arrays;
import java.util.Scanner;
/*
Construir un programa que lea un conjunto de 10 datos y, después de
leídos, determine cuántos números pares hay en el vector
*/
public class Ejercicio9_7_f {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        int[] Vector1= new int[10];
        for (int i=0;i<10;i++){
            System.out.print("Ingresar el número "+i+":  ");;
            Vector1[i]=op.nextInt();
        }
        int cont=0;
        for (int i=0;i<10;i++){
            if (Vector1[i]%2==0){
                cont++;
            }
        }
        System.out.println("El vector "+Arrays.toString(Vector1)+"\ntiene "+cont+" numero pares");
    }
}
