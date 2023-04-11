public class TrianguloE{
    private double lado;

    public TrianguloE(double lado){
        this.lado = lado;
    }
    public double calcPerimetro(){
        return lado * 3;
    }
    public double calcArea(){
        return (lado * lado) * Math.sqrt(3) / 4;
    }
    public double calcAltura(){
        return lado * Math.sqrt(3) / 2;
    }
}