package Ejercicios8_4_2;
import java.util.Scanner;
/*
Construir un programa Java que permita leer un número entero
positivo y mostrar la cantidad de dígitos impares del número
*/
public class Ejercicio8_4_2_f {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        System.out.println("Digite un número entero");
        int num= op.nextInt();
        String Stringnum= String.valueOf(num);
        int cifras=Stringnum.length();
        int i,cont=0;
        for (i=cifras;i!=0;i--){
            int digito=num/ (int) Math.pow(10, i);
            if (digito%2!=0){
                cont++;
            }
            num= num - (digito* (int) Math.pow(10, i));
        }
        if (cont==1){
            System.out.println("El número "+num+" tiene "+cont+" cifra impar");
        }else{
            System.out.println("El número "+num+" tiene "+cont+" cifras impares");
        }
    }   
}
