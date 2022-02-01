import classe.Cliente;
import classe.Conta;
import classe.ContaCorrente;
import classe.ContaPoupanca;

import java.util.List;

public class Main {


    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca poupanca = new ContaPoupanca();

        Cliente venilton = new Cliente(cc, poupanca);
        venilton.setNome("Venilton");



        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
