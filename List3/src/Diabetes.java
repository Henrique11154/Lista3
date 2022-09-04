import java.util.Scanner;

public class Diabetes {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        

        System.out.println("Digite a medida da glicose:");
        float mG = entrada.nextFloat(); // medida de Glicose

        if(mG<=100){
            System.out.println("Classificacao: normal");
        }else if(mG==100||mG<=140){
            System.out.println("Classificacao: elevado");
        }else if(mG>140){
            System.out.println("Classificacao: diabetes");
        }
    }
    
}

