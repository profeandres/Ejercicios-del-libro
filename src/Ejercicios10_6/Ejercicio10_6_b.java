package Ejercicios10_6;

import java.util.Arrays;

/*
Construir un programa Java que llene una matriz de 3 filas por 6
columnas (3x6) y que calcule la suma de cada fila de datos de la matriz
*/
public class Ejercicio10_6_b {
    public static void main(String[] args) {
        int[][] Matriz1= new int[3][6];
        int num=11;
        for (int i=0;i<3;i++){
            for (int j=0;j<6;j++){
                Matriz1[i][j]=num;
                num++;
            }
        }
        for(int i=0;i<3;i++){
            System.out.println(Arrays.toString(Matriz1[i]));
        }
        int sum=0;
        for (int i=0;i<3;i++){
            for(int j=0;j<6;j++){
                sum=sum+Matriz1[i][j];
            }
            System.out.println("Para la fila"+(i+1)+" la suma de los datos es: "+sum);
        }
    }
}
