public class Companhia {
    private String nomeCompanhia;
    private int idCompanhia;
    private Voo[] voos; 
    private int qntVoos;


public Companhia () {
    this.voos = new Voo[20];
    this.qntVoos = 0;
}

public void setVoo (Voo v) {
    if (this.qntVoos < 20)
    {
        this.voos[this.qntVoos] = v;
        this.qntVoos++;
    }
}

public int getQntVoos () {
    return this.qntVoos;
}

public Voo getVoos (int i) {
    return this.voos[i];
}

public void setNomeCompanhia(String nomeCompanhia) {
    this.nomeCompanhia = nomeCompanhia;
}

public void setIdCompanhia(int idCompanhia) {
    this.idCompanhia = idCompanhia;
}

}