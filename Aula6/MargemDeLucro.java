import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class MargemDeLucro {
    public static void main (String[] args) throws Exception{
        BufferedReader bufre = new BufferedReader(new InputStreamReader(System.in));

        System.out.println ("Digite o nome do arquivo de entrada: ");
        String arq = bufre.readLine();
        if (arq.equals(""))
            arq = "custo";
        String arquivoEntrada = arq + ".csv";

        System.out.println ("Digite o nome do arquivo de saida: ");
        arq = bufre.readLine();
        if (arq.equals(""))
            arq = "venda";

        String arquivoSaida = arq + ".csv";
        String arquivoComprar = "comprar.csv";
        String arquivoLeiHTML = "Template.html";
        String arquivoSaiHTML = "VendaHTML.html";

        BufferedReader arqre = new BufferedReader(new FileReader(arquivoEntrada));
        BufferedWriter arqgra = new BufferedWriter(new FileWriter(arquivoSaida));
        BufferedWriter arqComp = new BufferedWriter(new FileWriter(arquivoComprar));
        BufferedReader arqHTMLlei = new BufferedReader(new FileReader(arquivoLeiHTML));
        BufferedWriter arqHTMLgra = new BufferedWriter(new FileWriter(arquivoSaiHTML));

        Float margem;
        System.out.println ("Digite a margem de lucro desejada: ");
        margem = Float.parseFloat(bufre.readLine());

        String leitura = "";
        Boolean init = false;
        String html = "";

        do {

        leitura = arqre.readLine();

        if (leitura == null)
            break;

        String[] linha = leitura.split(";");
        String linhaarq = "";

        if (init == false) {

            linhaarq += "codigo;nome;preco_de_venda";

            arqgra.write(linhaarq);
            arqgra.newLine();

            arqComp.write("codigo;estoque;nome;preco_custo;categoria");
            arqComp.newLine();

            arqHTMLgra.write(arqHTMLlei.readLine());
            html = "";

            init = true;

        }
        else {

            Float preco = Float.parseFloat(linha[3].replace(",", "."));
            preco = preco*((margem/100)+1);
            String arredondado = String.format("%.2f", preco);

            linhaarq = linha[0] + ";" + linha[2] + ";" + arredondado;
            arqgra.write(linhaarq);
            arqgra.newLine();

            Integer verEstoque = Integer.parseInt(linha[1]);

            if (verEstoque < 10) {
                arqComp.write(linha[0] + ";" + linha[1] + ";" + linha[2] + ";" + linha[3] + ";" + linha[4]);
                arqComp.newLine();
            }

            String inserirHTML = "<tr>";
            inserirHTML += "<td>" + linha[0] + "</td><td>" + linha[2] + "</td><td>" + arredondado + "</td>";
            inserirHTML += "<tr>";
            arqHTMLgra.write(inserirHTML);

        }
        } while (leitura != null);

        html += "</table></body></html>";
        
        arqHTMLgra.write(html);
        arqgra.close();
        arqre.close();
        arqComp.close();
        arqHTMLlei.close();
        arqHTMLgra.close();
        
        return;
    }
}