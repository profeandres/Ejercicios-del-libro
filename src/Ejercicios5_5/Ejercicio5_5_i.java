package Ejercicios5_5;
/*
Construir un programa que determine si la palabra “ver” está contenida
en la cadena “Universidad”
 */
public class Ejercicio5_5_i {
    public static void main(String[] args) {
        String cad1="Universidad";
        String cad2="ver";
        if (cad1.contains(cad2)){
            System.out.println("La cadena "+cad1+" contiene a la cadena "+cad2);
        }else{
            System.out.println("La cadena "+cad1+" NO contiene a la cadena "+cad2);
        }

    }
}
