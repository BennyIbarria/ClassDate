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
        System.out.println("Formato de fecha = " + format.format(fecha));

        //Comparando fechas
        //Creamos una nueva instancia de la clase Date
        Date fecha2 = new Date();
        //Imprimimos la fecha 2
        System.out.println("La fecha de hoy es: " + fecha2);

        //Comparamos la fecha capturada por el usuario vs la fecha actual que maneja el sistema
        if(fecha.after(fecha2)){
            System.out.println("Fecha capturada es posterior a la fecha actual");
        } else if (fecha.before(fecha2)){
            System.out.println("Fecha Capturada por el usuario es anterior a la fecha actual");
        } else if (fecha.equals(fecha2)){
            System.out.println("Ambas fechas capturadas son iguales");
        }
        //Podemos comparar tambien con el CompareTo
        //Colocamos una comparación -Si al comparar fecha vs fecha2 obtenemos un remanente, quiere decir que fecha2 es posterior
        if(fecha.compareTo(fecha2)>0){
            System.out.println("Fecha capturada es posterior a la fecha actual");
        //-Si al comparar fecha vs fecha2 No obtenemos entero positivo, quiere decir que fecha2 es anterior a la fecha capturada por el usuario
        } else if (fecha.compareTo(fecha2)<0){
            System.out.println("Fecha capturada es anterior a la fecha actual");
        //-Si es igual a 0, estamos ante una fecha igual.
        } else if (fecha.compareTo(fecha2)==0){
            System.out.println("Ambas fechas son iguales");
        }
    }
}
