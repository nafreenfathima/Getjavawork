import java.util.*;
import java.text.*;
import java.io.*;
public class First{
	public static void main(String args[])throws Exception
	
	    {
	
         Scanner sc=new Scanner(System.in);

         String j,k,l,x,y,z;
    System.out.println("Enter Date1");
	System.out.println("Enter day");
	
	     j=sc.nextLine();
	
	      int a=Integer.parseInt(j);

	      System.out.println("Enter month");

	      k=sc.nextLine();
	
	      int b=Integer.parseInt(k);
	
	        System.out.println("Enter year");
	
	        l=sc.nextLine();
	
	        String f=j+" "+k+" "+l;
	
	          System.out.println("Enter Date2");
	
	        System.out.println("Enter day");
	
	        x=sc.nextLine();
	
	        int c=Integer.parseInt(x);
	
	        System.out.println("Enter month");
	
	        y=sc.nextLine();
	
	        int d=Integer.parseInt(y);
	
	        System.out.println("Enter year");
	
	       z=sc.nextLine();
	
	        String g=x+" "+y+" "+z;
	
	       
	
	        SimpleDateFormat myformat=new SimpleDateFormat("dd MM yyyy");
	
	        Date date1=myformat.parse(f);
	
	         Date date2=myformat.parse(g);
	
	         long diff=date2.getTime()-date1.getTime();
	
	         int day=(int)(diff/(3600000*24));
	
	          
	
	         if(a<32&&c<32&&b<13&&d<13)
	
	         {
	
	             if(day==0)
	
	             {
	
	                 System.out.println(day+1+" day");
	
	             }

	             else
	
	             {
	
	                 System.out.println(day+1+" days");

	             }
	
	         }
	
	         else
	
	         {
	
	           System.out.println("Invalid Date");
	
	         }
	
	         
	
	         
	
	   }
	
	}
	
