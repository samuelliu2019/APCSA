//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class GradeBookRunner
{
   public static void main( String args[] )
   {
		out.println("Welcome to the Class Stats program!");
		
		Scanner keyboard = new Scanner(System.in);

		out.println("What is the name of this class?");
		String name = keyboard.next();
		out.println("How many students are in this class?");
		int num = keyboard.nextInt();
		Class test = new Class(name, num);
		for(int i = 0; i < num; i++)
		{
			System.out.println("Enter the name of student " + (i+1));
			String stuname = keyboard.next();
			System.out.println("Enter the grades for " + stuname);
			System.out.println("Use the format x - grades ( 2 - 100 100)");
			String blank = keyboard.nextLine();
 			String grades = keyboard.nextLine();
			test.addStudent(i, new Student(stuname,grades));
		}

		out.println(test);














	}		
}