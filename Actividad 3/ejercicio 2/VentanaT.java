import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaT extends JFrame {
    private JTextField txtLado;
    private JButton btnCalcular;

    public VentanaT() {
        setTitle("Cálculo de triángulo equilátero");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 2));

        add(new JLabel("Lado:"));
        txtLado = new JTextField();
        add(txtLado);

        btnCalcular = new JButton("Calcular");
        add(btnCalcular);
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularT();
            }
        });
    }

    private void calcularT() {
        double lado = Double.parseDouble(txtLado.getText());
        TrianguloE triangulo = new TrianguloE(lado);

        double perimetro = triangulo.calcPerimetro();
        double altura = triangulo.calcAltura();
        double area = triangulo.calcArea();
        
        JDialog resultadosDialog = new JDialog(this, "Resultados del triángulo equilátero", true);
        resultadosDialog.setSize(300, 200);
        resultadosDialog.setLayout(new GridLayout(3, 1));

        JLabel lblPerimetro = new JLabel("Perímetro: " + String.format("%.2f", perimetro));
        resultadosDialog.add(lblPerimetro);

        JLabel lblAltura = new JLabel("Altura: " + String.format("%.2f", altura));
        resultadosDialog.add(lblAltura);

        JLabel lblArea = new JLabel("Área: " + String.format("%.2f", area));
        resultadosDialog.add(lblArea);

        resultadosDialog.setLocationRelativeTo(this);
        resultadosDialog.setVisible(true);
    }
}
