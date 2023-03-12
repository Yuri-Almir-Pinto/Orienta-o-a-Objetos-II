

public class Pessoa {

    private String nome;
    private Integer idade;
    private String email;

    public Pessoa() {
        System.out.println ("Gerando objeto da classe 'Pessoa'...");
        this.nome = "Vithor";
        this.idade = 15;
        this.email = "vithor@gmail.com";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}