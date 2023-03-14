public class encoExpressa extends encoNormais {
    protected int prazoEntrega;
    protected String foneContato;
    protected static int atual = 0;

    public int getPrazoEntrega() {
        return prazoEntrega;
    }

    public String getFoneContato() {
        return foneContato;
    }

    public float calcularValorFrete(float valConfig) { // Calcula o valor do frete. Se for para 3 dias ou mais vai normal. Se for 2 dias ou menos, incrementa 25% no preço
        float frete = 0;

        if (this.prazoEntrega >= 3) {
            frete = (this.peso * valConfig);
        }
        else if (this.prazoEntrega <= 2) {
            frete = (this.peso * valConfig) * 1.25f;
        }
        
        return frete;
    }

    public void setInfo(int nroPedido, String dataPostagem, float peso, int prazoEntrega, String foneContato) { // Seta todos os atributos do objeto ao mesmo tempo, e incrementa o atual.
        this.nroPedido = nroPedido;
        this.dataPostagem = dataPostagem;
        this.peso = peso;
        this.prazoEntrega = prazoEntrega;
        this.foneContato = foneContato;
        encoExpressa.atual = encoExpressa.atual + 1;
    }
}
