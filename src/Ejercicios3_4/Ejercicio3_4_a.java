package Ejercicios3_4;
/*
Determinar el valor final de A,B y C
int A, B, C;
A = 10;
B = 12;
C = 15;
A = A + B;
B = B + C;
C = C + A;
A = A + B;
B = B + C;
C = C + A;
*/
public class Ejercicio3_4_a {
    public static void main(String[] args) {
        int A, B, C;
            A = 10;
            B = 12;
            C = 15;
            A = A + B;
            B = B + C;
            C = C + A;
            A = A + B;
            B = B + C;
            C = C + A;
        System.out.println("A: "+A+"\nB: "+B+"\nC: "+C);
    }
    
}