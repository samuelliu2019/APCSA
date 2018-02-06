//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;

	public Quadratic()
	{
		a = 1;
		b = 1;
		c = 1;

	}

	public Quadratic(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;

	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;

 	}

	public void calcRoots( )
	{
		rootOne = (-b+(double)sqrt(b*b-(4*a*c)))/(2*a);
		rootTwo = (-b-sqrt(b*b-(4*a*c)))/(2*a);


	}

	public void print( )
	{
		System.out.println("Enter a :: " + a);
		System.out.println("Enter b :: " + b);
		System.out.println("Enter c :: " + c);
		System.out.println("");
		System.out.println("rootone :: " + String.format("%.2f",rootOne));
		System.out.println("roottwo :: " + String.format("%.2f",rootTwo));
		System.out.println("");
	}
}