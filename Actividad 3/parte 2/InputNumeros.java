import javax.swing.*;

public class InputNumeros {
    public static void main(String args[]){
        int radio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el radio del círculo"));
        Circulo circulo=new Circulo(radio);
        
        int baseRectangulo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base del rectángulo"));
        int alturaRectangulo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura del rectángulo"));
        Rectangulo rectangulo=new Rectangulo(baseRectangulo, alturaRectangulo);

        int lado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el lado del cuadrado"));
        Cuadrado cuadrado=new Cuadrado(lado);

        int baseTriangulo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base del triángulo"));
        int alturaTriangulo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura del triángulo"));
        TrianguloRectangulo triangulo=new TrianguloRectangulo(baseTriangulo,alturaTriangulo);

        
        JOptionPane.showMessageDialog(null, "El area del circulo es: "+circulo.area());
        JOptionPane.showMessageDialog(null, "El perimetro del circulo es: "+circulo.perimetro());
        JOptionPane.showMessageDialog(null, "El area del rectangulo es: "+rectangulo.area());
        JOptionPane.showMessageDialog(null, "El perimetro del rectangulo es: "+rectangulo.perimetro());
        JOptionPane.showMessageDialog(null, "El area del cuadrado es: "+cuadrado.area());
        JOptionPane.showMessageDialog(null, "El perimetro del cuadrado es: "+cuadrado.perimetro());
        JOptionPane.showMessageDialog(null, "El area del triangulo es: "+triangulo.area());
        JOptionPane.showMessageDialog(null, "El perimetro del triangulo es: "+triangulo.perimetro());
        JOptionPane.showMessageDialog(null, "La hipotenusa del triangulo es: "+triangulo.hipotenusa());
        triangulo.determinarTipo();

    }

}
