package Ejercicios3_4;
/*
Determinar el valor final de A,B y C
int A, B, C;
A = 20;
B = 22;
C = 25;
A = A + B + C;
B = B + C – A;
C = C + A + B;
A = A + B – C;
B = B + C + A;
C = C + A – B ; 
*/
public class Ejercicio3_4_c {
    public static void main(String[] args) {
        int A, B, C;
            A = 20;
            B = 22;
            C = 25;
            A = A + B + C;
            B = B + C - A;
            C = C + A + B;
            A = A + B - C;
            B = B + C + A;
            C = C + A - B;
        System.out.println("A: "+A+"\nB: "+B+"\nC: "+C);
    }
    
}