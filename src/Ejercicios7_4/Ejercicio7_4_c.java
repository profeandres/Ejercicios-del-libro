package Ejercicios7_4;

import java.util.Scanner;

/*
Construir un programa Java que lea una cadena y que ofrezca el
siguiente menú: 1) mostrar sus dos primeras letras, 2) mostrar sus tres
primeras letras, 3) mostrar sus cuatro primeras letras, 4) mostrar sus
cuatro últimas letras, 5) mostrar sus tres últimas letras, 6) mostrar sus
dos últimas letras, 7) mostrar su última letra
*/
public class Ejercicio7_4_c {
    private static Scanner op;
    public static void main(String[] args) {
        //Se construye el Scanner
        op=new Scanner(System.in);
        
        //Se pide ingresar una cadena de texto
        System.out.println("Ingrese una cadena de texto (cualquiera palabra que desee)");

        //Se almacena la cadena
        String cad1=op.nextLine();

        //Mostrar menu de opciones
        System.out.println("----Escoja una de las siguientes opciones----\n1) Mostrar sus dos primeras letras \n2) Mostrar sus tres primeras letras \n3) Mostrar sus cuatro primeras letras \n4) Mostrar sus cuatro últimas letras \n5) Mostrar sus tres últimas letras \n6) Mostrar sus dos últimas letras \n7) Mostrar su última letra");

        //Guardar opcion
        int opcion=op.nextInt();

        //Construir los casos
        switch (opcion) {
            case 1:
                System.out.println(cad1.substring(0,2));
                break;                
            case 2:
                System.out.println(cad1.substring(0,3));
                break;
            case 3:
                System.out.println(cad1.substring(0,4));
                break;
            case 4:
                System.out.println(cad1.substring(cad1.length()-4));
                break;
            case 5:
                System.out.println(cad1.substring(cad1.length()-3));
                break;
            case 6:
                System.out.println(cad1.substring(cad1.length()-2));
                break;
            case 7:
                System.out.println(cad1.substring(cad1.length()-1));
                break;
        
            default:
                System.out.println("La opción ingresada no está definida, debe escoger un número entre las opciones");
                break;
        }

    }
}
