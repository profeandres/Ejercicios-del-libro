package Ejercicios8_3_2;
import java.util.Scanner;
/*
Construir un programa Java que lea un número entero y determine
cuántos dígitos primos tiene (los dígitos primos son 2, 3, 5 y 7)
*/
public class Ejercicio8_3_2_d {
   private static Scanner op;
   public static void main(String[] args) {
       op=new Scanner(System.in);
       System.out.println("Digite un número entero: ");
       int num=op.nextInt();
       int cifras=0,numdo=num,dig;
       do{
           dig=numdo-(numdo/10)*10;
           numdo/=10;
           if(dig==2|dig==3|dig==5|dig==7){
            cifras++;
           }
        }while(numdo!=0);
       System.out.println("El número "+num+" tiene "+cifras+" cifras primas");
   }
}
