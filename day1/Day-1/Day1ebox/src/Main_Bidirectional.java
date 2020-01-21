import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
	public class Main_Bidirectional {
	    public static void main(String[] args) throws IOException {

	  InputStreamReader ir= new InputStreamReader(System.in);
	  BufferedReader br= new BufferedReader(ir);
	  List<Address_Bidirectional> addr= new ArrayList<Address_Bidirectional>();
	  List<Contact_Bidirectional> con= new ArrayList<Contact_Bidirectional>();
	  System.out.println("Enter the number of contact-address pair:");
	  int n= Integer.parseInt(br.readLine());
	 
	 
	  for(int i=0;i<n;i++)
	  {
	  System.out.println("Enter the address "+(i+1)+":");
	  String s=br.readLine();
	  String z[]=s.split(",");
	  Address_Bidirectional x= new Address_Bidirectional(z[1],z[0],z[2],z[3],Integer.parseInt(z[4]));
	  addr.add(x);
	 
	  System.out.println("Enter the contact "+(i+1)+":");
	  String s1= br.readLine();
	  String p[]=s1.split(",");
	  Contact_Bidirectional t= new Contact_Bidirectional(Integer.parseInt(p[0]),Integer.parseInt(p[1]),Integer.parseInt(p[2]),p[3]);
	  con.add(t);
	  }
	 
	  System.out.println("Enter the mobile of the contact to be searched:");
	  int r= Integer.parseInt(br.readLine());
	  int i=0;
	  int check=0;
	  for (Contact_Bidirectional contact : con) {
	    if(contact.getMobile()==r||contact.getAlternateNumber()==r||contact.getLandline()==r)
	{
	System.out.println("Contact-Address "+(i+1));
	System.out.println(con.get(i).toString());
	System.out.println(addr.get(i).toString());
	i++;
	check++;
	}
	}
	  if(check==0)
	  {
	  System.out.println("No contact with mobile "+r+" found");
	  }
	}
	}

