public class ejercicio12 {
    public static void main(String[] args){
        double HT = 48; //Horas trabajadas
        double PH = 5000; //Pago por hora
        double SB = HT * PH; //Salario bruto
        double SN = SB - (SB * 0.125); //Salario neto
        System.out.println("El salario bruto es: " + SB + "semanal" + "\nEl salario neto es: " + SN + "semanal");
    }
}