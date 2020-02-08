package Task_27_8_19;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeConvertor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDateTime ldt = LocalDateTime.parse("1997-10-25 10:10", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
		System.out.println(ldt);
		System.out.println("hello from feature-mam");
		System.out.println("hello from git terminal");
		System.out.println("hello from git terminal-2");
		
	}

}
