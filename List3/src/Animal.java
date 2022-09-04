public class Animal {
    
    protected String nome;
    protected String raca;

    public Animal(){}

    public Animal(String nome) {
        this.nome = nome;
    }

    public String caminhada(){

        return "O "+raca+" esta passeando";
    }
    
}
