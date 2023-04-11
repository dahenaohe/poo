public class Empleado {
    
    private String codigo;
    private String nombres;
    private int hTrabajadas;
    private double valorHora;
    private double pRetencion;

    public Empleado(String codigo, String nombres, int hTrabajadas, double valorHora, double pRetencion) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.hTrabajadas = hTrabajadas;
        this.valorHora = valorHora;
        this.pRetencion = pRetencion;
    }

    public double calcularSalarioB(){
        return hTrabajadas * valorHora;
    }

    public double calcularSalarioN(){
        return calcularSalarioB() - (calcularSalarioB() * pRetencion / 100);
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombres() {
        return nombres;
    }
}