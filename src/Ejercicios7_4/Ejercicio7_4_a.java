package Ejercicios7_4;
import java.util.Scanner;
/*
Construir un programa Java que lea dos números enteros y que ofrezca
el siguiente menú: 1) Sumar los dos números leídos, 2) Restar los dos
números leídos, 3) Multiplicar los dos números leídos, 4) Dividir los
dos números leídos, 5) Elevar el 1º número a la potencia que representa
el 2º número
*/
public class Ejercicio7_4_a {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        System.out.println("Ingrese dos números enteros \nPrimero número: ");
        int num1 = op.nextInt();
        System.out.println("Segundo número: ");
        int num2 = op.nextInt();
        System.out.println("---Elija una de las siguientes opciones--- \n1) Sumar los dos números leídos \n2) Restar los dos números leídos \n3) Multiplicar los dos números leídos \n4) Dividir los dos números leídos \n5) Elevar el 1° numero a la potencia que representa el 2° numero");
        int opcion=op.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("La suma de "+num1+" y "+num2+" es: "+ (num1+num2));
                break;
            case 2:
                System.out.println("La resta de "+num1+" y "+num2+" es: "+ (num1-num2));
                break;
            case 3:
                System.out.println("El producto de "+num1+" y "+num2+" es: "+ (num1*num2));
                break;
            case 4:
                if(num2==0){
                    System.out.println("Error: No se puede dividir entre cero");
                }else{
                System.out.println("El cociente de "+num1+" y "+num2+" es: "+ (double) num1/num2);
                }
                break;
            case 5:
                System.out.println(num1+" elevado a "+num2+" es: "+ Math.pow(num1,num2));
                break;
            default:
                System.out.println("La opción ingresada no está definida, debe escoger un número entre las opciones");
                break;
        }
    }
}
