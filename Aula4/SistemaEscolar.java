import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SistemaEscolar {
    private Escola e1;
    BufferedReader reader;
    public static void main(String[] args) throws Exception{
        SistemaEscolar se = new SistemaEscolar();
        se.e1 = new Escola();
        se.reader = new BufferedReader(
            new InputStreamReader(System.in));
        
        System.out.println("Informe o nome da escola:");
        se.e1.setNome(se.reader.readLine());
        System.out.println("Telefone:");
        se.e1.setFone(se.reader.readLine());
        se.menu();
    }

    public void menu() throws Exception{
        String opcao = "";
        while(!opcao.equals("4")){
            System.out.println("---------------");
            System.out.println("[1] Cadastrar nova turma");
            System.out.println("[2] Listar as turmas existentes");
            System.out.println("[3] Consultar turma");
            System.out.println("[4] Sair");

            opcao = this.reader.readLine();
            switch (opcao) {
                case "1":
                    this.cadastrarTurma();
                    break;
                case "2":
                    this.listarTurmas();
                    break;
                default:
                    break;
            }
        }
    }

    public void cadastrarTurma() throws Exception{
        Turma t = new Turma();
        System.out.println("[Cadastro de turma]");
        System.out.println("Informe o número da turma:");
        t.setNumeroTurma(Integer.parseInt(
            this.reader.readLine()));

        System.out.println("Nome do curso:");
        t.setNomeCurso(this.reader.readLine());

        System.out.println("Ano:");
        t.setAno(Integer.parseInt(
            this.reader.readLine()));

        System.out.println("-----Alunos-----");
        for (int i = 0; i < 40; i++) {
            System.out.println("\nNome do aluno: (vazio para sair)");
            String nome = this.reader.readLine();
            if(nome.equals("")){
                break;
            }
            Aluno aluno = new Aluno();
            aluno.setNome(nome);

            System.out.println("Matrícula:");
            aluno.setMatricula(this.reader.readLine());

            System.out.println("Nota 1:");
            aluno.setNota1(Float.parseFloat(
                this.reader.readLine()));

            System.out.println("Nota 2:");
            aluno.setNota2(Float.parseFloat(
                this.reader.readLine()));

            System.out.println("Nota 3:");
            aluno.setNota3(Float.parseFloat(
                this.reader.readLine()));

            System.out.println("Nota 4:");
            aluno.setNota4(Float.parseFloat(
                this.reader.readLine()));
            
            t.setAluno(aluno);
        }
        this.e1.setTurma(t);
    }

    public void listarTurmas () throws Exception {
        try {
            System.out.println ("\n-----------------");
            System.out.println ("Relatório de Turmas");
            for (int i = 0 ; i < this.e1.getQtdeTurmas() ; i++)
            {
                String result = "";
                System.out.println("Numero: " + this.e1.getTurma(i).getNumeroTurma());
                System.out.println("Nome do Curso: " + this.e1.getTurma(i).getNomeCurso());
                System.out.println("Ano: " + this.e1.getTurma(i).getAno());
                for (int i2 = 0 ; i2 < this.e1.getTurma(i).getQtdeAlunos() ; i2++ ) 
                {
                    result = result + this.e1.getTurma(i).getAluno(i2).getNome();
                    if (i2 < this.e1.getTurma(i).getQtdeAlunos()-1)
                        result += ", ";
                    else
                        result += ".";
                }
                System.out.println("Alunos: " + result);
                System.out.println("Quantidade de alunos total: " + this.e1.getTurma(i).getQtdeAlunos());
                if (this.e1.getQtdeTurmas() > 1 && i != this.e1.getQtdeTurmas()-1)
                    System.out.println ("-----------------");
            }
        } catch(Exception e1){
            System.out.println("Formato invalido.");
        }
    }
    
}
