public class conta {
    private int numeroConta;
    private String nomeCliente;
    private float saldo;

    public float depositar(float valor) {
        this.saldo += valor;
        System.out.println("Valor depositado: " + valor);
        return saldo;
    }

    public float sacar(float valor) {
        float valorFinal = valor * 1.005f;
        if (this.saldo < valorFinal) {
            System.out.println("Saldo insuficiente na conta");
            return 0f;
        }
        else {
            this.saldo -= valorFinal;
            return saldo;
        }
    }

    public float getSaldo() {
        return this.saldo;
    }

    public float setSaldo(float saldo) {
        return this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
}

    