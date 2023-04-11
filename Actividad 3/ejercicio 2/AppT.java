import javax.swing.*;
public class AppT {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                VentanaT ventana = new VentanaT();
                ventana.setVisible(true);
            }
        });
    }
}