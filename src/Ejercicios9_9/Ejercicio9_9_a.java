package Ejercicios9_9;
/*
Construir un programa Java que permita señalar en pantalla los
números pares de un conjunto de 10 números
*/
public class Ejercicio9_9_a {
    public static void main(String[] args) {
        int[] Vector1={45,78,94,61,23,53,25,48,75,98};
        for (int num:Vector1){
            if (num%2==0){
                System.out.println(num+" es par");
            }
        }
    }
}
