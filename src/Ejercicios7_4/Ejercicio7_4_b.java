package Ejercicios7_4;
import java.util.Scanner;
/*
Construir un programa Java que lea dos números enteros y que ofrezca
el siguiente menú: 1) calcular el Seno del 1º número leído, 2) calcular
el coseno del 2º número leído, 3) calcular la tangente del 1º número
leído, 4) comprobar que la tangente del 1º número leído es igual al
resultado de dividir el seno del 1º número entre el coseno del 2º número
*/
public class Ejercicio7_4_b {
    private static Scanner op;
    public static void main(String[] args) {
        //Se crea el Scanner
        op=new Scanner(System.in);

        //Se piden los números y se guardan en num1 y num2
        System.out.println("Ingrese dos números enteros \nPrimer número: ");
        double num1=op.nextDouble();
        System.out.println("Segundo número: ");
        double num2=op.nextDouble();
        
        //Se muestra el menu de opciones
        System.out.println("---Elija una opción--- \n1) calcular el Seno del 1° número leído \n2) Calcular el coseno del 2° número leído \n3) calcular la tangente del 1° número leído \n4) Comprobar que la tangente del 1° número leído es igual al resultado de dividir el seno del 1° número leído entre el coseno del 2° número leido");
        
        //Se crea la variable opcion y los casos a ejecutarse
        int opcion=op.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Sen("+num1+")="+Math.sin(num1));
                break;
            case 2:
                System.out.println("Cos("+num2+")="+Math.cos(num2));
                break;
            case 3:
                System.out.println("Tan("+num1+")="+Math.tan(num1));
                break;
            
            case 4:
                System.out.println("          Sen("+num1+") \nTan("+num1+")=-----------\n          Cos("+num2+")");
                System.out.println("\n");
                System.out.println("        "+(double) Math.round(Math.sin(num1)*10000)/10000+"\n"+(double) Math.round(Math.tan(num1)*10000)/10000+"=---------\n        "+(double) Math.round(Math.cos(num2)*10000)/10000);
                System.out.println("\n");
                System.out.println((double) Math.round(Math.tan(num1)*10000)/10000+"="+(double) Math.round((Math.sin(num1)/Math.cos(num2))*10000)/10000+"\n\n");
                if(Math.tan(num1) == Math.sin(num1)/Math.cos(num2)){
                    System.out.println("Como se puede observar son iguales los resultados");
                } else if(Math.tan(num1) != Math.sin(num1)/Math.cos(num2)){
                    System.out.println("Como se puede observar no son iguales los resultados");
                }
                break;
            default:
                System.out.println("La opción ingresada no está definida, debe escoger un número entre las opciones");
                break;
        }
    }
}
