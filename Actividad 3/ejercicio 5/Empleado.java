public class Empleado {
    private String nombre;
    private double salarioPorHora;
    private int horasTrabajadas;

    public Empleado(String nombre, double salarioPorHora, int horasTrabajadas) {
        this.nombre = nombre;
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getNombre() {
        return nombre;
    }

    public double calcularSalarioMensual() {
        return salarioPorHora * horasTrabajadas;
    }
}