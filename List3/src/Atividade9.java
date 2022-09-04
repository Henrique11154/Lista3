import java.util.Scanner;

public class Atividade9 {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        System.out.println("Qual o valor do dólar? ");
        Double dolar = e.nextDouble();
        System.out.println("Quantos dólares serão comprados? ");
        int qnt = e.nextInt();
        ConversorMoeda c = new ConversorMoeda(dolar, qnt);
        c.Imposto(dolar, qnt);
        

    }
    
}
