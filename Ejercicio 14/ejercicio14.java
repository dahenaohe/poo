import java.util.Scanner;
public class ejercicio14{
    public static void main(String[] args){
        Scanner numero = new Scanner(System.in);
        System.out.println("Introduce un numero que quieras elevar al cuadrado y al cubo: ");
        Double num = numero.nextDouble();// Uso double para que podamos usar numeros decimales.
        Double cuadrado = num * num; // Aqui se eleva al cuadrado, se puede usar el math.pow pero no voy a invocar la funcion en este caso.
        Double cubo = Math.pow(num, 3); // Aqui se eleva al cubo usando la funcion Math.pow
        System.out.println("El cuadrado de " + num + " es " + cuadrado + " y el cubo es " + cubo);
        }
}
