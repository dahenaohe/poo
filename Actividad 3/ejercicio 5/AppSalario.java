import javax.swing.*;
public class AppSalario {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                VentanaSalario ventana = new VentanaSalario();
                ventana.setVisible(true);
            }
        });
    }
}
