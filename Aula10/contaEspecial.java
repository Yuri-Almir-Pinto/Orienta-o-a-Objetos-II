public class contaEspecial extends conta {
    @Override
    public float sacar(float valor) {
        float saldo = this.getSaldo();
        float valorFinal = valor * 1.003f;
        if (saldo < valorFinal) {
            System.out.println("Saldo insuficiente na conta");
            return 0f;
        }
        else {
            saldo -= valorFinal;
            this.setSaldo(saldo);
            return saldo;
        }
    }

    public float sacar(float valor, float taxaD) {
        float saldo = this.getSaldo();
        float valorFinal = valor*taxaD;
        if (saldo < valorFinal) {
            System.out.println("Saldo insuficiente na conta");
            return 0f;
        }
        else {
            saldo -= valorFinal;
            this.setSaldo(saldo);
            return saldo;
        }
    }
}
