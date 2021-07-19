package Ejercicios9_9;
/*
Construir un programa Java que permita calcular la función seno de
cada uno de los datos de un conjunto de 20 números
*/
public class Ejercicio9_9_h {
    public static void main(String[] args) {
        int[] Vector1={45, 78, 49, 65, 57, 84, 48, 16, 32, 61, 25, 43, 38 ,59, 67, 84, 72, 56 ,20};
        for (int num: Vector1){
            System.out.println("Sen("+num+")= "+Math.sin(num));
        }
    }
}
