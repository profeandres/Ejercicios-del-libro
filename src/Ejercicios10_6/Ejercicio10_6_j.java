package Ejercicios10_6;

import java.util.Arrays;

/*
Construir un programa Java que llene una matriz 3x8 y que determine
en qué posición está el valor mayor de cada fila
*/
public class Ejercicio10_6_j {
    public static void main(String[] args) {
        int[][] Matriz1=new int[3][8];
        for (var Matriz:Matriz1){
            for (int i=0;i<8;i++){
                Matriz[i]=(int) (Math.random()*100);
            }
        }
        for (var Matriz:Matriz1){
            int Cmayor=0;
            int NumMayor=Matriz[0];
            for (int i=0;i<8;i++){
                if (NumMayor<Matriz[i]){
                    NumMayor=Matriz[i];
                    Cmayor=i;
                }
            }
            System.out.println("\nPara la fila "+Arrays.toString(Matriz)+"\n el número mayor es: "+NumMayor+" y esta en la posición: "+Cmayor+"\n");
        }
    }
}
