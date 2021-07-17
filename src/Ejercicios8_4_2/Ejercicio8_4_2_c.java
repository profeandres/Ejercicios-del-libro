package Ejercicios8_4_2;

import java.util.Scanner;

/*
Construir un programa Java que permita leer un número entero
positivo y mostrar, por consola, la suma de los dígitos del número
*/
public class Ejercicio8_4_2_c {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        System.out.println("Digite un número entero");
        int Num= op.nextInt();
        String StringNum= String.valueOf(Num);
        int digitos=StringNum.length();
        int i,Adiciondedigitos=0;
        for (i=digitos;i!=0;i--){
            int digito= Num/(int) Math.pow(10, i-1);
            Num=Num-digito*(int) Math.pow(10, i-1);
            Adiciondedigitos=Adiciondedigitos+digito;
        }
        System.out.println("La suma de los digitos de "+StringNum+" es: "+Adiciondedigitos);
    }
}
