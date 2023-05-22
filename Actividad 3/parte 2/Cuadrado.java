public class Cuadrado {
    int lado;
    public Cuadrado(int lado){
        this.lado=lado;
    }
    double area(){
        return lado*lado;
    }
    double perimetro(){
        return 4*lado;
    }
}
