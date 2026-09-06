import static java.lang.System.out;

public class Conta{
    String nome;
    String endereco;
    double saldo;
    
    public void display(){
        out.print(nome);
        out.print("(");
        out.print(endereco);
        out.print(") tem $");
        out.print(saldo);
    }

    public double getJuros(double taxaPercentual){
        return saldo * taxaPercentual / 100;
    }

}