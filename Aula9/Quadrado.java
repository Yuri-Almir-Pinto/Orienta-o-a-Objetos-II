public class Quadrado implements formaGeometrica {
    float lado;

    public float calcularArea () {
        float resultado = lado*lado;
        return resultado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    
}
