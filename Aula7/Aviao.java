public class Aviao extends Aereo {
    private boolean eletrico;
    private boolean helice;
    private boolean comercial;
    private String tamanho;

    public Aviao () throws Exception {
        System.out.println ("Digite se seu aviao eh eletrico: ");
        this.setEletrico(setBool());
        System.out.println ("Digite se seu aviao possui helices: ");
        this.setHelice(setBool());
        System.out.println ("Digite se seu aviao eh comercial: ");
        this.setComercial(setBool());
        System.out.println ("Digite o tamanho do seu aviao, descritivamente: ");
        this.setTamanho(re.readLine());
    }

    public boolean isEletrico() {
        return eletrico;
    }
    public void setEletrico(boolean eletrico) {
        this.eletrico = eletrico;
    }
    public boolean isHelice() {
        return helice;
    }
    public void setHelice(boolean helice) {
        this.helice = helice;
    }
    public boolean isComercial() {
        return comercial;
    }
    public void setComercial(boolean comercial) {
        this.comercial = comercial;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    
}
