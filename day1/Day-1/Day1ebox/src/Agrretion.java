import java.util.Scanner;
	public class Agrretion {
	 private static Staff staff;
	 public static void main(String[] args) {
	  
	  
	  Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the name of the staff:");
	        String staffName=sc.nextLine();
	        System.out.println("Enter the staff designation:");
	        String desig=sc.nextLine();
	        System.out.println("Enter the department name:");
	        String deptName=sc.next();
	        Staff s=new Staff(staffName, desig);
	        s.display();
	        Department d=new Department(deptName, staff);
	        d.display();
	        System.out.println(staffName+" is working in the " +deptName+ " department as " +desig);
	 }
	}




