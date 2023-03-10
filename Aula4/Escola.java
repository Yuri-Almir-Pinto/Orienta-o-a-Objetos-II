public class Escola {
    private String nome;
    private String fone;
    private Turma[] vetTurmas;
    private int qtdeTurmas;

    public Escola(){
        this.vetTurmas = new Turma[20];
        this.qtdeTurmas = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public Turma getTurma(int pos){
        return this.vetTurmas[pos];
    }

    public void setTurma(Turma t){
        if(this.qtdeTurmas < 20){
            this.vetTurmas[this.qtdeTurmas] = t;
            this.qtdeTurmas++;
        }
    } 
    
    public int getQtdeTurmas(){
        return this.qtdeTurmas;
    }
}
