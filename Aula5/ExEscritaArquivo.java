import java.io.BufferedWriter;
import java.io.FileWriter;

public class ExEscritaArquivo {
    
    public static void main (String[] args) throws Exception {
        String nomeArqSaida = "arqSaida.csv";
        BufferedWriter arqGravacao = new BufferedWriter(new FileWriter(nomeArqSaida));

        String nomeProduto = "Mouse";
        String preco = "123,45";
        String estoque = "44";
        String linha = nomeProduto + ";" + estoque + ";" + preco;
        arqGravacao.write(linha);
        arqGravacao.newLine();

        linha = "Notebook;11;3544,90";
        arqGravacao.write(linha);
        arqGravacao.newLine();

        linha = "cabo USB;77;34,00";
        arqGravacao.write(linha);
        arqGravacao.newLine();
        
        arqGravacao.close();
        }
}
