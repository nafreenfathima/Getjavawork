import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Overrideoop {
public static void main(String[] args) throws IOException
{

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter Address Line 1");
String addline1=br.readLine();
System.out.println("Enter Address Line 2");
String addline2=br.readLine();
System.out.println("Enter the City Name");
String city=br.readLine();
System.out.println("Enter the State Name");
String state=br.readLine();
System.out.println("Enter the Pincode");
int pin = Integer.parseInt(br.readLine());
Address2 ad=new Address2(addline1,addline2,city,state,pin);
System.out.println("The Address Details are");
System.out.println(ad);

}

}


