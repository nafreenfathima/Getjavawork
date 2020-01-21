package oop;
import java.util.Scanner;

public class Retails {
	
	
	
		public static void main(String[] args) {
			Scanner keyBoard =new Scanner(System.in); 
			  //total Retail 
			  double totalRetail=0; 
			  // Use a sentinel-controlled loop to determine when the 
			   //program should stop looping and display the final results. 
			  while(true){ 
			   //display menu 
			   System.out.println("1 - Product 1, $22.50"); 
			   System.out.println("2 - Product 2, $44.50");  
			   System.out.println("3 - Product 3, $9.98");  
			    System.out.println("4 - Exit program"); 
			   System.out.print("Enter product number: "); 
			   int productnumber=keyBoard.nextInt(); 
			   //exit program 
			   if(productnumber==4){ 
			    break; 

			 
			    } 
			    
			   ///Enter quantity sold 
			   System.out.print("Enter quantity sold: "); 
			   int quantitySold=keyBoard.nextInt(); 
			   //use a switch statement to determine the retail price 
			    //for each product. 
			   switch(productnumber){ 
			    case 1: 
			     totalRetail+=22.50*quantitySold; 
			     break; 
			    case 2: 
			     totalRetail+=44.50*quantitySold; 
			     break; 
			    case 3: 
			     totalRetail+=9.98*quantitySold; 
			     break; 
			   } 
			   //display reset 
			   System.out.println("\nThe total retail value of all products sold: $"+totalRetail); 
			  } 
			 
			 } 
}
