import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class JavaCalendarParseString {
    public static void main(String[] args) throws ParseException {

        //Creamos un objeto de la clase Scanner para capturar por pantalla
        Scanner sc = new Scanner(System.in);

        //Creamos un objeto instancia de la clase SimpleDateFormat para capturar la fecha
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        //Pedimos que el usuario capture la fecha en el formato especifico
        System.out.println("Ingrese una fecha con formato yyyy-MM-dd: ");
        //Parseamos desde el formato SimpleDateFormat a una cadena de caracteres la fecha capturada por el usuario
        Date fecha = format.parse(sc.nextLine());
        //Imprimimos la fecha capturada por el usuario en tipo cadena de texto
        System.out.println("fecha = " + fecha);
        //Imprimimos la fecha capturada por el usuario en formato SimpleDateFormat
        System.out.println("format = " + format.format(fecha));
    }
}
