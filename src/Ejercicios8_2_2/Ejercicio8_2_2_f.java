package Ejercicios8_2_2;
import java.util.Scanner;
/*
Construir un programa que permita leer dos números enteros y mostrar
todos los números enteros comprendidos entre la raíz cúbica del
número menor y la raíz cúbica del número mayor
*/
public class Ejercicio8_2_2_f {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        System.out.print("Digite dos números entero \nPrimer número: ");
        int num1= (int) Math.cbrt(op.nextInt());
        System.out.print("Segundo número: ");
        int  num2= (int) Math.cbrt(op.nextInt());

        while(num1<=num2){
            System.out.print(num1+"\t");
            num1++;
        }
    }

}
