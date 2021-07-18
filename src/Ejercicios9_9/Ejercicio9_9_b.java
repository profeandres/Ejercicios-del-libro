package Ejercicios9_9;
/*
Construir un programa Java que permita señalar en pantalla los
números impares de un conjunto de 10 números
*/
public class Ejercicio9_9_b {
    public static void main(String[] args) {
        int[] Vector1={78,16,49, 35, 26, 24, 16,78,79,78};
        for (int num:Vector1){
            if (num%2!=0){
                System.out.println(num+" es impar");
            }
        }
    }
}