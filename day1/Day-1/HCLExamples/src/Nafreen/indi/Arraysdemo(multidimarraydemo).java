package myarrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException; 
public class Arraysdemo {
	
	    static String emp_name[]= {"Siva","Ram","Prasad"};
		static float emp_sal[]= {27500.00f,312850.00f,15780.00f};
		static int emp_age[];
		
			 
			
			public static void main(String args[])throws IOException{
				emp_age=new int[3];
			Arraysdemo ad=new Arraysdemo();
			//To accept data into age array, we need to create input stream reader object
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			for(int i=0;i<emp_age.length;i++)
			{
				System.out.println("Enter age of"+emp_name[i]+":");
				emp_age[i]=Integer.parseInt(br.readLine());
			}
			
			//call display method to display arrays data
			
			display();
	}//end of main method or thread
			public static void display()
			{
				System.out.println("Employee names:");
				for(String ename:emp_name)
			System.out.println(ename);
	
			
	System.out.println("Employee salaries:");
		for(float esalary:emp_sal)
		{
			System.out.println(esalary);	
		}
		System.out.println("Employee ages:");	
		for(int eage : emp_age)
		{
			System.out.println(eage);
		}

}
}