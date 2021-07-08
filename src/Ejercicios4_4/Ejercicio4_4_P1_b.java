package Ejercicios4_4;
/*
Construir un programa que convierta 38 grados a su equivalente en
radianes

*/
public class Ejercicio4_4_P1_b {
    public static void main(String[] args) {
        double grados= 38;
        double radianes=Math.round(Math.toRadians(grados)*100);
        System.out.println(grados+"° equivalen a "+radianes/100+" radianes");
    }
}
