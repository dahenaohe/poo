import java.util.Scanner;

public class ejercicio4{
    public static void main(String[] args) {
        Scanner edj = new Scanner(System.in); //edad de Juan
        System.out.println("Ingrese la edad de Juan");	
        int edadJuan = edj.nextInt();
        int edadAlberto =  2 * (edadJuan/3);
        int edadAna =  4 * (edadJuan/3);
        int edadMama = edadJuan+edadAna+edadAlberto;
        System.out.println("La edad de Juan es: " + edadJuan + "\nLa edad de Alberto es: " + edadAlberto +  "\nLa edad de Ana es: " + edadAna + "\nLa edad de la mama es: 15" + edadMama );

        
          
    }
}