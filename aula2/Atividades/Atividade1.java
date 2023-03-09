public class Atividade1 
{
    public static void main (String[] Args)
    {
        String s1 = "IFPR - Campus Foz do Iguaçu - Avenida Araucária, 780, Bairro Vila A - CEP: 85860-000 - Foz do Iguaçu - Paraná - (45)3422-5348";
        int CEPpos = s1.indexOf("CEP:");
        String CEP = s1.substring(CEPpos, CEPpos+14);
        int TELpos = s1.indexOf("(");
        String TEL = s1.substring(TELpos, TELpos+13);
        Integer QuatroN = Integer.parseInt(TEL.substring(9, 13));
        System.out.println (CEP);
        System.out.println ("TELEFONE:" + TEL);
        System.out.println (QuatroN/2);

    }
}
