import java.util.Scanner;

public class Idades {
    
    public static void main(String[] args) {
        
        Scanner e = new Scanner(System.in);

        System.out.println("Dados da primeira pessoa");
        System.out.print("Nome: ");
        String nome = e.nextLine();
        System.out.print("Idade: ");
        int i = e.nextInt();
        e.nextLine();
        System.out.println("Dados da segunda pessoa:");
        System.out.print("Nome: ");
        String n2 = e.nextLine();
        System.out.println("Idade: ");
        int i2 = e.nextInt();
        
        float media = (i + i2)/2;

        System.out.println("A idade média de "+nome+" e "+ n2+
        " é de "+media+" anos");
        
    }
}
