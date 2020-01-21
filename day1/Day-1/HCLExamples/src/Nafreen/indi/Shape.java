
public  abstract class Shape {
     //instance variables or properties or characteristics or attributes or fields
	public String shapeName;
	public int vertex;
	
	//create abstract method - indicates to compiler, no body for this method
	public abstract void calcArea();
}
class Circle extends shape
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
	

