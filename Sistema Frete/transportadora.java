import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.FileReader;

class transportadora implements importacaoArquivos {
    static BufferedReader re = new BufferedReader(new InputStreamReader(System.in));
    static encoNormais EncoN[] = new encoNormais[1000]; // Declara os vetores da classe
    static encoExpressa EncoE[] = new encoExpressa[1000];

    public static void main (String[] Args) throws Exception {
        transportadora tr = new transportadora();
        configs config;

        EncoE[0] = new encoExpressa(); //Inicializa o primeiro objeto de ambos vetores. Economiza memória... Eu acho.
        EncoN[0] = new encoNormais();

        while (true) { // Carrega as configurações. Se o arquivo não existe, pede para tentar novamente.
            System.out.println("Digite o nome do arquivo de configuracao: ");
            String arqConfig = re.readLine(); // Lê o arquivo de configuração.

            config = tr.carregarConfiguracoes(arqConfig);
            if (config.checkFound() == false) { // Checa se o arquivo existe. Se não, da erro e pede de novo.
                System.out.println ("\n !!! Arquivo nao encontrado. Tente novamente. !!!\n");
            }
            else {
                break;
            }
        }

        tr.menu(config);
        

    }

    public configs carregarConfiguracoes (String arqConfig) throws Exception { // Carrega o arquivo de configuracoes
        configs config = new configs();
        if (checkFile(arqConfig)) {
            BufferedReader arqRe = new BufferedReader(new FileReader(arqConfig));
            String[] lista;
            String linha = arqRe.readLine();

            while(linha != null) { // Lê todas as linhas do arquivo de configuração
                linha = arqRe.readLine();
                if (linha != null) {
                    lista = linha.split(";");

                    if (lista[1].equals("EN")) {
                        config.setEN(Float.parseFloat(lista[2]));
                    } // Guarda o valor da encomenda normal
                    else if (lista[1].equals("EE")) {
                        config.setEE(Float.parseFloat(lista[2]));
                    } // Guarda o valor da encomenda expressa
                }
            }
            arqRe.close();
            return config;
        }
        else {
            config.setAll(-1);
            return config;
        }

        
    }

    public void importarDados (String arqDadosEntrada) throws Exception { // Importa um csv de dados
        if (checkFile(arqDadosEntrada)) {
            BufferedReader arqRe = new BufferedReader(new FileReader(arqDadosEntrada));
            String linha;
            while ((linha = arqRe.readLine()) != null) { // Le a linha cada vez.
                if (linha != null) {
                    String[] split = linha.split(";");
                    if (split[2] != null && split[2].equals("EN")) { // Se for encomenda normal, adiciona apenas os seguinte parâmetros:
                        EncoN[encoNormais.atual] = new encoNormais();
                        EncoN[encoNormais.atual].setInfo(Integer.parseInt(split[0]), //nroPedido
                                                         split[1], // dataPostagem
                                                         Float.parseFloat(split[4])); // Peso
                    }
                    else if (split[2] != null && split[2].equals("EE")) { // Se for encomenda Expressa, adiciona apenas os seguintes parâmetros:
                        EncoE[encoExpressa.atual] = new encoExpressa();
                        EncoE[encoExpressa.atual].setInfo(Integer.parseInt(split[0]), // nroPedido
                                                         split[1], // dataPostagem
                                                         Float.parseFloat(split[4]), // Peso
                                                         Integer.parseInt(split[3]), // prazoEntrega
                                                         split[5]); // foneContato
                    }
                } 
                }

            arqRe.close();
        }
        else {
            System.out.println("\n!!! Arquivo nao encontrado, tente novamente !!! \n");
        }
    }

    public boolean checkFile (String arquivo) throws Exception { // Verifica se dado arquivo existe
        try {
            BufferedReader arqRe = new BufferedReader(new FileReader(arquivo));
            arqRe.close();
            return true;
        } catch (FileNotFoundException teste) { // Se o arquivo não existir, a função trata a exceção
            return false;
        }
    }

    public void printEN (configs config) { // Printa todas as encomendas normais
        System.out.print("\n");
        for (int i=0;i<encoNormais.atual;i++) {
            //System.out.println("\n--- Encomenda " + (i+1) + " ---\n");
            System.out.print("Num.Pedido - " + EncoN[i].getNroPedido() + " | ");
            System.out.print("Peso - " + EncoN[i].getPeso() + " Kg | ");
            System.out.print("Valor do Frete - R$ " + String.format("%.2f", EncoN[i].calcularValorFrete(config.getEN())) + "\n");
        }


    }

    public void printEE (configs config) { // Printa todas as encomendas expressas
        System.out.print("\n");
        for (int i=0;i<encoExpressa.atual;i++) {
            //System.out.print("\n--- Encomenda " + (i+1) + " ---\n");
            System.out.print("Num.Pedido - " + EncoE[i].getNroPedido() + " | ");
            System.out.print("Peso - " + EncoE[i].getPeso() + " Kg | ");
            System.out.print("Valor do Frete - R$  " + String.format("%.2f", EncoE[i].calcularValorFrete(config.getEN())) + "\n");
        }
        
    }

    public void menu (configs config) throws Exception { // Mostra o menu para o usuário
        int sel = 0;
        while (sel != 4) { // Menuzin
            System.out.println("\nSelecione uma opcao -\n");
            System.out.println("1 - Importar arquivo de encomendas");
            System.out.println("2 - Exibir a lista de encomendas Normais");
            System.out.println("3 - Exibir a lista de encomendas Expressas");
            System.out.println("4 - Sair");
            sel = Integer.parseInt(re.readLine());
            switch(sel) { // Opção para importar algum arquivo de encomenda.
                case 1:
                    System.out.println ("\nDigite o nome do arquivo: ");
                    importarDados(re.readLine());
                    break;
                case 2: // Mostra encomendas normais
                        printEN(config);
                    break;
                case 3: // Mostra encomendas expressas
                        printEE(config);
                    break;
                case 4: // Opção para sair do programa
                    break;
                default:
                    System.out.println("\nOpcao invalida, tente novamente.\n");
                    break;
            }
        }
    }
}