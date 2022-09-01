public class Troco {
    
    private double pu; //produto unitario
    private int qtd;
    private double vp; //valor pago
    
    
    public Troco(double pu, int qtd, double vp) {
        this.pu = pu;
        this.qtd = qtd;
        this.vp = vp;
    }
    
    public double t(int qnt, double pu, double vp){
        double c = qnt * pu;
        double troco = vp-c;
        if (c > vp){
            System.out.println("Você não tem dinheiro suficiente");
        }else if(c == vp){
            return troco;
        }else{
            return troco;
        }

        return 0;
    }

}
