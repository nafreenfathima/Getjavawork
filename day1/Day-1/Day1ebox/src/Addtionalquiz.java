import java.util.Scanner;
import java.time.LocalDate;
public class Addtionalquiz {
	public static void main(String args[]) {

		String year;
	Scanner sc=new Scanner(System.in);
	year=sc.nextLine();
	LocalDate ld=LocalDate.of(Integer.parseInt(year),1,1);
	String dayOfWeek=new String(ld.getDayOfWeek().toString().toLowerCase());
	dayOfWeek=dayOfWeek.replace(dayOfWeek.charAt(0),Character.toTitleCase(dayOfWeek.charAt(0)));
	
	System.out.println(dayOfWeek);
	}
	}
