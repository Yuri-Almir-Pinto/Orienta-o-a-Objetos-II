public class DuasRodas extends Terrestre {
    private boolean motorizado;

    public DuasRodas() throws Exception {

        System.out.println ("Seu veiculo eh motorizado: ");
        this.setMotorizado(setBool());
    }

    public boolean isMotorizado() {
        return motorizado;
    }

    public void setMotorizado(boolean motorizado) {
        this.motorizado = motorizado;

    }


    
}
