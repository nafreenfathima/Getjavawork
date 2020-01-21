package codecamp2;

import java.util.Scanner;
import java.io.*; 
import java.util.*; 
import java.lang.*; 
  
public class Program9 
{
	static String wordReverse(String str) 
	{ 
	    int i = str.length() - 1; 
	    int start, end = i + 1; 
	    String rev = ""; 
	    Program9 rev=new Program9();
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a string:");
		String stri=sc.nextLine();
	      
	    while(i >= 0) 
	    { 
	        if(str.charAt(i) == ' ') 
	        { 
	            start = i + 1; 
	            while(start != end) 
	                rev += str.charAt(start++); 
	              
	            rev += ' '; 
	              
	            end = i; 
	        } 
	        i--; 
	    } 
	      
	    start = 0; 
	    while(start != end) 
	        rev += str.charAt(start++); 
	    System.out.print(wordReverse(str)); 
	    return rev; 
	}
}
	  
	// Driver code 
	/*public static void main(String[] args) 
	{ 
	    String str = "I LIKE MANGOES"; 
	      
	    System.out.print(wordReverse(str)); 
	} 
	} 
	
	*/
	
	
	  
	