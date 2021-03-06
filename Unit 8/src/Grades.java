//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.lang.System;
import java.lang.Math;
import java.util.Scanner;

public class Grades
{
	//instance variables
	int length;
	int[] array;
	

	//constructor

	public Grades()
	{
		setLength(1);
		setArray(new int[]{1});
	}
	public Grades(int a, int[] vals)
	{
		setLength(a);
		setArray(vals);
	}
	//set method
	public void setLength(int l)
	{
		length = l;
	}
	
	public void setArray(int[] nums)
	{
		array = nums;
	}


	private double getSum()
	{
		double sum=0.0;

		for(int i = 0; i < array.length; i++)
		{
			sum = sum + array[i];
		}

		return sum;
	}

	public double getAverage()
	{
		double average=0.0;
		
		average = getSum()/length;
		return average;
	}


	public String toString()
	{
		String output = "";
		
		for(int in = 0; in < array.length; in++)
		{
			output = output + "grade " + Integer.toString(in) + " :: " + String.valueOf(array[in]) + "\n";
		}
		output += "average grade = " + getAverage();
		return output;
	}



}