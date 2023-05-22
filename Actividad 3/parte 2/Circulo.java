public class Circulo{
    int radio;
    public Circulo(int radio){
        this.radio=radio;
    }
    double area(){
        return Math.PI*(radio*radio);
    }
    double perimetro(){
        return (2*Math.PI)*radio;
    }
}