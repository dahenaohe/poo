import java.util.Scanner;
public class ejercicio17{
    public static void main (String[] args){
        Scanner r=new Scanner(System.in);
        System.out.println("Introduce el radio del círculo: ");
        double radio=r.nextDouble();
        double area=Math.PI*Math.pow(radio,2);
        double longitud=2*Math.PI*radio;
        System.out.println("El área del círculo es: "+area+" y la longitud es: "+longitud);    
    }
}
