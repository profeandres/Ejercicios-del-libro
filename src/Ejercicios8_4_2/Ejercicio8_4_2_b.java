package Ejercicios8_4_2;
import java.util.Scanner;
/*
Construir un programa Java que permita leer un número entero
positivo y mostrar todos los dígitos del número (uno por uno) de
manera vertical
*/
public class Ejercicio8_4_2_b {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        System.out.println("Digite su numero entero");
        int num= op.nextInt();
        String number= String.valueOf(num);
        int digitosdelaentrada=number.length();
        double i;
        for (i=digitosdelaentrada;i!=0;i--){
            int imprimirdigito=num / (int) Math.pow(10, i-1);
            num=num -(imprimirdigito*(int) Math.pow(10, i-1));
            System.out.println(imprimirdigito);
        }

    }
}
