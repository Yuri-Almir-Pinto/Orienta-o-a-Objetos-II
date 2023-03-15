public class Voo {
    private int qntPassageiros;
    private Passageiro[] Passageiro;
    private int assentosLivres;
    private String dataSaida;
    private String dataChegada;

    public Voo() {
        this.Passageiro = new Passageiro[40];
        this.qntPassageiros = 0;
        this.assentosLivres = 40;
    }

    public void setPassageiro (Passageiro Passageiro) {
        if (qntPassageiros < 40)
            this.Passageiro[qntPassageiros] = Passageiro;
        this.qntPassageiros++;
        this.assentosLivres--;
    }

    public void setDataSaida (String saida) {
        this.dataSaida = saida;
    }

    public void setDataChegada (String chegada) {
        this.dataChegada = chegada;
    }

    public int getQntPassageiros() {
        return qntPassageiros;
    }

    public Passageiro getPassageiro(int i) {
        return this.Passageiro[i];
    }

    public String getDataChegada() {
        return dataChegada;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public int getAssentosLivres() {
        return assentosLivres;
    }

}


