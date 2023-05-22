public class TrianguloRectangulo {
    int base;
    int altura;
    public TrianguloRectangulo(int base, int altura){
        this.base=base;
        this.altura=altura;
    }
    double area(){
        return base*altura/2;
    }
    double perimetro(){
        return base+altura+Math.sqrt(base*base+altura*altura);
    }
    double  hipotenusa(){
        return Math.sqrt(base*base+altura*altura);
    }

    void determinarTipo(){
    if((base == altura) & (base==hipotenusa()) & (altura==hipotenusa())){
            System.out.println("Es un triangulo equilatero");
        }
    else if((base!=altura)&(base!=hipotenusa())&(altura!=hipotenusa())){
            System.out.println("Es un triangulo escaleno, todos sus lados son diferentes");
        }
    else{ System.out.println("Es un triangulo isosceles");
        }
    }
}

