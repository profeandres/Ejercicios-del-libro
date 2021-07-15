package Ejercicios8_3_2;
import java.util.Scanner;

/*
Construir un programa Java que lea dos números enteros y determina
cuál de los dos tiene más dígitos pares
*/
public class Ejercicio8_3_2_f {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        System.out.println("Ingresa dos números enteros \nPrimer número: ");
        int num1=op.nextInt();
        System.out.println("Segundo número");
        int num2=op.nextInt();
        int cifra1=0,cifra2=0,numdo1=num1,numdo2=num2;
        do{
            if (numdo1%2==0 & numdo1!=0){
                cifra1++;
            }
            if (numdo2%2==0 & numdo2!=0){
                cifra2++;
            }
            System.out.println("numdo1 ="+numdo1);
            System.out.println("numdo2 ="+numdo2);
            System.out.println("cifra1 ="+cifra1);
            System.out.println("cifra2 ="+cifra2);
            System.out.println("-----------------------------------------");
            numdo1=numdo1/10;
            numdo2=numdo2/10;
        }while(numdo1!=0 | numdo2!=0);
        System.out.println("cifra1 ="+cifra1);
        System.out.println("cifra2 ="+cifra2);
        if (cifra1>cifra2){
            System.out.println("El número "+num1+" tiene más cifras pares que "+num2);
        }else if(cifra1==cifra2){
            System.out.println("El número "+num1+" tiene las mismas cifras impares que "+num2);
        }else{
            System.out.println("El número "+num2+" tiene más cifras pares que "+num1);
        }
    }
}
