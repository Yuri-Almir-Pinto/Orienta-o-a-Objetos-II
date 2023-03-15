import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sistema {
    BufferedReader reader;
    private Companhia co;
    public static void main (String[] args) throws Exception {
        Sistema sis = new Sistema();
        sis.reader = new BufferedReader(new InputStreamReader(System.in));
        sis.co = new Companhia();
        System.out.println ("Bem vindo ao sistema de voo. Cadastre sua empresa: \n");
        System.out.println ("Nome: ");
        sis.co.setNomeCompanhia(sis.reader.readLine());
        System.out.println ("Id: ");
        sis.co.setIdCompanhia(Integer.parseInt(sis.reader.readLine()));
        sis.menu();

    }

    public void menu () throws Exception {
        Integer sel = 0;
        System.out.println ("Açoes: \n");
        while (sel != 4)
        {

            System.out.println ("1 - Cadastrar Voo\n");
            System.out.println ("2 - Listar Voo\n");
            System.out.println ("3 - Consultar Voo\n");
            System.out.println ("4 - Sair\n");
            sel = Integer.parseInt(this.reader.readLine());
            switch (sel)
            {
                case 1:
                    this.cadastrarVoo();
                    break;
                case 2:
                    listaVoos();
                    break;
                case 3:
                    consultarVoos();
                    break;
                case 4:
                    break;
            };
                
        }
    }

    public void cadastrarVoo () throws Exception {
        Voo vo = new Voo();
        System.out.println ("--- Cadastro de Voo ---");
        System.out.println ("Data de saída: ");
        vo.setDataSaida(this.reader.readLine());
        System.out.println ("Data de Chegada: ");
        vo.setDataChegada(this.reader.readLine());

        Passageiro p = new Passageiro();
        String input;
        for (int i = 0 ; i < 40 ; i++){
            System.out.println ("Nome Passageiro (Deixe vazio para sair): ");
            input = this.reader.readLine();
            if (input.equals(""))
                break;
            p.setNome(input);
            System.out.println ("Idade Passageiro: ");
            p.setIdade(Integer.parseInt(this.reader.readLine()));
            System.out.println ("CPF Passageiro: ");
            p.setCPF(this.reader.readLine());
            vo.setPassageiro(p);
        }
        this.co.setVoo(vo);
        
    }

    public void listaVoos () throws Exception {
        for (int i = 0 ; i < this.co.getQntVoos() ; i++ ) {
            System.out.println ("\n\n--- VOO " + (i+1) + " ---");
            System.out.println ("Data de saída: " + this.co.getVoos(i).getDataSaida());
            System.out.println ("Data de chegada: " + this.co.getVoos(i).getDataChegada());
            for (int j = 0 ; j < this.co.getVoos(i).getQntPassageiros() ; j++ ) {
                System.out.println ("--- PASSAGEIRO " + (j+1) + " ---");
                System.out.println ("Nome: " + this.co.getVoos(i).getPassageiro(j).getIdade());
                System.out.println ("Idade: " + this.co.getVoos(i).getPassageiro(j).getIdade());
                System.out.println ("CPF: " + this.co.getVoos(i).getPassageiro(j).getCpf());
            }
            System.out.println ("\n----------------");
        }
    }

    public void consultarVoos () throws Exception {
        for (int i = 0 ; i < this.co.getQntVoos() ; i++) {
            System.out.println (" -- Voo " + (i+1) + " -");
        }
        System.out.println ("Selecione o voo para consultar: ");
        int i = Integer.parseInt(this.reader.readLine());
        if (i <= 0 || i > this.co.getQntVoos()) {
            System.out.println ("\nEste voo nao existe.\n");
            return;
        }
        i--;
        System.out.println ("\n\n--- VOO " + (i+1) + " ---");
        System.out.println ("Data de saída: " + this.co.getVoos(i).getDataSaida());
        System.out.println ("Data de chegada: " + this.co.getVoos(i).getDataChegada());
        for (int j = 0 ; j < this.co.getVoos(i).getQntPassageiros() ; j++ ) {
            System.out.println ("--- PASSAGEIRO " + (j+1) + " ---");
            System.out.println ("Nome: " + this.co.getVoos(i).getPassageiro(j).getIdade());
            System.out.println ("Idade: " + this.co.getVoos(i).getPassageiro(j).getIdade());
            System.out.println ("CPF: " + this.co.getVoos(i).getPassageiro(j).getCpf());
        }
        System.out.println ("\n----------------");
        System.out.println ("\nQuantidade de assentos livres: " + this.co.getVoos(i).getAssentosLivres() + "\n");
    }
}