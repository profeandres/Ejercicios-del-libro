package Ejercicios8_4_2;
import java.util.Scanner;
/*
Construir un programa Java que permita leer un número entero
positivo y mostrar la cantidad de dígitos primos del número
*/
public class Ejercicio8_4_2_g {
    private static Scanner op; 
    public static void main(String[] args) {
        op = new Scanner(System.in);
        System.out.println("Digite un número entero");
        int num=op.nextInt();
        String Stringnum= String.valueOf(num);
        int numlength=Stringnum.length();
        int i, cont=0;
        for(i=numlength;i!=0;i--){
            int cifra= num/ (int) Math.pow(10, i-1);
            if (cifra==2 | cifra==3 |cifra==5 |cifra==7 ){
                cont++;
            }
            num= num - (cifra*(int) Math.pow(10, i-1));
        }
        System.out.println("El número " +Stringnum+" tiene "+cont+" dígitos primos");
    }
}
