//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.io.File;

public class GradeBookFileRunner
{
   public static void main( String args[] ) throws Exception
   {
		out.println("Welcome to the Class Stats program!");
		
		Scanner file = new Scanner(new File("C:\\Users\\lius9308\\Desktop\\gradebook.dat"));
		String name = file.nextLine();
		int num = Integer.parseInt(file.nextLine());;
		Class test = new Class(name, num);
		for(int i = 0; i < num; i++)
		{
 			String stuname = file.nextLine();
 			String grades = file.nextLine();
			test.addStudent(i, new Student(stuname,grades));
		}


		out.println(test);
		test.sort();
		out.println(test);










	}		
}