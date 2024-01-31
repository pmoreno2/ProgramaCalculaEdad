package Edad;

//import java.time.LocalDate;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import java.util.Scanner;

public class ProgramaCalculaEdad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduzca la fecha de nacimiento (DD/MM/AAAA):");
		Scanner ingreso = new Scanner (System.in);
		String fecha = ingreso.nextLine();
		
		try {
			DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			
			LocalDate fechaNac = LocalDate.parse(fecha , formatoFecha);
			LocalDate fechaAct= LocalDate.now();
			Period periodo = Period.between(fechaNac, fechaAct);
			
			int anios = periodo.getYears();
			String aniostxt = String.valueOf(periodo.getYears());
			
			String msg = String.format("La edad tuya es de: %s años, %s meses y %s dias",
					String.valueOf(periodo.getYears()),
					String.valueOf(periodo.getMonths()),
					String.valueOf(periodo.getDays()));
			System.out.println(msg);
		
		}catch(Exception e){
			System.out.println("La fecha ingresada no tiene el formato dd/mm/aaaa");
		}
	}

}