import static java.lang.System.out;

public class App {
    public static void main(String[] args) throws Exception {

        Conta minhaConta;
        Conta suaConta;

        minhaConta = new Conta();
        suaConta = new Conta();

        minhaConta.nome = "Barry Burd";
        minhaConta.endereco = "Rua Ciberespaço 222";
        minhaConta.saldo = 24.02;

        suaConta.nome = "João Q. Público";
        suaConta.endereco = "Rua do Consumidor 111";
        suaConta.saldo = 55.63;       
        
        minhaConta.display();

        out.print(" mais $");
        out.print(minhaConta.getJuros(5.00));
        out.println(" juros");

        suaConta.display();

        double suaTaxaJuros = 7.00;
        out.print(" mais $");
        double seuValorJuros = suaConta.getJuros(suaTaxaJuros);
        out.print(seuValorJuros);
        out.println(" juros");


    }
}
