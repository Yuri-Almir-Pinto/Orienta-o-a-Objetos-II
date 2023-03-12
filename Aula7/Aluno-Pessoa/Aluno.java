import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Aluno extends Pessoa {

    private Float nota1;
    private Float nota2;
    private Float nota3;
    private Float nota4;

    public static void main (String[] Args) throws Exception {
        Aluno vithor = new Aluno();
        BufferedReader re = new BufferedReader(new InputStreamReader(System.in));

        System.out.println ("Aluno criado com sucesso!\n");
        System.out.println ("Digite a nota 1: ");
        vithor.setNota1(Float.parseFloat(re.readLine()));
        System.out.println ("Digite a nota 2: ");
        vithor.setNota2(Float.parseFloat(re.readLine()));
        System.out.println ("Digite a nota 3: ");
        vithor.setNota3(Float.parseFloat(re.readLine()));
        System.out.println ("Digite a nota 4: ");
        vithor.setNota4(Float.parseFloat(re.readLine()));

        System.out.println("\n As notas do aluno " + vithor.getNome() + " sao: ");
        System.out.println("Nota 1: " + vithor.getNota1());
        System.out.println("Nota 2: " + vithor.getNota2());
        System.out.println("Nota 3: " + vithor.getNota3());
        System.out.println("Nota 4: " + vithor.getNota4());
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public float getNota4() {
        return nota4;
    }

    public void setNota4(float nota4) {
        this.nota4 = nota4;
    }






}
