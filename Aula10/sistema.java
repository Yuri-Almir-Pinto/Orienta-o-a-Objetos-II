public class sistema {
    public static void main(String[] args) {
        conta c = new conta();
        System.out.println("Saldo da conta normal: " + c.depositar(200));
        System.out.println("Sacando 100 reais da conta...");
        System.out.println("Saldo apos saque: " + c.sacar(100));
        System.out.println("Sacando 100 reais da conta...");
        System.out.println("Saldo apos saque: " + c.sacar(100));
        System.out.println("Depositando 200 reais na conta...");
        System.out.println("Saldo apos deposito: " + c.depositar(200));

        System.out.println("--------------------------------------");

        System.out.println("Inicializando conta especial.");
        contaEspecial ce = new contaEspecial();
        System.out.println("Depositando 1000 reais na conta especial...");
        System.out.println("Saldo apos deposito: " + ce.depositar(1000));
        System.out.println("Sacando 500 reais da conta especial...");
        System.out.println("Valor apos saque: " + ce.sacar(500));
        System.out.println("Sacando 498.5 reais da conta especial...");
        System.out.println("Valor apos saque: " + ce.sacar(498.5f));
        System.out.println("Sacando 498.5 reais da conta especial, com taxa especial de 0%...");
        System.out.println("Valor apos saque: " + ce.sacar(498.5f, 1));
    }
}
