import java.util.Scanner;

public class Atividade2{

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        System.out.println("Preço unitario do produto: ");
        double pu = e.nextInt();
        System.out.println("Quantidade comprada");
        int qtd = e.nextInt();
        System.out.println("Dinheiro recebido");
        double vp = e.nextInt();

        Troco t = new Troco(pu, qtd, vp);

        System.out.println("Seu troco: "+ t.t(qtd, pu, vp));

    }
}