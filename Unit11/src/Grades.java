//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Grades
{
	private double[] grades;
	
	public Grades()
	{
		setGrades("");
	}
	
	public Grades(String gradeList)
	{
		setGrades(gradeList);		
	}
	
	public void setGrades(String gradeList)
	{
		Scanner scan = new Scanner(gradeList);
		if(scan.hasNextInt())
		{
		grades = new double[scan.nextInt()];
		String dash = scan.next();
		for(int i = 0; i < grades.length; i++)
		{
				double input = Double.parseDouble(scan.next());
				grades[i] = input;
				
		   
		}
		}

	}
	
	public void setGrade(int spot, double grade)
	{
		grades[spot] = grade;


	}
	
	public double getSum()
	{
		double sum=0.0;
		for(int i = 0; i < grades.length;i++)
		{
			sum += grades[i];
		}



		return sum;
	}
	
	public double getLowGrade()
	{
		double low = Double.MAX_VALUE;

		for(int i = 0; i < grades.length; i++)
		{
			if(grades[i] < low)
			{
				low = grades[i];
			}
		}



		return low;
	}
	
	public double getHighGrade()
	{
		double high = Double.MIN_VALUE;

		for(int i = 0; i < grades.length; i++)
		{
			if(grades[i] > high)
			{
				high = grades[i];
			}
		}



		return high;
	}
	
	public int getNumGrades()
	{
		return grades.length;
	}
	
	public String toString()
	{
		String output="";
		for(double i : grades)
		{
			output += Double.toString(i) + " ";
		}

		return output;
	}	
}