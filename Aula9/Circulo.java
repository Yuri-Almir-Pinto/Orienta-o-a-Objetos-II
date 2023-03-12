public class Circulo implements formaGeometrica {
    float raio;

    public float calcularArea() {
        float resultado = (float) ((raio*raio)*3.14);
        return resultado;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
}
