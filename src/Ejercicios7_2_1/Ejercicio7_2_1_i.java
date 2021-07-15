package Ejercicios7_2_1;
import java.util.Scanner;
/*
Construir un programa que lea tres números enteros y los muestre
ascendentemente
*/
public class Ejercicio7_2_1_i {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        int num1,num2,num3,n1,n2,n3;
        n1=op.nextInt();
        n2=op.nextInt();
        n3=op.nextInt();
        if (n1>=n2&n1>=n3){
            num1=n1;
            if (n2>=n3){
                num2=n2;
                num3=n3;
            }else{
                num2=n3;
                num3=n2;
            }
        } else if (n2>=n1&n2>=n3){
            num1=n2;
            if (n1>=n3){
                num2=n1;
                num3=n3;
            }else{
                num2=n3;
                num3=n1;
            }
        } else{
            num1=n3;
            if (n1>=n2){
                num2=n1;
                num3=n2;
            }else{
                num2=n2;
                num3=n1;
            }
        }
        System.out.println("---Orden ascendente de los números ingresados--- \n1°: "+num1+"\n2°: "+num2+"\n3°: "+num3);

    }
}
