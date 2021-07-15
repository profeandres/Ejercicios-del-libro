// Se incluye la Clase JOptionPane para crear ventanas
import javax.swing.JOptionPane;
public class Ventana3 { // Clase principal
public static void main(String args[ ]) { // Método principal
// Se declara una variable String para recibir lo que retorne la ventana
String N1 = JOptionPane.showInputDialog("Escriba valor con decimales");
// Se declara una variable double para convertir la cadena recibida
// en su equivalente número con decimales
double N2 = Double.parseDouble(N1);

// Se muestra (por consola) el resultado de la raíz cúbica del número leído
System.out.print("La raíz cúbica de " + N1 + " es ");
System.out.printf("%1.3f",Math.cbrt(N2));
System.out.println("");
System.out.print(Math.cbrt(N2));

} }