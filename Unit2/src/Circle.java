//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Circle extends Lab02e
{
	private double radius;
	private double area;

	public void setRadius(double rad)
	{
		radius = rad;
	}

	public void calculateArea( )
	{
		area = Math.PI*radius*radius;
	}

	public void print( )
	{
		calculateArea();
		System.out.println("The area is :: " +  String.format("%.4f",area));
	}
}