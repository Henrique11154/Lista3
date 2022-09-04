import java.util.ArrayList;
import java.util.Scanner;

public class HotelPet {
    
    public static void main(String[] args) {
        ArrayList<Animal> a = new ArrayList<>();
        Scanner e = new Scanner(System.in);

        for(int i = 0; i<1;){

            System.out.println("-----Menu-----");
            System.out.println("1- Check-in");
            System.out.println("2- Check-out");
            System.out.println("0- Sair");
            int o = e.nextInt(); // opção

            switch (o) {
                case 1:
                    e.nextLine();
                    System.out.print("informe o nome do pet: ");
                    String nome = e.nextLine();
                    System.out.print("Informe a raça do pet: ");
                    String raca = e.nextLine();
                    if (raca == "Gato" || raca == "gato"){
                        Gato g = new Gato(nome); //g = gato
                        a.add(g);
                        g.mia();
                        g.raca = "gato";
                    }else if(raca == "Cachorro" || raca == "cachorro"){
                        Cachorro c = new Cachorro(nome); //c = cachorro
                        a.add(c);
                        c.latir();
                        c.raca = "cachorro";
                    }
                    break;
            
                case 2:
                    System.out.print("Qual o nome do animal: ");
                    Animal n1 = new Animal(e.next()); //variavel aleatoria
                    for (int j = 0; j < a.size();j++){
                        if(n1 == a.get(j)){
                            System.out.println("Até mais "+a.get(j)+", volte sempre!");
                            a.remove(j);
                        }else{
                            System.out.println("Não foi possivel encontrar esse pet.");
                        }
                    }
                    break;
                case 0:
                    i = 1; 
            }
        }
    }
}
