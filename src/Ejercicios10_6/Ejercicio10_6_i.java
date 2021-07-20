package Ejercicios10_6;

import java.util.Arrays;

/*
Construir un programa Java que llene una matriz 4x6 y que determine
en qué posición (en qué fila y en qué columna) está el valor mayor de
toda la matriz
*/
public class Ejercicio10_6_i {
    public static void main(String[] args) {
        int[][] Matriz1=new int[4][6];
        for (var Matriz:Matriz1){
            for (int i=0;i<6;i++){
                Matriz[i]=(int) (Math.random()*100);
            }
        }
        int Fmayor=0;
        int Cmayor=0;
        int NumMayor=Matriz1[0][0];
        for (int i=0;i<4;i++){
            for(int j=0;j<6;j++){
                if (NumMayor<Matriz1[i][j]){
                    NumMayor=Matriz1[i][j];
                    Fmayor=i;
                    Cmayor=j;
                }
            }
        }
        for (var Matriz:Matriz1){
            System.out.println(Arrays.toString(Matriz));
        }
        System.out.println("El número mayor de toda la matriz es: "+NumMayor+" y se encuentra en la posción "+Fmayor+"x"+Cmayor);
    }
}
