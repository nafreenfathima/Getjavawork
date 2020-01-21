	import java.text.ParseException;
		import java.text.SimpleDateFormat;
		import java.util.Date;
		import java.util.Scanner;
		public class Time {
		 public static void main(String[] args) {
		        Scanner sc=new Scanner(System.in);
		     String myTime = new String();
		     myTime=sc.nextLine();
		     SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
		     Date date = null;
		     try {
		         date = sdf.parse(myTime);
		     } catch (ParseException e) {
		         e.printStackTrace();
		     }
		     String formattedTime = sdf.format(date);
		     System.out.println(formattedTime);
		 }
		}

