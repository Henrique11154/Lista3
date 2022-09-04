public class Funcionario {

    private String nome;
    private double SalarioBruto;
    private double Imposto;
    
    
    public Funcionario(String nome, double salarioBruto, double imposto) {
        this.nome = nome;
        SalarioBruto = salarioBruto;
        Imposto = imposto;
    }

    public double buscaSalarioLiquido(){
        
        double salarioLiquido = SalarioBruto - Imposto;
        
        return salarioLiquido;
    }

    public void AumentarSalario(double porcentagem){

        this.SalarioBruto =+ SalarioBruto * (porcentagem/100);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return SalarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        SalarioBruto = salarioBruto;
    }

    public double getImposto() {
        return Imposto;
    }

    public void setImposto(double imposto) {
        Imposto = imposto;
    }
    
    
}
