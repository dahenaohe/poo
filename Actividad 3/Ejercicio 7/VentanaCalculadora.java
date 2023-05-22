import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaCalculadora extends JFrame {
    private JTextArea txtNumeros;
    private JButton btnCalcular;

    public VentanaCalculadora() {
        setTitle("Calculadora de raíz cuadrada, cuadrado y cubo para un grupo de números");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
    
        JPanel instruccionesPanel = new JPanel(new BorderLayout());
        JLabel lblInstrucciones = new JLabel("Ingrese números enteros separados por comas o espacios:");
        instruccionesPanel.add(lblInstrucciones, BorderLayout.NORTH);
    
        txtNumeros = new JTextArea();
        instruccionesPanel.add(new JScrollPane(txtNumeros), BorderLayout.CENTER);
        add(instruccionesPanel, BorderLayout.CENTER);
    
        btnCalcular = new JButton("Calcular");
        add(btnCalcular, BorderLayout.SOUTH);
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularOperaciones();
            }
        });
    }
    private void calcularOperaciones() {
        String[] numerosStr = txtNumeros.getText().split("\\s*,?\\s*");
        StringBuilder resultados = new StringBuilder();

        for (String numeroStr : numerosStr) {
            if (numeroStr.isEmpty()) {
                continue;
            }
            try {
                int numero = Integer.parseInt(numeroStr);

                double raizCuadrada = Calculadora.raizCuadrada(numero);
                int cuadrado = Calculadora.cuadrado(numero);
                int cubo = Calculadora.cubo(numero);

                resultados.append("Número: ").append(numero).append("\n");
                resultados.append("Raíz cuadrada: ").append(String.format("%.2f", raizCuadrada)).append("\n");
                resultados.append("Cuadrado: ").append(cuadrado).append("\n");
                resultados.append("Cubo: ").append(cubo).append("\n\n");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Por favor ingrese números enteros separados por comas o espacios", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        JDialog resultadosDialog = new JDialog(this, "Resultado", true);
        resultadosDialog.setSize(400, 300);

        JTextArea resultadosArea = new JTextArea(resultados.toString());
        resultadosArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultadosArea);
        resultadosDialog.add(scrollPane);

        resultadosDialog.setLocationRelativeTo(this);
        resultadosDialog.setVisible(true);
    }
}
    
