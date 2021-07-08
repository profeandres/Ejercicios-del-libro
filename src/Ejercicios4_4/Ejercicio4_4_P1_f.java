package Ejercicios4_4;
/*
Construir un programa que muestre en pantalla la tangente de 60 pero
calculándola a partir de la expresión tan(x)=Sen(x)/cos(x)
*/
public class Ejercicio4_4_P1_f {
    public static void main(String[] args) {
        System.out.println(""+(double) Math.round((Math.sin(60)/Math.cos(60))*10000)/10000);
    }
}
