import java.util.Scanner;
public class Association {
	 public static void main(String[] args)
	 {
	  
	       Scanner sc=new Scanner(System.in);
	       System.out.println("Enter the student name:");
	       String sname=sc.nextLine();
	       System.out.println("Enter the register number:");
	       int regno=sc.nextInt();
	       System.out.println("Enter the course id:");
	       int id=sc.nextInt();
	       System.out.println("Enter the course name:");
	       String cname=sc.next();
	       Student s=new Student(sname, id);
	       s.display();
	       Course c=new Course(id, cname);
	       c.display();
	       System.out.print(sname+ " is learning the " +cname+ " course");
	      
	 }
	}

