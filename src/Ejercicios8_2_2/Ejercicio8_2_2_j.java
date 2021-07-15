package Ejercicios8_2_2;
import java.util.Scanner;
/*
Construir un programa que lea un número entero y muestre todos los
múltiplos de 3 comprendidos entre 1 y el número leído
*/
public class Ejercicio8_2_2_j {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        System.out.print("digite un número entero: ");
        int num=op.nextInt();
        int i = 1;
        while (i<num){
            while (i%3==0){
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
