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
        
        out.print(minhaConta.nome);
        out.print("(");
        out.print(minhaConta.endereco);
        out.print(") tem $");
        out.print(minhaConta.saldo);
        out.println();

        out.print(suaConta.nome);
        out.print("(");
        out.print(suaConta.endereco);
        out.print(") tem $");
        out.print(suaConta.saldo);
        out.println();


    }
}
