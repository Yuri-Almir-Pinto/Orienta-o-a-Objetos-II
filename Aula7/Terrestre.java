

public class Terrestre extends Veiculos {
    private String tipoDeTerreno;
    private Integer QntRodas;

    public Terrestre () throws Exception {
        System.out.println ("Agora, digite o tipo de terreno que seu veiculo terrestre eh capaz de viajar com eficiencia: ");
        this.setTipoDeTerreno(re.readLine());
        
    }

    public String getTipoDeTerreno() {
        return tipoDeTerreno;
    }
    public void setTipoDeTerreno(String tipoDeTerreno) {
        this.tipoDeTerreno = tipoDeTerreno;
    }

    public Integer getQntRodas() {
        return QntRodas;
    }

    public void setQntRodas(Integer qntRodas) {
        QntRodas = qntRodas;
    }

    
}


