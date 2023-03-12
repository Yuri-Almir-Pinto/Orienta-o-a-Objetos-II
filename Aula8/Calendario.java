import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Calendario {
    
    public static void main (String[] Args) {

        DateFormat df = DateFormat.getDateInstance (DateFormat.MEDIUM);
        GregorianCalendar gr = new GregorianCalendar();
        System.out.println ("Data: " + gr.get(Calendar.YEAR) + "/" + (1 + gr.get(Calendar.MONTH)) + "/" + gr.get(Calendar.DAY_OF_MONTH));

        System.out.println ("Teste: " + gr.get(Calendar.MILLISECOND));

        GregorianCalendar date = new GregorianCalendar();
        date.set(Calendar.YEAR, 2023);
        date.set(Calendar.MONTH, Calendar.MAY);
        date.set(Calendar.DAY_OF_MONTH, 1);
        System.out.println(df.format(date.getTime()));

        LocalDateTime dataTempo = LocalDateTime.now();
        System.out.println (dataTempo);

        LocalDate data = LocalDate.now();
        System.out.println (data);

        LocalTime tempo = LocalTime.now();
        System.out.println (tempo);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String dataFormatada = dataTempo.format(formato);
        System.out.println (dataFormatada);

        LocalDate hoje = LocalDate.now();
        LocalDate amanha = hoje.plusDays(1);
        System.out.println("Hoje: " + hoje + " | Amanha: " + amanha);

    }


}
