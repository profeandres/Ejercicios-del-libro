package Ejercicios8_3_2;
import java.util.Scanner;
/*
Construir un programa Java que lea dos números enteros y determine
cuál de los dos tiene más dígitos primos
*/
public class Ejercicio8_3_2_g {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        System.out.println("Introduce dos números enteros \nPrimer Número: ");
        int num1=op.nextInt();
        System.out.println("Segundo Número: ");
        int num2=op.nextInt();
        int cifras1=0,cifras2=0,numdo1=num1,numdo2=num2,dig1,dig2;
        do{
            dig1=numdo1 - (numdo1/10)*10;
            numdo1=numdo1/10;
            dig2=numdo2 - (numdo2/10)*10;
            numdo2=numdo2/10;
            if(dig1==2 |dig1==3|dig1==5|dig1==7){
                cifras1++;
            }
            if(dig2==2 |dig2==3|dig2==5|dig2==7){
                cifras2++;
            }
        }while(numdo1!=0 | numdo2!=0);
        
        if (cifras1>cifras2){
            System.out.println("El número "+num1+" tiene más cifras primas que "+num2);
        } else if (cifras1==cifras2){
            System.out.println("El número "+num1+" tiene igual cifras primas que "+num2);
        } else{
            System.out.println("El número "+num2+" tiene más cifras primas que "+num1);
        }
    }
}
