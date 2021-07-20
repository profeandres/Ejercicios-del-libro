package Ejercicios10_6;
import java.util.Arrays;
/*
Construir un programa Java que llene una matriz 3x5 y que determine
cuál es el valor menor de cada fila de la matriz
*/
public class Ejercicio10_6_d {
    public static void main(String[] args) {
        int[][] Matriz1=new int[3][5];
        int num=82;
        for (int i=0;i<3;i++){
            for (int j=0;j<5;j++){
                Matriz1[i][j]=num;
                num--;
            }
        }
        for (int i=0;i<3;i++){
            int NumMenor=Matriz1[i][0];
            for (int j=0;j<5;j++){
                if (NumMenor>Matriz1[i][j]){
                    NumMenor=Matriz1[i][j];
                }
            }
            System.out.println("El número menor de la fila "+Arrays.toString(Matriz1[i])+" es: "+NumMenor);
        }

    }    
}
