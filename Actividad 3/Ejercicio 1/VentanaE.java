import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaE extends JFrame {
    private JTextField txtCodigo;
    private JTextField txtNombres;
    private JTextField txtHorasTrabajadas;
    private JTextField txtValorHora;
    private JTextField txtPorcentajeRetencion;
    private JButton btnCalcular;
    private JLabel lblSalarioBruto;
    private JLabel lblSalarioNeto;
    
    public VentanaE() {
        setTitle("Cálculo de salario");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel centralPanel = new JPanel();
        centralPanel.setLayout(new BoxLayout(centralPanel, BoxLayout.Y_AXIS));
        add(centralPanel, BorderLayout.CENTER);

        centralPanel.add(new JLabel("Código:"));
        txtCodigo = new JTextField();
        centralPanel.add(txtCodigo);

        centralPanel.add(new JLabel("Nombres:"));
        txtNombres = new JTextField();
        centralPanel.add(txtNombres);

        centralPanel.add(new JLabel("Horas trabajadas:"));
        txtHorasTrabajadas = new JTextField();
        centralPanel.add(txtHorasTrabajadas);

        centralPanel.add(new JLabel("Valor hora trabajada:"));
        txtValorHora = new JTextField();
        centralPanel.add(txtValorHora);

        centralPanel.add(new JLabel("Porcentaje de retención:"));
        txtPorcentajeRetencion = new JTextField();
        centralPanel.add(txtPorcentajeRetencion);

        btnCalcular = new JButton("Calcular");
        add(btnCalcular, BorderLayout.SOUTH);
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularSalario();
                mostrarDetallesEmpleado();
            }
        });

        lblSalarioBruto = new JLabel("Salario bruto:");
        centralPanel.add(lblSalarioBruto);

        lblSalarioNeto = new JLabel("Salario neto:");
        centralPanel.add(lblSalarioNeto);
    }


    private void mostrarDetallesEmpleado() {
        JFrame detallesEmpleado = new JFrame("Detalles del empleado");
        detallesEmpleado.setSize(300, 200);
        detallesEmpleado.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        detallesEmpleado.setLayout(new GridLayout(6, 2));

        detallesEmpleado.add(new JLabel("Código:"));
        detallesEmpleado.add(new JLabel(txtCodigo.getText()));

        detallesEmpleado.add(new JLabel("Nombres:"));
        detallesEmpleado.add(new JLabel(txtNombres.getText()));

        detallesEmpleado.add(new JLabel("Horas trabajadas:"));
        detallesEmpleado.add(new JLabel(txtHorasTrabajadas.getText()));

        detallesEmpleado.add(new JLabel("Valor hora trabajada:"));
        detallesEmpleado.add(new JLabel(txtValorHora.getText()));

        detallesEmpleado.add(new JLabel("Salario bruto:"));
        detallesEmpleado.add(new JLabel(lblSalarioBruto.getText()));

        detallesEmpleado.add(new JLabel("Salario neto:"));
        detallesEmpleado.add(new JLabel(lblSalarioNeto.getText()));

        detallesEmpleado.setVisible(true);
    }

    private void calcularSalario() {
        String codigo = txtCodigo.getText();
        String nombres = txtNombres.getText();
        int horasTrabajadas = Integer.parseInt(txtHorasTrabajadas.getText());
        double valorHora = Double.parseDouble(txtValorHora.getText());
        double porcentajeRetencion = Double.parseDouble(txtPorcentajeRetencion.getText());
        Empleado empleado = new Empleado(codigo, nombres, horasTrabajadas, valorHora, porcentajeRetencion);
        double salarioBruto = empleado.calcularSalarioB();
        double salarioNeto = empleado.calcularSalarioN();
        lblSalarioBruto.setText(String.format("%.2f", salarioBruto));
        lblSalarioNeto.setText(String.format("%.2f", salarioNeto));
    }
}
