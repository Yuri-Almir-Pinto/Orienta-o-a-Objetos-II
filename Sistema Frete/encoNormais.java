public class encoNormais {
    protected int nroPedido;
    protected String dataPostagem;
    protected float peso;
    protected static int atual = 0;

    public int getNroPedido() {
        return nroPedido;
    }
    public String getDataPostagem() {
        return dataPostagem;
    }
    public float getPeso() {
        return peso;
    }
    public int getAtual () {
        return atual;
    }
    public void setInfo(int nroPedido, String dataPostagem, float peso) { // Seta as informações do objeto, todas de uma vez, e incrementa no atual.
        this.nroPedido = nroPedido;
        this.dataPostagem = dataPostagem;
        this.peso = peso;
        encoNormais.atual = encoNormais.atual + 1;
    }
    public float calcularValorFrete(float valConfig) {
        return (this.peso * valConfig);
    }
}
