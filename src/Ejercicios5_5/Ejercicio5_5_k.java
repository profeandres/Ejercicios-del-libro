package Ejercicios5_5;
/*
Construir un programa que determine si la cadena “palabra” comienza
con la cadena “pala”
*/
public class Ejercicio5_5_k {
    public static void main(String[] args) {
        String cad2="palabra";
        String cad1="pala";
        if (cad1.startsWith(cad2)){
            System.out.println("la cadena "+cad1+" empieza con "+cad2);
        }else{
            System.out.println("la cadena "+cad1+" no empieza con "+cad2);

        }
    }
}
