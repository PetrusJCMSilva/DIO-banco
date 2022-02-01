package classe;

public class Conta implements IConta {

    private static  int SEQUENCIAL = 1;
    private static final int AGENCIA_PADRAO = 1;

    protected int agencia;
    protected int numero;
    private double saldo;



    public Conta() {

        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;

    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {

        this.saldo -= valor;

    }

    @Override
    public void depositar(double valor) {

        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {

        this.sacar(valor);
        contaDestino.depositar(valor);

    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Agencia: " + agencia);
        System.out.println("Numero: " + numero);
        System.out.println("Saldo: " + saldo);
    }


}
