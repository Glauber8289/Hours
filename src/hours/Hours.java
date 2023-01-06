package hours;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;

public class Hours {

	public static void main(String[] args) {
		// Especificando  uma data

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		java.util.Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println(sdf.format(d));
		
		//Acrescentando horas na data informada
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d= cal.getTime();
		System.out.println(sdf.format(d));
		
		//obtendo uma unidade de tempo
		int minutes = cal.get(Calendar.MINUTE);
		System.out.println("Minutos: " + minutes);
		int month = 1+ cal.get(Calendar.MONTH);
		System.out.println("Mês " + month);
	}

}
