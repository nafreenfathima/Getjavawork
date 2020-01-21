
	import java.util.ArrayList; 

	class CustomArrayList 
	{ 
		int n=4; 

		 
		class Student
		{ 
			// global variables of the class 
			int roll; 
			String fname; 
			String mname;
			String lname;

			// constructor has type of data that is required 
			Student( String fname, String mname, String lname) 
			{ 
				// initialize the input variable from main 
				// function to the global variable of the class 
				this.fname = fname; 
				this.mname = mname; 
				this.lname = lname; 
				 
			} 
		} 

		public static void main(String args[]) 
		{ 
			
			String name[] = {"Shab", "raj", "ram", "sam"}; 
			
			

			// Create an object of the class 
			CustomArrayList custom = new CustomArrayList(); 

			 
			
		

		public void addValues(String fname[], String mname[], String lname[]) 
							
		{ 
			ArrayList<Student> list=new ArrayList<>(); 

			for (int i = 0; i < n; i++) 
			{ 
				// constructor to be saved in the Data class 
			 
			} 

			//
			printValues(list); 
		} 

		public void printValues(ArrayList<Student> list) 
		{ 
			

			for (int i = 0; i < n; i++) 
			{ 

				Student data = list.get(i); 

				System.out.println(data.fname+" "+data.mname+" "
								+data.lname+" "); 
			} 
		} 
	} 


