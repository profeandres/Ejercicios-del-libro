package Ejercicios8_4_2;
import java.util.Scanner;
/*
Construir un programa Java que permita leer un número entero
positivo y mostrar la suma de los dígitos impares del número
*/
public class Ejercicio8_4_2_i {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        System.out.println("Digite un número entero");
        int num=op.nextInt();
        String Stringnum=String.valueOf(num);
        int numlength= Stringnum.length();
        int i,sum=0;
        for (i=numlength;i!=0;i--){
            int digito=num/(int) Math.pow(10, i-1);
            if (digito%2!=0){
                sum=sum+digito;
            }
            num=num-(digito* (int) Math.pow(10, i-1));
        }
        System.out.println("La suma de las cifras impares de "+Stringnum+" es "+sum);
    }
}
