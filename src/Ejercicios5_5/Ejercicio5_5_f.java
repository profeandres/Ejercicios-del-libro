package Ejercicios5_5;
/*
Construir un programa que determine si las cadenas “Amigo” y
“AmIgO” son iguales
*/
public class Ejercicio5_5_f {
    public static void main(String[] args) {
        String cad1="Amigo",cad2="AmIgO";
        if (cad1.equalsIgnoreCase(cad2)){
            System.out.println(cad1+" y "+cad2+" son iguales");
        }else{
            System.out.println(cad1+" y "+cad2+" no son iguales");
        }
    }
}
