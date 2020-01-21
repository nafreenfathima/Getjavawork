

	import java.util.Scanner;
	import java.text.DecimalFormat;
	public class TotalExpensesfortheEvent_basicelements_3 {
	    public static void main(String args[])
	    {
	        double brandingExpenses;
	        double travelExpenses;
	        double foodExpenses;
	        double logisticExpenses;
	        double totalExpenses;
	       
	        Scanner sc=new Scanner(System.in);
	        DecimalFormat df= new DecimalFormat("#.00");
	        DecimalFormat df2=new DecimalFormat("#.00%");
	       
	        System.out.println("Enter branding expenses");
	        brandingExpenses=sc.nextDouble();
	       
	        System.out.println("Enter travel expenses");
	        travelExpenses=sc.nextDouble();
	       
	        System.out.println("Enter food expenses");
	        foodExpenses=sc.nextDouble();
	       
	        System.out.println("Enter logistics expenses");
	        logisticExpenses=sc.nextDouble();
	       
	         totalExpenses=brandingExpenses +travelExpenses +foodExpenses + logisticExpenses;
	         System.out.println("Total expenses : Rs." +df.format(totalExpenses));
	        
	         brandingExpenses=(brandingExpenses)/totalExpenses;
	         System.out.println("Branding expenses percentage : " +df2.format(brandingExpenses));
	        
	        
	         travelExpenses=(travelExpenses)/totalExpenses;
	         System.out.println("Travel expenses percentage : " +df2.format(travelExpenses));
	        
	        
	         foodExpenses=(foodExpenses)/totalExpenses;
	         System.out.println("Food expenses percentage : "  +df2.format(foodExpenses));
	        
	         logisticExpenses=(logisticExpenses)/totalExpenses;
	         System.out.println("Logistics expenses percentage : " +df2.format(logisticExpenses));
	       
	    }
	}

