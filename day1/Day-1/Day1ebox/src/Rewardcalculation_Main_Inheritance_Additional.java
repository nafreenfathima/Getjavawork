import java.util.Scanner;

	public class Rewardcalculation_Main_Inheritance_Additional {

	    
	    public static void main(String[] args)
	    {
			
			Scanner s=new Scanner(System.in);
			HPVISACard hpvc=new HPVISACard();
			VISACard vc=new VISACard();
			 String c=null;
			   int ch=0;
			
			do {
		       System.out.println("Enter the holder name");
		       String holderName=s.next();
		       System.out.println("Enter the CCV number");
		       String ccv=s.next();
		       System.out.println("Enter the bill amount");
		       double amount=s.nextDouble();
		       System.out.println("Mention the type of spending");
		       String purchaseType=s.next();
		      System.out.println("Choose card type\n1.VISA card\r\n" + "2.HP VISA card");
			   ch=s.nextInt();
			if(ch==1)
				 {
				  	   System.out.println("Holder name:"+holderName+"\nCCV:"+ccv);
				  	   System.out.println("Reward points:"+vc.computeRewardPoints(purchaseType, amount));
				  	   System.out.println("Do you want to continue?(Y/N)");
			    	   c=s.next();   
				  }
		       
			else if(ch==2)
		       	   {
				         if(purchaseType.equals("Fuel"))
				          {
				         
		       		  System.out.println("Holder name:"+holderName+"\nCCV:"+ccv);
			    	  System.out.println("Reward points:"+hpvc.computeRewardPoints(purchaseType, amount));
			    	  System.out.println("Do you want to continue?(Y/N)");
			    	  c=s.next();
			    	  if(c.equals("N")||c.equals("n"))
				    	   break;
			    	  }
			    	  
			    	     else {
			    		  
				        	 System.out.println("Holder name:"+holderName+"\nCCV:"+ccv);
						  	   System.out.println("Reward points:"+vc.computeRewardPoints(purchaseType, amount));
						  	   System.out.println("Do you want to continue?(Y/N)");
					    	   c=s.next();
					    	   if(c.equals("N")||c.equals("n"))
					    	   break;
			    	     }  
			    	  
		       	   }
		
			else
			{
				System.out.println("Invalid Choice");
				System.out.println("Do you want to continue?(Y/N)");
				c=s.next();
				if(c.equals("N")||c.equals("n"))
					break;
				
			}
			
			
		}
			while((ch>=2)||(c.equals("y")||c.equals("Y")));
			
	}
	}

		


	    




	    



