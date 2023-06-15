public class Transacoes {

    public static void main(String[] args) {
        Cliente renan = new Cliente();
        renan.setNome("Renan");

        Conta cc = new ContaCorrente(renan);
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(renan);

        cc.transferir(poupanca, 100);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}