package Ejercicios8_2_2;
import java.util.Scanner;
/*
Construir un programa que permita leer dos números enteros y muestre
10 números aleatorios comprendidos entre el menor y el mayor
*/
public class Ejercicio8_2_2_i {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        System.out.print("digite dos número enteros \nPrimer número: ");
        int num1=op.nextInt();
        System.out.print("Segundo número: ");
        int num2=op.nextInt();
        int NumMayor,NumMenor;
        if (num1>num2){
            NumMayor=num1;
            NumMenor=num2;
        }else{
            NumMayor=num2;
            NumMenor=num1;
        }
        int i=0,NumRandom;
        while (i<10){
            NumRandom= (int) (Math.random()*100);
            while(NumRandom<=NumMayor & NumRandom>=NumMenor){
                System.out.print(NumRandom+"\n");
                i++;
                break;
            }
        }
    }

}
