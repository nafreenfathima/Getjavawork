import java.util.Scanner;
import  java.lang.Math;

		  class Circle
		{
		  float radius;
		  Circle(float radius)
		 {
		   this.radius=radius;
		 }
		public void calcArea()
		{
			float area=2*3.14f*radius;
			System.out.println("area of the circle is "+area);
			
		}
		public void calcPerimetr()
		{
			float perimeter=3.14f*radius*radius;
			System.out.println("perimetr of the circle is " +perimeter);
		}

	 }	
		
		class Square
		{
			float side;
			Square(float side)
			{
			this.side=side;
			}
			public void calcArea()
			{
				float area=side*side;
				System.out.println("area of the square is "+area);
				
			}
			public void calcPerimetr()
			{
				float perimeter=4*side;
				System.out.println("perimetr of the circle is " +perimeter);
			}
		}
			class Pentagon 
			{
				float side;
				Pentagon(float side)
				{
				this.side=side;
				}
				public void calcArea()
				{
					float area=(float)(Math.sqrt(5*(5+5*(Math.sqrt(5))))*side*side)/4;
					System.out.println("area of the pentagon is "+area);
					
				}
			
		
				public void calcPerimetr()
				{
					float perimeter=5*side;
					System.out.println("perimetr of the pentagon is " +perimeter);
				}
			}
		
			public	abstract class Shape {
					 abstract void getPerimeter();
					 abstract void getArea();
					  
		
		public static void main(String args[])
		{
			Scanner sc= new Scanner(System.in);
			
		
		Circle c= new Circle(0);
		System.out.println("enter radius of the circle ");
		c.radius=sc.nextFloat();
		Pentagon p= new Pentagon(0);
		System.out.println("enter side of the pentagon ");
		p.side=sc.nextFloat();
		Square s= new Square(0);
		System.out.println("enter side of the square ");
		s.side=sc.nextFloat();
		c.calcArea();
		c.calcPerimetr();
		p.calcArea();
		p.calcPerimetr();
		s.calcArea();
		s.calcPerimetr();
		}
	
	
	
}
