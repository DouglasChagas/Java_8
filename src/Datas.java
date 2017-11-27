import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Datas {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		
		System.out.println(hoje);

		LocalDate futuro = LocalDate.of(2099, Month.JANUARY, 25);
		System.out.println(futuro);
		
		Period diferenca = Period.between(hoje, futuro);
		
		System.out.println(diferenca);
		
		long p2 = ChronoUnit.DAYS.between(hoje, futuro);
		
		System.out.println(p2);
		
		DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println(hoje.format(formater));
	}

}
