import java.util.Scanner;
public class Age {
	 public static void main(String args[]) 
	    {
	        String name, gender;
	        int age;
	       
	         
	        Scanner SC=new Scanner(System.in);
	         
	     //  System.out.print("Enter name: ");
	        name= SC.nextLine();
	         
	      //  System.out.print("Enter age: ");
	        age=SC.nextInt();
	 
	    //    System.out.print("Enter Gender (Male/Female): ");
	        gender=SC.next();
	 
	         
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Gender: " + gender);
	                                  
	    }
	}

