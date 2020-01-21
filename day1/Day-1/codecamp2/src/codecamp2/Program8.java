package codecamp2;
import java.util.Scanner;
public class Program8 {
	
	
	   public static void main(String args[])
	   {
	       int small, size, i;
	       int arr[] = new int[10];
	       Scanner scan = new Scanner(System.in);
		   
	      
	       System.out.print("Enter Array Elements : ");
	       for(i=0; i<10; i++)
	       {
	           arr[i] = scan.nextInt();
	       }
		  
	       small = arr[0];
		   
	       for(i=0; i<10; i++)
	       {
	           if(small > arr[i])
	           {
	               small = arr[i];
	           }
	           
	       }
		   
	       System.out.print("Smallest Element = " + small); 
	   }
	}
