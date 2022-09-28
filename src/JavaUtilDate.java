import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaUtilDate {
    public static void main(String[] args) {

        //Creamos una instancia/objeto del tipo Date
        Date fecha = new Date();

        //Impresion de la fecha igual
        System.out.println("fecha = " + fecha);

        //Creamos la fecha con la clase SimpleDateFormat
        SimpleDateFormat df = new SimpleDateFormat("dd MMMM, yyyy");
        //Asignamos a una variable la nueva instancia
        String fechaStr = df.format(fecha);
        System.out.println("La fecha con ese formato es = " + fechaStr);

        long j=0;
        for (int i=0; i<1000000;i++){
            j+=i;
        }
        System.out.println("j = " + j);

        Date fecha2 = new Date();
        long tiempoFinal=fecha2.getTime()-fecha.getTime();

        System.out.println("Tiempo transcurrido en el for: " + tiempoFinal);

        //Le damos un tipo de formato a la fecha con la clase SimpleDateFormat
        SimpleDateFormat df1 = new SimpleDateFormat("dd-MMMM-yyyy");
        //Asignamos a una variable la nueva instancia
        String fechaStr1 = df1.format(fecha);
        System.out.println("La fecha con ese formato es = " + fechaStr1);

        //Le damos un tipo de formato a la fecha con la clase SimpleDateFormat
        SimpleDateFormat df2 = new SimpleDateFormat("dd MMM, yyyy");
        //Asignamos a una variable la nueva instancia
        String fechaStr2 = df2.format(fecha);
        System.out.println("La fecha con ese formato es = " + fechaStr2);

        //Le damos un tipo de formato a la fecha con la clase SimpleDateFormat
        SimpleDateFormat df3 = new SimpleDateFormat("'Dia' EEEE, dd 'Mes' MMMM, 'Año' yyyy");
        //Asignamos a una variable la nueva instancia
        String fechaStr3 = df3.format(fecha);
        System.out.println("La fecha con ese formato es = " + fechaStr3);

    }
}
