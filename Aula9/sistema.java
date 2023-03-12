public class sistema {
    public static void main (String[] Args) {
        
        // Seta o raio do circulo, e calcula sua area, mostrando na tela.
        Circulo cir = new Circulo();
        cir.setRaio(5);
        float resultCir = cir.calcularArea();
        System.out.println ("Area do circuo: " + resultCir);

        // Seta o lado do quadrado, e calcula sua area, mostrando na tela.
        Quadrado qua = new Quadrado();
        qua.setLado(10);
        float resultQua = qua.calcularArea();
        System.out.println ("Area do quadrado: " + resultQua);

        // Seta a largura e altura do retangulo, e calcular sua area, mostrando na tela.
        Retangulo ret = new Retangulo();
        ret.setAltura(5);
        ret.setLargura(10);
        float resultRet = ret.calcularArea();
        System.out.println ("Area do retangulo: " + resultRet);
    }
}
