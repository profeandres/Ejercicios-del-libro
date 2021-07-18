package Ejercicios9_9;
/*
Construir un programa Java que permita señalar en pantalla los
números múltiplos de 2 de un conjunto de 10 números
*/
public class Ejercicio9_9_c {
    public static void main(String[] args) {
        int[] Vector1={45, 78, 91, 85, 64, 73, 37, 25, 15, 65, 49};
        for (int num:Vector1){
            if (num%2==0){
                System.out.println(num+" es multiplo de 2");
            }
        }
    }
}
