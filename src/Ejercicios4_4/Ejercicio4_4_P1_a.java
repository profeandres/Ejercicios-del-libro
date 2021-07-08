package Ejercicios4_4;

/*
Construir un programa que convierta 2 radianes a su equivalente en
grados
*/
public class Ejercicio4_4_P1_a {
    public static void main(String[] args) {
        double rad= 2; 
        System.out.println(rad+" radianes equivalen a "+(double) Math.round(Math.toDegrees(rad)*100)/100+"°");
    }
}
