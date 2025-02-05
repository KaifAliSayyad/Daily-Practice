/*
import java.util.*;

public class DateAndTimeDemo{
	public static void main(String[] args){
		Date d1 = new Date();
		System.out.println(d1);
		d1.setMonth(5);
		System.out.println(d1);
	}	
}

*/
import java.time.*;
import java.util.*;
import static java.time.Month.*;
public class DateAndTimeDemo{
	public static void main(String[] args){
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt);

		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);

		System.out.println(ld.withMonth(Month.MARCH.getValue()));

		LocalDate d2 = LocalDate.of(1983, SEPTEMBER, 17);
		System.out.println(d2);

		//For time-zones
		LocalTime t1 = LocalTime.now(ZoneId.of("SystemV/PST8PDT"));
		System.out.println(t1);

		Set s = ZoneId.getAvailableZoneIds();
		s.forEach(System.out::println);
		
	}	
}