import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaComparador extends JFrame {
    private JTextField txtA;
    private JTextField txtB;
    private JButton btnComparar;

    public VentanaComparador(){
        setTitle("Comparador de números");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        add(new JLabel("A:"));
        txtA = new JTextField();
        add(txtA);

        add(new JLabel("B:"));
        txtB = new JTextField();
        add(txtB);

        btnComparar = new JButton("Comparar");
        add(btnComparar);
        btnComparar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                compararNumeros();
            }
        });
        add(new JLabel());
    }
    private void compararNumeros(){
        double a = Double.parseDouble(txtA.getText());
        double b = Double.parseDouble(txtB.getText());
        ComparadorNumeros comparador = new ComparadorNumeros(a, b);

        String resultado = comparador.comparar();

        JDialog resultadosDialog = new JDialog(this, "Resultado", true);
        resultadosDialog.setSize(300, 100);
        resultadosDialog.setLayout(new FlowLayout());

        JLabel lblResultado = new JLabel(resultado);
        resultadosDialog.add(lblResultado);

        resultadosDialog.setLocationRelativeTo(this);
        resultadosDialog.setVisible(true);
    }
}
