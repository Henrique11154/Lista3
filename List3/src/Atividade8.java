import java.util.Scanner;

public class Atividade8 {
    
    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = e.nextLine();

        System.out.println("Salário Bruto: ");
        double salarioBruto = e.nextDouble();

        System.out.println("Imposto: ");
        double Imposto = e.nextInt();

        Funcionario f = new Funcionario(nome, salarioBruto, Imposto);

        System.out.println("Funcionario"+f.getNome()+", salario liquido: "+f.buscaSalarioLiquido());
        System.out.print("Qual a porcentagem para aumentar o salario? ");
        double porcentagem = e.nextDouble();
        f.AumentarSalario(porcentagem);
        System.out.println("Dados atualizados: "+f.getNome()+" R$"+f.buscaSalarioLiquido());
   }
}
