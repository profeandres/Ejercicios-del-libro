package Ejercicios5_5;
/*
Construir un programa que determine si las cadenas “amigo” y
“AMIGO” son iguales
*/
public class Ejercicio5_5_g {
    public static void main(String[] args) {
        String cad1="amigo",cad2="AMIGO";
        if (cad1.equalsIgnoreCase(cad2)){
            System.out.println(cad1+" y "+cad2+" son iguales");
        }else{
            System.out.println(cad1+" y "+cad2+" no son iguales");
        }
    }
}
