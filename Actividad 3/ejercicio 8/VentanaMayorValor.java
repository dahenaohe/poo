import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaMayorValor extends JFrame {
    private JTextArea txtNumeros;
    private JButton btnCalcular;

    public VentanaMayorValor() {
        setTitle("Calculadora del mayor valor");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel instruccionesPanel = new JPanel(new BorderLayout());
        JLabel lblInstrucciones = new JLabel("Ingrese números enteros separados por espacios:");
        instruccionesPanel.add(lblInstrucciones, BorderLayout.NORTH);

        txtNumeros = new JTextArea();
        instruccionesPanel.add(new JScrollPane(txtNumeros), BorderLayout.CENTER);
        add(instruccionesPanel, BorderLayout.CENTER);

        btnCalcular = new JButton("Calcular");
        add(btnCalcular, BorderLayout.SOUTH);
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularMayor();
            }
        });

        setLocationRelativeTo(null);
    }

    private void calcularMayor() {
        String[] numerosStr = txtNumeros.getText().split("\\s+");
        try {
            int maximo = Calculadora.obtenerMaximo(numerosStr);
            JOptionPane.showMessageDialog(this, "El número más grande es: " + maximo, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese sólo números", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaMayorValor().setVisible(true);
            }
        });
    }
}

class Calculadora {
    static int obtenerMaximo(String[] numerosComoCadenas) throws NumberFormatException {
        int maximo = Integer.MIN_VALUE;

        for (String s : numerosComoCadenas) {
            int numero = Integer.parseInt(s);

            if (numero > maximo) {
                maximo = numero;
            }
        }

        return maximo;
    }
}
