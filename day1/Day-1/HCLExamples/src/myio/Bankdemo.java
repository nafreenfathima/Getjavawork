package myio;
import java.nio.FloatBuffer;

public class Bankdemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Bank b=new Bank();
		b.display();
		
		Branch br=new Branch(1234,123);
		Branch branch=br;
		br.setBankid(1234);
		System.out.println(branch.getBankid());
		
		Customer c=new Customer();
		c.display();
		
		Account a= new Account();
		a.display();
		a.getAccountno();
		System.out.println(a.getAccountno());
		a.getBal();
		System.out.println("Available balance:"+a.getBal());
		
		
		
		Fixedaccount f =new Fixedaccount();
		f.getAccountno();
		System.out.println(f.getAccountno());
		f.display();
		if(f instanceof Account)
		{
			System.out.println("Fixed account is account type\n");
		}
		else
			System.out.println("Fixed account is not account type\n");
		
		
		
		
		Recurringaccount r= new Recurringaccount();
		r.getAccountnumber();
		System.out.println(r.getAccountno());
		r.display();
		if(r instanceof Account)
		{
			System.out.println("Recurring account is account type\n");
		}
		else
			System.out.println("Recurring account is not account type\n");
		
		
		
		
		SavingsAccount s= new SavingsAccount();
		if(s instanceof Account)
		{
			System.out.println("Savings account is account type\n");
		}
		else
			System.out.println("Savings account is not account type\n");
		s.display();
		
		Services sc=new Services();
		sc.display();
	}
}

