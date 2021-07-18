package Ejercicios9_9;
/*
Construir un programa Java que permita señalar en pantalla los
números múltiplos de 5 de un conjunto de 10 números
*/
public class Ejercicio9_9_d {
    public static void main(String[] args) {
        int[] Vector1={12,56,49,78,36,38,15,17,14,25};
        for (int num:Vector1){
            if (num%5==0){
                System.out.println(num+" es multiplo de 5");
            }
        }
    }
}
