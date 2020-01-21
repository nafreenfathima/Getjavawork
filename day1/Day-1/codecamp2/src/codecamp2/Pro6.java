package codecamp2;
import java.util.Scanner;
public class Pro6 {
	

	
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
	        System.out.println("Number of Weeks :"+week);
	        day = i;
	        System.out.println("Number of days :"+day);
	    }
	}



