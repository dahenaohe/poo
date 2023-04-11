import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaCalculadora extends JFrame {
    private JTextField txtNumero;
    private JButton btnCalcular;

    public VentanaCalculadora() {
        setTitle("Calculadora de raíz cuadrada, cuadrado y cubo");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 3));

        add(new JLabel("Número:"));
        txtNumero = new JTextField();
        add(txtNumero);

        btnCalcular = new JButton("Calcular");
        add(btnCalcular);
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularOperaciones();
            }
        });
        add(new JLabel());
    }

    private void calcularOperaciones() {
        int numero = Integer.parseInt(txtNumero.getText());

        double raizCuadrada = Calculadora.raizCuadrada(numero);
        int cuadrado = Calculadora.cuadrado(numero);
        int cubo = Calculadora.cubo(numero);

        JDialog resultadosDialog = new JDialog(this, "Resultado", true);
        resultadosDialog.setSize(400, 150);
        resultadosDialog.setLayout(new GridLayout(3, 2));

        resultadosDialog.add(new JLabel("Raíz cuadrada:"));
        resultadosDialog.add(new JLabel(String.format("%.2f", raizCuadrada)));

        resultadosDialog.add(new JLabel("Cuadrado:"));
        resultadosDialog.add(new JLabel(String.valueOf(cuadrado)));

        resultadosDialog.add(new JLabel("Cubo:"));
        resultadosDialog.add(new JLabel(String.valueOf(cubo)));

        resultadosDialog.setLocationRelativeTo(this);
        resultadosDialog.setVisible(true);
    }
}