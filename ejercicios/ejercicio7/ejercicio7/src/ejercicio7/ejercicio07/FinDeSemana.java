package ejercicioLogica07.ejercicio07;
import java.util.Scanner;

public class FinDeSemana {
	/*● Crear un programa en Java que realice lo siguiente:
		○ Debe solicitar al usuario un día de la semana (de lunes a viernes).
		○ Debe solicitar al usuario una hora (horas y minutos).
		○ Debe calcular cuantos minutos faltan para el fin de semana. Se considera que el fin de semana comienza el
		viernes a las 15:00 hrs.
		○ Debe mostrar el resultado por consola.
		○ Debe ser capaz de identificar si los datos de entrada son válidos (día de la semana válido, hora válida,
		minutos válidos), en caso contrario debe mandar un mensaje de error y volver a solicitar los datos.
		● Prueba tu programa con las siguientes entradas para asegurarte que funcione correctamente:
		○ Entradas: Lunes, 14:30 hrs
		■ lunes
		■ 14
		■ 30
		○ Salida:
		■ Faltan 5730 minutos para el fin de semana*/

	public static void main(String[] args) {
		Scanner sn1 = new Scanner(System.in);
		System.out.println("Ingresa un dia de la semana para saber cuantos minutos faltan para le fin de semana: ");
		String day = sn1.next();
		
		int totalMinutes = 0;
		
		switch (day) {
		case "Sabado":
			day = "1";
			break;
		case "Domingo":
			day = "2";
			break;
		case "Lunes":
			day = "3";
			break;
		case "Martes":
			day = "4";
			break;
		case "Miercoles":
			day = "5";
			break;
		case "Jueves":
			day = "6";
			break;
		case "Viernes":
			day = "7";
			break;
		default:
			day = "8";
			break;
		}
		
		System.out.println("Ingresa una hora en el formato de 24:00 : ");
		int hour = sn1.nextInt();
		
		while (hour < 0) {
			System.out.println("Valor no valido, ingresa un numero de 0-24: ");
			hour = sn1.nextInt();
	}
		System.out.println("Ingresa los minutos en el formato de 0-60");
		int minute = sn1.nextInt();
		
		while (minute < 0) {
			System.out.println("Valor no valido, ingresa un numero de 0-60: ");
			minute = sn1.nextInt();
		}

		int numDay = Integer.parseInt(day);
		System.out.println(numDay);
		
		final int numWeekend = 7;
		final int hourWeekend = 15;
		final int minuteWeekend = 0;
		
		//daysToMinutes
		int days = numDay - numWeekend;
		System.out.println("Los dias que faltan para fin de semana son: " + days);
		int daysToMinutes = days * 24 * 60;
		System.out.println("Esos dias convertidos a minutos son: " + daysToMinutes);
		
		//hoursToMinutes
		int hours = hour - hourWeekend;
		System.out.println("Las horas que faltan para el fin de semana son: " + hours);
		int hoursToMinutes = hours * 60;
		System.out.println("Esas horas convertidas a minutos son: " + hoursToMinutes);
		
		//minutesToMinutes
		int minutes = minute - minuteWeekend;
		System.out.println("Los minutos que faltan para el fin de semana son: " + minutes);
		
		if (numDay < numWeekend) {
			daysToMinutes *= -1;
			System.out.println("El nuevo valor de daysToMinutes: " + daysToMinutes);
			totalMinutes += daysToMinutes;
		}
		if (hour < hourWeekend) {
			hoursToMinutes *= -1;
			System.out.println("El nuevo valor de hoursToMinutes: " + hoursToMinutes);
			totalMinutes += hoursToMinutes;
		}
		else {
			totalMinutes -= hoursToMinutes;
		}
		if (minute < minuteWeekend) {
			minutes *= -1;
			System.out.println("El nuevo valor de minutes: " + minutes);
			totalMinutes += minutes;
		}
		else {
			System.out.println("minutes: " + minutes);
			totalMinutes -= minutes;
		}
		
		System.out.println("El numero total de minutos faltantes para el fin de semana son: " + totalMinutes);
	}
}
