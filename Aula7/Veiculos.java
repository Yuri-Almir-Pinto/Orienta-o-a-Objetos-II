import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Veiculos {
    private String nome;
    private String marca;
    private Integer velMax;

    BufferedReader re = new BufferedReader(new InputStreamReader(System.in));
    

    public Veiculos() throws Exception {
        
        System.out.println ("Digite o nome do seu veiculo: ");
        this.setNome(re.readLine());
        System.out.println ("Digite o nome da marca do seu veículo: ");
        this.setMarca(re.readLine());
        System.out.println ("Digite a velocidade maxima do seu veiculo: ");
        this.setVelMax(Integer.parseInt(re.readLine()));
        System.out.println ("Parabens! A base do seu veiculo foi criada com sucesso!");
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getVelMax() {
        return velMax;
    }

    public void setVelMax(Integer velMax) {
        this.velMax = velMax;
    }
    
    public boolean setBool () throws Exception {

        System.out.println ("1 - Sim \n2 - Nao");
        Integer res = 0;
        boolean retorno = false;

        while (res != 1 || res != 2){

            res = Integer.parseInt(re.readLine());

            if (res == 1)
                retorno = true;
            else
                System.out.println ("Valor inputado incorreto!");
        }

        return retorno;
    }


    
}
