import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JavaUtilCalendarExample {
    public static void main(String[] args) {

        //Creamos e invocamos la instancia getCalendar, no se utiliza new porque Calendar es una clase abstracta
        Calendar calendario = Calendar.getInstance();

        //establecemos una fecha de forma estatica y de forma completa
        calendario.set(2022, Calendar.SEPTEMBER,27, 05,28,00);

        //Lo podemos hacer parte por parte, asignamos año
        calendario.set(Calendar.YEAR,2022);

        //Asignamos el mes
        calendario.set(Calendar.MONTH, Calendar.SEPTEMBER);

        //Asignamos el día
        calendario.set(Calendar.DAY_OF_MONTH, 28);

        //Asignamos la hora del día en formato 12 hrs
        calendario.set(Calendar.HOUR_OF_DAY, 6);

        //Asignar la hora en formato de 24hrs
        calendario.set(Calendar.HOUR, 7);

        //Indicamos si es Am o Pm con las instancias AM_PM
        calendario.set(Calendar.AM_PM, Calendar.PM);

        //Asignamos los minutos
        calendario.set(Calendar.MINUTE,20);

        //Asignamos segundos
        calendario.set(Calendar.SECOND,32);

        //Asignamos Milisegundos
        calendario.set(Calendar.MILLISECOND, 140);

        Date fecha = calendario.getTime();
        System.out.println("Fecha sin formato = " + fecha);

        //Modificamos el formato con la clase SimpleDateFormat, colocamos los atributos como deseemos que aparezcan
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS a");
        String fechaFormateada= formato.format(fecha);
        System.out.println("fecha con formato = " + fechaFormateada);

    }
}
