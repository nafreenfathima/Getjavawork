package practice;

public class Constructor {
		int id;  
		String name; 
		Constructor(int i,String n){
		id=i;
		name=n;
		}
		//method to display the value of id and name  
		void display(){System.out.println(id+" "+name);}  
		  
		public static void main(String args[]){  
		//creating objects  
	 Constructor s1=new  Constructor(101,"mkg");  
	 Constructor s2=new  Constructor(23,"kjg");  
		//displaying values of the object  
		s1.display();  
		s2.display();  
		}  
		}  

