package Ejercicios8_4_2;
import java.util.Scanner;
/*
Construir un programa Java que permita leer un número entero
positivo y mostrar la cantidad de dígitos del número
*/
public class Ejercicio8_4_2_d {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        System.out.println("Ingrese un digito entero");
        int num=op.nextInt();
        String Stringnum=String.valueOf(num);
        int numlength=Stringnum.length();
        int i,cont=0;
        for (i=numlength;i!=0;i--){
            int digito= num / (int) Math.pow(10,i-1);
            cont++;
            num=num - (digito*(int) Math.pow(10,i-1));
        }
        System.out.println("el número "+Stringnum+" tiene "+cont+" dígitos");
    }    
}
