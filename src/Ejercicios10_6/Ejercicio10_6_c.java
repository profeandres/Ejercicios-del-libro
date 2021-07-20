package Ejercicios10_6;

import java.util.Arrays;

/*
Construir un programa Java que llene un matriz de 6x4 y que determine
cuál es el valor menor almacenado en toda la matriz
*/
public class Ejercicio10_6_c {
    public static void main(String[] args) {
        int[][] Matriz1= new int[6][4];
        int num=50;
        for (int i=0;i<6;i++){
            for (int j=0;j<4;j++){
                Matriz1[i][j]=num;
                num--;
            }
        }
        int NumMenor=Matriz1[0][0];
        for (int i=0;i<6;i++){
            for (int j=0;j<4;j++){
                if (NumMenor>Matriz1[i][j]){
                    NumMenor=Matriz1[i][j];
                }
            }
        }
        System.out.println("El número menor de la matriz ");
        for (int i=0;i<6;i++){
            System.out.println(Arrays.toString(Matriz1[i]));
        }
        System.out.println("Es: "+NumMenor);
    }
}
