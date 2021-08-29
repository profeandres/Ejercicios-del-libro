package Ejercicios10_6;

import java.util.Arrays;

/*
Construir un programa Java que llene una matriz de 5 filas por 3
columnas y que calcule la suma de todos los datos almacenados en la
matriz
*/
public class Ejercicio10_6_a {
    public static void main(String[] args) {
        int num=11;
        int[][] Matriz1= new int[5][3];
        for (int i=0;i<5;i++){
            for (int j=0;j<3;j++){
                Matriz1[i][j]=num;
                num++;
            }
        }
        System.out.println("rudy estuvo aquí")
        int sum=0;
        for (int i=0;i<5;i++){
            for (int j=0;j<3;j++){
                sum=sum+Matriz1[i][j];
            }
        }
        System.out.println("La suma de todos los datos de la matriz \n"+Arrays.toString(Matriz1[0])+"\n"+Arrays.toString(Matriz1[1])+"\n"+Arrays.toString(Matriz1[2])+"\n"+Arrays.toString(Matriz1[3])+"\n"+Arrays.toString(Matriz1[4])+"\nes: "+sum);
    }
}
