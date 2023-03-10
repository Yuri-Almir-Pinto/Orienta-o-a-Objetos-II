import java.io.BufferedWriter;
import java.io.FileWriter;

public class htmlHex {
    
    public static void main (String[] args) throws Exception {
        String nomeArqSaida = "hexHtml.html";
        BufferedWriter arqGravacao = new BufferedWriter(new FileWriter(nomeArqSaida));

        String html = "<html><head><title>Tabela de Cores HTML</title><meta http-equiv='Content-Type' content='text/html; charset=UTF-8'></head><body><p>&nbsp;</p><h2 align='center'>Tabela de Cores HTML</h2> <table width='400' align='center' border='1'><tr><th width='200' align='center'>Cor</th><th width='200' align='center'>Código Hexadecimal</th></tr>";

        arqGravacao.write(html);

        String hex = "";
        for (int i = 0 ; i < 16 ; i++)
        {
            for (int j = 0 ; j < 16 ; j++)
            {
                for (int k = 0 ; k < 16 ; k++)
                {
                    String numk = Integer.toHexString(k);
                    String numj = Integer.toHexString(j);
                    String numi = Integer.toHexString(i);
                    hex = "#" + numi + "0" + numj + "0" + numk + "0";
                    arqGravacao.write("<tr> <td bgcolor='" + hex + "'><t/td><td align='center'>" + hex + "</td></tr>");
                }

            }

        }

        arqGravacao.write(html);
        arqGravacao.close();
        return;
    }
}
