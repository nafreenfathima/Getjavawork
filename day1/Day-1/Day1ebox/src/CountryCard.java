public class CountryCard extends TravelCreditcard
	{
	    double calculateAmount(Double amount,Integer numberOfPersons)
	 {
	  return (numberOfPersons*amount)-(10*(numberOfPersons*amount))/100;
	 }
	} 
