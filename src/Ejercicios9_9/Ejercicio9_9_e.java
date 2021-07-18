package Ejercicios9_9;
/*
Construir un programa Java que muestre en pantalla el resultado
progresivo de sumar los números almacenados en un arreglo de 15
datos
*/
public class Ejercicio9_9_e {
    public static void main(String[] args) {
        int[] Vector1={45,89,46,73,15,24,26,95,61,38,64,93,72,16,43};
        int sum=0;
        for (int num:Vector1){
            sum=sum+num;
            System.out.println(sum);
        }
    }
}
