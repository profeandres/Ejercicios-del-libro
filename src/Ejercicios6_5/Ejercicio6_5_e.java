package Ejercicios6_5;
import java.util.Scanner;

/*
Construir un programa Java que permita leer su estatura y determinar
cuánto mediría usted si tuviera 10 cms. más.
*/
public class Ejercicio6_5_e {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        System.out.println("¿Cuál es tu estatura? ");
        double height= op.nextDouble();
        System.out.println("Si tuvieras 10 cms más medirías "+ (height+0.10));
    }
}
