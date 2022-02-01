package classe;

public class Cliente {

    private String nome;
    private ContaCorrente cc;
    private ContaPoupanca poupanca;

    public Cliente(ContaCorrente cc, ContaPoupanca poupanca) {
        this.cc = cc;
        this.poupanca = poupanca;
    }

    public Cliente() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ContaCorrente getCc() {
        return cc;
    }

    public void setCc(ContaCorrente cc) {
        this.cc = cc;
    }

    public ContaPoupanca getPoupanca() {
        return poupanca;
    }

    public void setPoupanca(ContaPoupanca poupanca) {
        this.poupanca = poupanca;
    }
}
