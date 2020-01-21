	import java.util.Scanner;
	import java.util.StringTokenizer;

	public class RemovingSpace{

	    public static void main(String[] args) {
			
			Scanner s= new Scanner(System.in);
			
			System.out.println("Enter the string");
			String k= s.nextLine();
			
			StringTokenizer k1= new StringTokenizer(k," ");
			StringBuffer sb= new StringBuffer();
			
			while(k1.hasMoreElements())
			{
				sb.append(k1.nextElement()).append(" ");
			} 
			
			k= sb.toString();
			System.out.println("The processed string is "+k);
			
			

		}

	}


