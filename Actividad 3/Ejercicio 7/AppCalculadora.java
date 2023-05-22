import javax.swing.*;
public class AppCalculadora {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                VentanaCalculadora ventana = new VentanaCalculadora();
                ventana.setVisible(true);
            }
        });
    }
}
