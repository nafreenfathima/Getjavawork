package numbers;


	import java.lang.Math;
	public class Cuberoot 
	{
		public static void main(String[] args) 
		{
			int number=1,count=0,noOfPrimes=0,i=1;  
			while(noOfPrimes<25)  
			{  
				number=1;  
				count=0;  
				while(number<=i)  
				{  
					if(i%number==0)  
					count++;
					number++;  
				}  
					if(count==2)  
					{  
						System.out.println("Prime number:"+i);  
						int temp=i;
						System.out.println("cube root of "+ temp+" is "+Math.cbrt(temp)+"\n");
						noOfPrimes++;  
					}  
				i++; 
			}
		}
	}


