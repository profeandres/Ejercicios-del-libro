package Ejercicios9_7;
import java.util.Arrays;
import java.util.Scanner;
/*
Construir un programa que lea un conjunto de 10 datos y, después de
leídos, determine en qué posición está el menor número terminado en
3
*/
public class Ejercicio9_7_e {
    private static Scanner op;
    public static void main(String[] args) {
        op=new Scanner(System.in);
        int Vector1[]=new int[10];
        for (int i=0;i<10;i++){
            Vector1[i]=op.nextInt();
        }
        int nummenor3=0,posicion=0;
        System.out.println(Arrays.toString(Vector1));
        for (int i=0;i<10;i++){
            if (Vector1[i]-((int) (Vector1[i]/10)*10)==3){
                nummenor3=Vector1[i];
                posicion=i;
                break;
            }
        }
        for (int i=0;i<10;i++){
            if(nummenor3==3){
                break;
            }else if (Vector1[i]==3){
                nummenor3=Vector1[i];
                posicion=i;
                break;
            }else if (nummenor3>Vector1[i]&Vector1[i]-((int) (Vector1[i]/10)*10)==3){
                nummenor3=Vector1[i];
                posicion=i;
            }
        }
        if (nummenor3==0){
            System.out.println("No hay números en este vector que terminen en 3");
        }else{
            System.out.println("El número "+nummenor3+" es el menor número que termina en 3 y está en la posición "+posicion);
        }
    }
}
