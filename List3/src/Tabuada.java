import java.util.Scanner;

public class Tabuada{

    public static void t(int n){
        for (int i = 0; i < 10;i++){
            int c = n*i; //total da tabuada
            System.out.println(+ n +" x "+ i +" = " + c); //imprimir a tabuada
        }
    }

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        System.out.println("Deseja a tabuada para qual valor? ");
        int n = e.nextInt();
        t(n);

    }

}
