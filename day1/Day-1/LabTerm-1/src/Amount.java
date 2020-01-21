import java.util.Scanner;
public class Amount {

public static void main(String[] args)
{

float amount = 0,amountx=0,amounty=0,finalAmount,serviceTax;
float fixedMeterRental=250.00f;

//reading the input form the user
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of units");
int units=sc.nextInt();
int temp=units; // storing in temporary variable for printing

//checking for first 100 units
if(units>=100)
{
amount=(float) (100*3.25);
units=units-100;

//checking for next 200 units
if(units>=200)
{
amountx=(float) (200*4.75);
units=units-200;
}
}

//calculating the amount for leftover units
amounty=(float) (units*3.256);

//Adding up all the amounts
finalAmount= fixedMeterRental+amount+amountx+amounty;

//calculating service tax
serviceTax=(float) (14.75*finalAmount);

//calculating the final amount with tax
float bill=finalAmount+serviceTax;
System.out.println("The electricity bill for "+ temp+" units is Rs."+bill);
}

}

