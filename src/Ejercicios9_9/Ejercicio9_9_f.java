package Ejercicios9_9;
/*
Construir un programa Java que permita calcular la raíz cuadrada de
cada uno de los datos de un conjunto de 20 números
*/
public class Ejercicio9_9_f {
    public static void main(String[] args) {
        int[] Vector1={45,78,16,23,52,92,82,46,75,68,69,63,23,31,52,42,45,15,23,34};
        for (int num:Vector1){
            System.out.println("La raiz cúbica de "+num+" es: "+Math.sqrt(num));
        }
    }
}
