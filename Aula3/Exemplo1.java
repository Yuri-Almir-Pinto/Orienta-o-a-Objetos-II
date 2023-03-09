public class Exemplo1 
{
    public static void main(String[] args)
    {
        Integer valor1=0, valor2=0, res=0, ope = 0;
        meth matematica = new meth();

        if (args.length < 3)
        {
            System.out.println("O programa precisa de 2 parâmetros.");
            System.exit(0);
        }
        valor1 = Integer.parseInt(ar[0]);
        valor2 = Integer.parseInt(ar[1]);
        ope = Integer.parseInt(ar[2]);

        System.out.println ("Primeiro teste");
        if (ope == 1)
        {
            res = matematica.multiplicar(valor1, valor2);
            System.out.println (valor1 + " * " + valor2 + " = " + res);
        }
        if (ope == 2)
        {
            res = matematica.dividir(valor1, valor2);
            System.out.println (valor1 + " / " + valor2 + " = " + res);
        }
        if (ope == 3)
        {
            res = matematica.somar(valor1, valor2);
            System.out.println (valor1 + " + " + valor2 + " = " + res);
        }
        if (ope == 4)
        {
            res = matematica.subtrair(valor1, valor2);
            System.out.println (valor1 + " - " + valor2 + " = " + res);
        }
        args[0].toLowerCase();
    }
}