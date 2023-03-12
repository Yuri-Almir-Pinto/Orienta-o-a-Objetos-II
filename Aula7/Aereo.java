public class Aereo extends Veiculos {
    private Integer alturaMax;

    public Aereo() throws Exception {
        System.out.println ("Agora, digite a altura maxima que seu veiculo pode atingir: ");
        this.setAlturaMax(Integer.parseInt(re.readLine()));
    }

    public Integer getAlturaMax() {
        return alturaMax;
    }

    public void setAlturaMax(Integer alturaMax) {
        this.alturaMax = alturaMax;
    }


    
}
