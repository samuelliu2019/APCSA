//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Line
{
	private int xOne,yOne, xTwo, yTwo;
	private double slope;

	public Line(int x1, int y1, int x2, int y2)
	{

		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;


	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{

		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;


	}

	public void calculateSlope( )
	{
		double yDif = yTwo - yOne;
		double xDif = xTwo - xOne;
		slope = yDif/xDif;
 	}

	public void print( )
	{

		System.out.println("The slope is " + String.format("%.2f",slope));

	}
}