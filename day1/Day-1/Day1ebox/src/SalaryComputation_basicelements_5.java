

	import java.util.Scanner;
	import java.text.DecimalFormat;
	public class SalaryComputation_basicelements_5 {
	
	    public static void main(String args[])
	    {
	        DecimalFormat df=new DecimalFormat("#.00");
	        int basicSalary=0;
	        double grossSalary=0.0, HRA=0.0,DA=0.0;
	        Scanner sc=new Scanner(System.in);
	       
	       
	        basicSalary= sc.nextInt();
	       
	       
	        if(basicSalary<15000)
	        {
	            HRA=(0.15f*basicSalary);
	            DA=(0.9f*basicSalary);
	            grossSalary=(basicSalary+HRA+DA);
	            System.out.println(df.format(grossSalary));
	           
	        }
	        else
	        {
	            HRA=5000;
	            DA=0.98f*basicSalary;
	            grossSalary=basicSalary+HRA+DA;
	            System.out.println(df.format(grossSalary));
	           
	        }
	       
	       
	    }
	}


