package com.ss.mar;
import java.time.*;

public class DateTime {

	public static void main(String[] args) {
		//------ 1 -------
		//I would store it using the LocalDate class
		LocalDate localDate = LocalDate.of(1995, 11, 13);
		localDate.atTime(7, 45, 54, 64);
		
		
		//------ 2 -------
		//Find the the date of the previous Thursday
		LocalDate randomDate = LocalDate.of(2004, 3, 15);
		
		int i = 0;
		while(randomDate.minusDays(i).getDayOfWeek() != DayOfWeek.THURSDAY) {
			i++;
		}
		LocalDate lastThursday = randomDate.minusDays(i);
		System.out.println(lastThursday);
		
		
		//------ 3 -------
		//A ZoneOffset refers to a timezone's difference from UTC time
		//a ZoneId is a unique ID for each timezone which contains rules for converting to and from that timezone
		
		
		//------ 4 -------
		//Instant to ZonedDateTime
		Instant current = Instant.now();
		ZonedDateTime zonedCurrent = ZonedDateTime.ofInstant(current, ZoneId.of("Asia/Tokyo"));
		System.out.println(current);
		System.out.println(zonedCurrent);
		//ZonedDateTime to Instant
		Instant fromZoned = zonedCurrent.toInstant();
		System.out.println(fromZoned);
		
		//------ 5 -------
		int year = 2008;
		YearMonth yearMonth = YearMonth.of(year, 1);
		for(int j = 0; j <12; j++) {
			YearMonth next = yearMonth.plusMonths(j);
			System.out.println("Length of " + next.getMonth() +
								" in " + next.getYear() + " = " + next.lengthOfMonth());
		}
		
		//------ 6 -------
		int month = 5;
		LocalDate date = LocalDate.of(2021, month, 1);
		System.out.println("Mondays in " + date.getMonth());
		for(int j = 0; j<yearMonth.getMonth().length(false); j++){
			LocalDate next = date.plusDays(j);
			if(next.getDayOfWeek() == DayOfWeek.MONDAY ) {
				System.out.println(next);
			}
		}
		
		
		//------ 7 -------
		DateTime dt = new DateTime();

		System.out.println(dt.isFridayThirteenth(LocalDate.of(2021, 3, 13)));
		System.out.println(dt.isFridayThirteenth(LocalDate.of(2020, 11, 13)));
	}
	
	public boolean isFridayThirteenth(LocalDate date) {
		
		return date.getDayOfWeek() == DayOfWeek.FRIDAY && date.getDayOfMonth() == 13;
		
	}
	
}
