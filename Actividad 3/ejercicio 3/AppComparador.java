import javax.swing.*;
public class AppComparador {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                VentanaComparador ventana = new VentanaComparador();
                ventana.setVisible(true);
            }
        });
    }
}