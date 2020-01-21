package numbers;


	import java.util.Scanner;
	import java.util.Date;
	import java.text.SimpleDateFormat;
	import java.util.GregorianCalendar;
	public class Date_time 
	{
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
		
			System.out.println("Enter day(1-31)");
			int day=sc.nextInt();
			System.out.println("Enter month");
			int month=sc.nextInt()-1;
			System.out.println("Enter year");
			int year=sc.nextInt();	
		
			Date date = (new GregorianCalendar(year,month,day)).getTime();
			SimpleDateFormat sm = new SimpleDateFormat("E");
			
			String d=sm.format(date);
		
			if(d.equals("Mon"))
			{
				System.out.println("White");	
			}
			else if (d.equals("Tue"))
			{
				System.out.println("Red");	
			}
			else if (d.equals("Wed"))
			{
				System.out.println("Green");	
			}
			else if (d.equals("Thur"))
			{
				System.out.println("Yellow");	
			}
			else if (d.equals("Fri"))
			{
				System.out.println("Pink");	
			}
			else
				System.out.println("Sat and Sun are not accepted");
		}

	}


