package Ejercicios10_6;

import java.util.Arrays;

/*
Construir un programa Java que llene una matriz 3x8 y que determine
en qué posición está el valor menor de cada fila
*/
public class Ejercicio10_6_f {
    public static void main(String[] args) {
        int[][] Matriz1= new int[3][8];
        for (int i=0;i<3;i++){
            for (int j=0;j<8;j++){
                Matriz1[i][j]=(int) (Math.random()*100);
            }
        }
        int ColumnaMenor=0;
        for (int i=0;i<3;i++){
            int NumMenor=Matriz1[i][0];
            for(int j=0;j<8;j++){
                if (NumMenor>Matriz1[i][j]){
                    NumMenor=Matriz1[i][j];
                    ColumnaMenor=j;
                }
            }
            System.out.println("\nPara la fila "+(i)+" que es: "+Arrays.toString(Matriz1[i])+"\nEl número menor es: "+NumMenor+" y está en la posicion "+ColumnaMenor+"\n");
        }
    }
}
