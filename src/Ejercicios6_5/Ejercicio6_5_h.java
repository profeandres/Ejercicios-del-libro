package Ejercicios6_5;
import java.util.Scanner;

/*
Construir un programa Java que permita leer su salario y determinar
cuánto le descuentan por salud si se sabe que este descuento equivale
al 12% de dicho salario
*/

public class Ejercicio6_5_h {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        System.out.println("Digite su salario: ");
        int Salary=op.nextInt();
        double descuento=Salary*0.12;
        System.out.println("Se le descuentan por concepto de Salud: "+descuento);
    }    
}
