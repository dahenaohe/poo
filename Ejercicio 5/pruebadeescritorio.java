public class pruebadeescritorio {
        public static void main(String[] args) {
            int S=0;
            int x=20;
            S=S+(x);
            int y=40;
            x= x+(int) Math.pow(y,2);
            S=S+(x/y);
            System.out.println("El valor de la suma es: " + S);           
        }
}
