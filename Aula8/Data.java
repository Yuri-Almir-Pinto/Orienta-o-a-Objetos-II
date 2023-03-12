import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

public class Data {

    public static void main (String[] Args) {
        Date data = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        DateFormat df = DateFormat.getDateInstance (DateFormat.LONG);

        System.out.println(df.format(data));
    }
}