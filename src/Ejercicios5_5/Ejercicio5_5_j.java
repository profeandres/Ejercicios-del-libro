package Ejercicios5_5;
/*
Construir un programa que determine si la cadena “enamorado”
termina en la palabra “morado”

*/
public class Ejercicio5_5_j {
    public static void main(String[] args) {
       String cad2="enamorado";
       String cad1="morado";
       if (cad1.endsWith(cad2)){
            System.out.println("La cadena "+cad1+" termina en "+ cad2);     
       }else{
            System.out.println("La cadena "+cad1+" no termina en "+ cad2);
       }

    }
}
