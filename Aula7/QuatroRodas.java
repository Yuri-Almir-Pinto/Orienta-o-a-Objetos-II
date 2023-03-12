public class QuatroRodas extends Terrestre {
    private boolean possuiArCond;
    private boolean possuiDireHidra;
    private boolean possuiMarchaAuto;

    public QuatroRodas() throws Exception {
        System.out.println ("Digite se seu veiculo possui ar condicionado: ");
        this.setPossuiArCond(setBool());
        System.out.println ("Digite se seu veiculo possui direcao hidraulica: ");
        this.setPossuiDireHidra(setBool());
        System.out.println ("Digite se seu veiculo possui marcha automatica: ");
        this.setPossuiMarchaAuto(setBool());
    }
    
    public boolean isPossuiArCond() {
        return possuiArCond;
    }
    public void setPossuiArCond(boolean possuiArCond) {
        this.possuiArCond = possuiArCond;
    }
    public boolean isPossuiDireHidra() {
        return possuiDireHidra;
    }
    public void setPossuiDireHidra(boolean possuiDireHidra) {
        this.possuiDireHidra = possuiDireHidra;
    }
    public boolean isPossuiMarchaAuto() {
        return possuiMarchaAuto;
    }
    public void setPossuiMarchaAuto(boolean possuiMarchaAuto) {
        this.possuiMarchaAuto = possuiMarchaAuto;
    }


    
}
