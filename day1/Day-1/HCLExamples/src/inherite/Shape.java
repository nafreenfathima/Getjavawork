package inherite;


	public  abstract class Shape {
	     //instance variables or properties or characteristics or attributes or fields
		public String shapeName;
		public int vertex;
		
		//create abstract method - indicates to compiler, no body for this method
		public abstract void calcArea();
	}
	class Circle extends Shape
	{
	float radius,area;
	final static float PI=3.141f;
	//default constructor
	Circle()
	{
		
	}
	//overload constructor
	Circle (float radius)
	{
		    this.radius=radius;
	}
	public void calArea()
	{
	area=PI*radius*radius;
	System.out.println("Area of a circle is:"+area);
	}
	
	}
		
	class Triangle extends Shape
	{
	float base,height,area;
	
  Triangle()
	{
	System.out.println("constructing Triangle object");	
	}
	//constructor overloading
	Triangle (float base,float height)
	{
		    this.base=base;
		    this.height=height;
	}
	public void calArea()
	{
	area=0.5f*base*height;
	System.out.println("Area of a circle is:"+area);
	}
	
	}
		


