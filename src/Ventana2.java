import javax.swing.JOptionPane;

public class Ventana2 {
    public static void main(String[] args) {
        String Hijos;
        Hijos=JOptionPane.showInputDialog("¿Cuántos hijos tienes?");
        int NumHijos=Integer.parseInt(Hijos);
        System.out.println("Con un hijo más tendrás " + (NumHijos + 1));
        
    }
}
