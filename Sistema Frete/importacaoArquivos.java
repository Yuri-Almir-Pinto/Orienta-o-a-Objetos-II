public interface importacaoArquivos {
    public configs carregarConfiguracoes(String arqConfig) throws Exception;
    // Carrega as configurações do arquivo de configurações;
    public void importarDados(String arqDadosEntrada) throws Exception;
    // Carrega a lista de encomendas em um vetor.
}
