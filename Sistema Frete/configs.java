class configs { // Leve conveniencia. Guarda as informações do arquivo de configuração, para uso no código principal.
    private float EN;
    private float EE;

    public float getEN() {
        return EN;
    }
    public float getEE() {
        return EE;
    }
    public void setEN(float eN) {
        EN = eN;
    }
    public void setEE(float eE) {
        EE = eE;
    }

    protected void setAll(float all) { 
        this.EN = all;
        this.EE = all;
    }

    protected boolean checkFound() { // Checa se EN e EE estão como -1. Se estiverem, considera que não encontrou o arquivo de configuração.
        if (this.EN == -1 && this.EE == -1) {
            return false;
        }
        else return true;
    }

    
}