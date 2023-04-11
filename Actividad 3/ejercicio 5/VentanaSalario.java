import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaSalario extends JFrame {
    private JTextField txtNombre;
    private JTextField txtSalarioPorHora;
    private JTextField txtHorasTrabajadas;
    private JButton btnCalcular;

    public VentanaSalario() {
        setTitle("Cálculo de salario mensual");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        add(txtNombre);

        add(new JLabel("Salario por hora:"));
        txtSalarioPorHora = new JTextField();
        add(txtSalarioPorHora);

        add(new JLabel("Horas trabajadas:"));
        txtHorasTrabajadas = new JTextField();
        add(txtHorasTrabajadas);

        btnCalcular = new JButton("Calcular");
        add(btnCalcular);
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularSalarioMensual();
            }
        });

        // Centrar el botón de calcular
        add(new JLabel());
    }

    private void calcularSalarioMensual() {
        String nombre = txtNombre.getText();
        double salarioPorHora = Double.parseDouble(txtSalarioPorHora.getText());
        int horasTrabajadas = Integer.parseInt(txtHorasTrabajadas.getText());

        Empleado empleado = new Empleado(nombre, salarioPorHora, horasTrabajadas);
        double salarioMensual = empleado.calcularSalarioMensual();

        // Crear un JDialog para mostrar los resultados
        JDialog resultadosDialog = new JDialog(this, "Resultado", true);
        resultadosDialog.setSize(400, 200);
        resultadosDialog.setLayout(new GridLayout(2, 1));

        resultadosDialog.add(new JLabel("Nombre: " + empleado.getNombre()));

        if (salarioMensual > 450000) {
            resultadosDialog.add(new JLabel(String.format("Salario mensual: $%.2f", salarioMensual)));
        }

        resultadosDialog.setLocationRelativeTo(this);
        resultadosDialog.setVisible(true);
    }
}
