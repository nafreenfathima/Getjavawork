import java.util.Scanner;
import java.util.StringTokenizer;

	public class StringTokinizer{

	    public static void main(String[] args) {
			
	        Scanner s= new Scanner(System.in);
			
			//System.out.println("Enter the string");
	        String x= s.nextLine();
			
			StringTokenizer x1= new StringTokenizer(x,"=");
			StringBuffer sb= new StringBuffer();
			
			String a=null;
			
			while(x1.hasMoreElements())
			{
				sb.append(x1.nextElement()).append(" ");
			} 
			
			a= sb.toString();
			StringTokenizer x2= new StringTokenizer(a,";");
			StringBuffer sb2= new StringBuffer();
			
			while(x2.hasMoreElements())
			{
				sb2.append(x2.nextElement()).append("\n");
			} 
			
			x= sb2.toString();
			
			//System.out.println("Sample output");
			System.out.println(x);

		}

	}



