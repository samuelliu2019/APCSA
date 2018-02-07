//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{
		xOne = 0;
		yOne = 0;
		xTwo = 0;
		yTwo = 0;


	}

	public Distance(int x1, int y1, int x2, int y2)
	{

		xOne = x1;
		xTwo = x2;
		yOne = y1;
		yTwo = y2;

	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{

		xOne = x1;
		xTwo = x2;
		yOne = y1;
		yTwo = y2;

	}

	public void calcDistance()
	{

		distance = sqrt(((xTwo - xOne)*(xTwo - xOne) + (yTwo - yOne)*(yTwo - yOne)));
 	}

	public void print( )
	{
		System.out.println("Enter X1 :: " + xOne);
		System.out.println("Enter X2 :: " + xTwo);
		System.out.println("Enter Y1 :: " + yOne);
		System.out.println("Enter Y2 :: " + yTwo);
		System.out.println("distance == " + String.format("%.3f",distance));
		System.out.println("");
	}
}