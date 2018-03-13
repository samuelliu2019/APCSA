//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.util.Collections;


import java.util.ArrayList;

public class Class
{
	private String Name;
	private ArrayList<Student> studentList;

	
	public Class()
	{
		Name="";
		studentList = new ArrayList<Student>(0);
	}
	
	public Class(String name, int stuCount)
	{
		Name = name;
		studentList = new ArrayList<Student>(stuCount);
	}
	
	public void addStudent(int stuNum, Student s)
	{
		studentList.add(stuNum, s);
	}
	
	public String getClassName()
	{
	   return Name;	
	}
	
	public double getClassAverage()
	{
		double classAverage=0.0;
		for(Student s : studentList)
		{
			classAverage += s.getAverage();
		}
		classAverage /= (double)studentList.size();

		return classAverage;
	}
	
	public double getStudentAverage(int stuNum)
	{
		return studentList.get(stuNum).getAverage();
	}

	public double getStudentAverage(String stuName)
	{
		for(Student s: studentList)
		{
			if(s.getName() == stuName)
			{
				return s.getAverage();
			}
		}


		return 0.0;
	}
	
	public String getStudentName(int stuNum)
	{
		return studentList.get(stuNum).getName();
	}

	public String getStudentWithHighestAverage()
	{
		sort();
		return studentList.get(studentList.size()-1).getName();
	}

	public String getStudentWithLowestAverage()
	{
		sort();
		return studentList.get(0).getName();
	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";
		for(int i = 0; i < studentList.size(); i++)
		{
			if(studentList.get(i).getAverage() < failingGrade)
			{
				output += studentList.get(i).getName() + " ";
			}
		}




		return output;
	}
	
	public String toString()
	{
		String output="\n" + ""+getClassName()+"\n";
		for(int i = 0; i < studentList.size(); i++)
		{
			output = output + studentList.get(i).toString()  + "      Average =   " + Double.toString((studentList.get(i)).getAverage()) +  "\n";
		}
		output += "Failure List = " + getFailureList(65)+ "\n";
		output += "Highest Average = " + getStudentWithHighestAverage()+ "\n";
		output += "Lowest Average = " + getStudentWithLowestAverage()+ "\n";
		output += "Class average = " + getClassAverage()+ "\n";

		return output;
	}  	
	public void sort()
	{
		Collections.sort(studentList);
	}
}