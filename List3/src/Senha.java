import java.util.Scanner;

public class Senha{

    public static void s(){
        Scanner e = new Scanner(System.in);    

        boolean t = true;

        System.out.println("Digite a senha");
        int senha = e.nextInt();

        while(t == true){
                if (senha == 2002){
                System.out.println("Acesso Permitido");
                t = false;
            }else{
                System.out.println("Senha Inválida! Tente novamente: ");
                senha = e.nextInt();
            }
        }
    
    }

    public static void main(String[] args) {
        s();
    }
}
