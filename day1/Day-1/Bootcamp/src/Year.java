import java.util.Scanner;
	public class Year {
	
	    public static void main(String args[])
	    {
	        int i, year, week, day;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Number of days:");
	        i = s.nextInt();
	        year = i / 365;
	        i = i % 365;
	        System.out.println("Number of years:"+year);
	        week = i / 7;
	        i = i % 7;
	        System.out.println("Number of extra weeks other than weeks in a year:"+week);
	        day = i;
	        System.out.println("Number of extra days other than days in a year:"+day);
	    }
	}

