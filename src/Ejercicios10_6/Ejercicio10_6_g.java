package Ejercicios10_6;

import java.util.Arrays;

/*
Construir un programa Java que llene un matriz de 6x4 y que determine
cuál es el valor mayor almacenado en toda la matriz
*/
public class Ejercicio10_6_g {
    public static void main(String[] args) {
        int[][] Matriz1=new int[6][4];
        for (int i=0;i<6;i++){
            for (int j=0;j<4;j++){
                Matriz1[i][j]=(int) (Math.random()*100);
            }
        }
        int NumMayor=Matriz1[0][0];
        for (var Matriz:Matriz1){
            for (int num:Matriz){
                if (num>NumMayor){
                    NumMayor=num;
                }
            }
        }
        System.out.println("En la matriz \n");
        for (var Matriz:Matriz1){
            System.out.println(Arrays.toString(Matriz));
        }
        System.out.println("El número mayor es: "+NumMayor);
    }
}
