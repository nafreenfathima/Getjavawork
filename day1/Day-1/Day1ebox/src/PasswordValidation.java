import java.util.Scanner;
public class PasswordValidation {
  public static void main(String[] args) {
			
			Scanner s= new Scanner(System.in);
			System.out.println("Enter Customer Name :");
			String userName= s.next();
			System.out.println("Enter Password :");
			String passwd= s.next();
			
			Customer cu= new Customer(userName,passwd);
			
			if(passwd.length()>5)
			{
				//System.out.println(sb.charAt(4));
				if((passwd.charAt(4)=='a' || passwd.charAt(4)=='e'||passwd.charAt(4)=='i' ||passwd.charAt(4)=='o'||passwd.charAt(4)=='u'))
				{
					System.out.println("Strong password");
				}
				else
					System.out.println("Weak password");
			}
			else
				System.out.println("Weak password");

		}

	}
	
