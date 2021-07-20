package Ejercicios10_6;

import java.util.Arrays;

/*
Construir un programa Java que llene una matriz 3x5 y que determine
cuál es el valor mayor de cada fila de la matriz
*/
public class Ejercicio10_6_h {
    public static void main(String[] args) {
        int[][] Matriz1=new int[3][5];
        for (var Matriz:Matriz1){
            // al intentar aplicar for-each para llenar matriz, no inicializa la variable num, no toma el dato que se le indica.
            for (int i=0;i<5;i++){
                Matriz[i]= (int) (Math.random()*100);
            }
        }
        for (var Matriz:Matriz1){
            System.out.println(Arrays.toString(Matriz));
        }
        for (var Matriz:Matriz1){
            int NumMayor=Matriz[0];
            for (int num:Matriz){
                if (num>NumMayor){
                    NumMayor=num;
                }
            }
            System.out.println("\nPara la fila "+Arrays.toString(Matriz)+" El número mayor es: "+NumMayor+"\n");
        }


    }
}
