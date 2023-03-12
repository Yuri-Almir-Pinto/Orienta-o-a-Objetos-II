public class Retangulo implements formaGeometrica {
    float altura;
    float largura;

    public float calcularArea () {
        float resultado = largura*altura;
        return resultado;
    }

    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getLargura() {
        return largura;
    }
    public void setLargura(float largura) {
        this.largura = largura;
    }

    
}
