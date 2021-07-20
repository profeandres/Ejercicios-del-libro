package Ejercicios10_6;

import java.util.Arrays;

/*
Construir un programa Java que llene una matriz 4x6 y que determine
en qué posición (en qué fila y en qué columna) está el valor menor de
toda la matriz
*/
public class Ejercicio10_6_e {
    public static void main(String[] args) {
        int[][] Matriz1= new int[4][6];
        int num=52;
        for (int i=0;i<4;i++){
            for (int j=0;j<6;j++){
                Matriz1[i][j]=num;
                num--;
            }
        }
        for (int i=0;i<4;i++){
            System.out.println(Arrays.toString(Matriz1[i]));
        }
        int filamenor=0,columnamenor=0,NumMenor=Matriz1[0][0];
        for (int i=0;i<4;i++){
            for(int j=0;j<6;j++){
                if (NumMenor>Matriz1[i][j]){
                    NumMenor=Matriz1[i][j];
                    filamenor=i;
                    columnamenor=j;
                }
            }
        }
        System.out.println("El número menor es "+NumMenor+" y está en la posición ("+filamenor+", "+columnamenor+")");
    }
}
