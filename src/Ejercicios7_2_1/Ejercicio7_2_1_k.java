package Ejercicios7_2_1;

import java.util.Scanner;

/*
Construir un programa que lea tres número enteros y muestre el
número intermedio (o sea el que no es el mayor ni es el menor)
*/
public class Ejercicio7_2_1_k {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        int num2,n1,n2,n3;
        n1=op.nextInt();
        n2=op.nextInt();
        n3=op.nextInt();
        if (n1<=n2&n1<=n3){
            if (n2<=n3){
                num2=n2;
            }else{
                num2=n3;
            }
        } else if (n2<=n1&n2<=n3){
            if (n1<=n3){
                num2=n1;
            }else{
                num2=n3;
            }
        } else{
            if (n1<=n2){
                num2=n1;
            }else{
                num2=n2;
            }
        }
        System.out.println("El número intermedio es: "+num2);

    }
}
