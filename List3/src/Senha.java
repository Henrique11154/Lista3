package List3.src;
import java.util.Scanner;

public class Senha{

    public static void s(String senha){
        if (senha != "2002"){
            System.out.println("Senha Inválida! Tente novamente: ");
            
        }else{
            System.out.println("Acesso Permitido");
        }
    }

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);    

        boolean t = true;

        System.out.println("Digite a senha");
        String senha = e.next();

        while(t == true){
            s(senha);
            senha = e.next();
        }
    }
}
