package ProyectoHomeBanking;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Time {

    Calendar fecha = new GregorianCalendar();
    String mess = "30";
    String año = Integer.toString(fecha.get(Calendar.YEAR));
    String mes = Integer.toString(1 + fecha.get(Calendar.MONTH));
    String dia = Integer.toString(fecha.get(Calendar.DATE));

    String fechacomp = dia + "-" + mes + "-" + año;

    String hora = Integer.toString(fecha.get(Calendar.HOUR_OF_DAY));
    String minuto = Integer.toString(fecha.get(Calendar.MINUTE));
    String segundos = Integer.toString(fecha.get(Calendar.SECOND));

    String horacomp = hora + ":" + minuto;

    String fechahora = año + "-" + mes + "-" + dia + " " + hora + ":" + minuto + ":" + segundos;
    String fechahora2 = dia + "-" + mes + "-" + año + " / " + hora + ":" + minuto;

}
