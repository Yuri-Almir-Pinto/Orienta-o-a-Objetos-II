public class ExemploString 
{
    
    public static void main (String[] args)
    {
        String str1, str2, str3;
        str1 = "Um texto qualquer...     ";
        System.out.println ("[" + str1 + "]");
        str1 = str1.trim();
        System.out.println ("[" + str1 + "]");
        str1 = "yurialmirp@gmail.com";
        int pos = str1.indexOf("@");
        System.out.println ("O @ esta na posicao " + pos);
        System.out.println ("O servidor e: " + str1.substring(pos+1, str1.length()));
    }
}
