package Ejercicios5_5;
/*
Construir un programa que muestre el carácter que está en la posición
5ª, 7ª y 9ª de la palabra “desencantamiento”
*/
public class Ejercicio5_5_b 
{
    public static void main(String[] args) 
    {
        String word="desencantamiento";
        System.out.println("Para el caso de la palabra desencantamiento");
        System.out.println("El caracter que está en la posición 5° es: "+word.charAt(4));
        System.out.println("El caracter que está en la posición 7° es: "+word.charAt(6));
        System.out.println("El caracter que está en la posición 9° es: "+word.charAt(8));
    }
}
