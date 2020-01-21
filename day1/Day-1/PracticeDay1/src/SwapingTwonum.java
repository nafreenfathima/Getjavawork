

public class SwapingTwonum {
	public static void main(String args[])
	{
		int a=2;
		int b=3;
		
		System.out.println("Before swap:");
		System.out.println("a value:"+a );
		System.out.println("b value:"+b );
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swap:");
		System.out.println("a value:"+a );
		System.out.println("b value:"+b );
	}

}
