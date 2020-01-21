import java.io.IOException;
import java.util.ArrayList;

class Search
	{ 
		public static void main(String[] args) 
						throws IOException 
		{ 
			// size of ArrayList 
			int n = 5; 

			
			ArrayList<Integer> arr = new ArrayList<Integer>(n); 

			
			for (int i=1; i<=n; i++) 
				arr.add(i); 

			// Printing elements 
			System.out.println(arr); 

		
			arr.remove(3); 

			// Displaying ArrayList after deletion 
			System.out.println(arr); 

			// Printing elements one by one 
			for (int i=0; i<arr.size(); i++) 
				System.out.print(arr.get(i)+" "); 
		} 
	} 


