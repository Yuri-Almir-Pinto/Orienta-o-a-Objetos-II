public class Caminhao extends QuatroRodas {
    private Integer capacidadeMax;

    public Caminhao() throws Exception {
        System.out.println ("Digite a capacidade maxima do seu caminhao: ");
        this.setCapacidadeMax(Integer.parseInt(re.readLine()));
    }

    public Integer getCapacidadeMax() {
        return capacidadeMax;
    }

    public void setCapacidadeMax(Integer capacidadeMax) {
        this.capacidadeMax = capacidadeMax;
    }

    
}
