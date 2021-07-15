package Ejercicios6_5;
import java.util.Scanner;

/*
Construir un programa Java que permita leer su edad y determinar a
cuánto es igual la raíz cuadrada de dicha edad
*/
public class Ejercicio6_5_i {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        System.out.println("Digite su edad");
        double edad=op.nextDouble();
        System.out.println("La raiz cuadrada de su estatura es: "+ ((double) Math.round(Math.sqrt(edad)*100)/100));
    }
}
