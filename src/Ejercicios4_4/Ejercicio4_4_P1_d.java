package Ejercicios4_4;
/*
Construir un programa que muestre en pantalla el coseno de 57
*/
public class Ejericio4_4_P1_d {
    public static void main(String[] args) {
        // Hallar el coseno de 57°
        double grados= Math.cos(57);
        System.out.println("El cos de 57° es: "+grados);
        grados= grados*10000;
        System.out.println("Multiplicado por 100 es: "+grados);
        grados=Math.round(grados);
        System.out.println("redondeando con Math.round es: "+ grados);
        grados=grados/10000;
        System.out.println(grados);
    }
}
