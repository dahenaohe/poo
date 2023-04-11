public class ComparadorNumeros{
    private double a;
    private double b;

    public ComparadorNumeros(double a, double b){
        this.a = a;
        this.b = b;
    }

    public String comparar(){
        if(a > b){
            return "El numero " + a + " es mayor que " + b;
        }else if(a < b){
            return "El numero " + a + " es menor que " + b;
        }else{
            return "El numero " + a + " es igual que " + b;
        }
    }
}