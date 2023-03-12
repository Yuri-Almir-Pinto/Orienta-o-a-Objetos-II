public class Helicoptero extends Aereo {
    private boolean armado;
    private boolean militar;

    public Helicoptero() throws Exception {

        System.out.println ("Digite se seu helicoptero eh armado: ");
        this.setArmado(setBool());
        System.out.println ("Digite se seu helicoptero eh militar: ");
        this.setMilitar(setBool());
    }

    public boolean isArmado() {
        return armado;
    }
    public void setArmado(boolean armado) {
        this.armado = armado;
    }
    public boolean isMilitar() {
        return militar;
    }
    public void setMilitar(boolean militar) {
        this.militar = militar;
    }

    
}
