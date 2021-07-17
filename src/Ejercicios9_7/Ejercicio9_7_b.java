package Ejercicios9_7;
import java.util.Arrays;
import java.util.Scanner;
/*
Construir un programa que lea un conjunto de 10 datos y, después de
leídos, determine en qué posición está el número mayor
*/
public class Ejercicio9_7_b {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        System.out.println();
        int Vector2[]= new int[10];
        for (int i=0;i<10;i++){
            Vector2[i]=op.nextInt();
        }
        System.out.println(Arrays.toString(Vector2));
        int numeromayor=Vector2[0],posición=0;
        for (int i=1;i<10;i++){
            if (numeromayor<Vector2[i]){
                numeromayor=Vector2[i];
                posición=i;
            }
        }
        System.out.println("Para el Vector "+Arrays.toString(Vector2)+"\nEl número mayor es: "+numeromayor+" y esta en la posición "+posición);
    }
}
