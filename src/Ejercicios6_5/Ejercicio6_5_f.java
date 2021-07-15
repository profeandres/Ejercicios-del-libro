package Ejercicios6_5;
import java.util.Scanner;
/*
Construir un programa Java que permita leer su salario y determinar
cuánto ganará el próximo año si el incremento se sabe que será del 10%
*/
public class Ejercicio6_5_f {
    private static Scanner op;
    public static void main(String[] args) {
        op= new Scanner(System.in);
        System.out.println("Ingrese su salario");
        int salary=op.nextInt();
        System.out.println("El proximo año habrá un incremento de 10% y tu salario será de: "+((int) (salary*1.10)));
    }
}
