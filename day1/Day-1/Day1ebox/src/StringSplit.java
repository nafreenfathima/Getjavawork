import java.util.Scanner;
	public class StringSplit{ 
		public static void main(String args[]){ 
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Enter the string");
		    String s1 =sc.nextLine();
		String[] words=s1.split(" ");
		System.out.println("The words in the string are"); //splits the string based on whitespace 
		//using java foreach loop to print elements of string array 
		for(String w:words){
		  
		System.out.println(w); 
		} 
		}} 


