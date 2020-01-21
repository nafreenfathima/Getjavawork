public class HPVISACard extends VISACard 
	{
		@Override
		public Double computeRewardPoints(String purchaseType, Double amount)
		{
			
			return (amount*0.01)+10;
			
	}
	}


