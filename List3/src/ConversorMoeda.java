public class ConversorMoeda {
    
    private double dolar;
    private double qnt;

    public ConversorMoeda(double dolar, double qnt) {
        this.dolar = dolar;
        this.qnt = qnt;
    }


    public static void Imposto(double dolar, double qnt){ //c = conta_total

        double c = (dolar*qnt)*6/100;
        System.out.println("Funcionário: Valor a ser pago em reais = " + c);
    }
}