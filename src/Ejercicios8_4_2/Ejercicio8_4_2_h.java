package Ejercicios8_4_2;
import java.util.Scanner;
/*
Construir un programa Java que permita leer un número entero
positivo y mostrar la suma de los dígitos pares del número
*/
public class Ejercicio8_4_2_h {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        System.out.println("ingrese un número entero");
        int num=op.nextInt();
        String Stringnum=String.valueOf(num);
        int numlength= Stringnum.length();
        int sum=0;
        for (int i = numlength ; i!=0 ; i--) {
            int digitos= num/(int)Math.pow(10, i-1);
            if (digitos%2==0){
                sum=sum+digitos;
            }
            num=num-(digitos*(int) Math.pow(10, i-1));
        }
        System.out.println("La suma de los números pares de "+Stringnum+" es "+sum);
    }
}
