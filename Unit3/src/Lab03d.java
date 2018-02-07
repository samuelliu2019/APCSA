//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03d
{
	public static void main( String[] args )
	{
		//add test cases
		
		Distance test = new Distance();
		test.setCoordinates(1, 1, 2, 1);
		test.calcDistance();
		test.print();
		test.setCoordinates(1, 1, -2, 2);
		test.calcDistance();
		test.print();
		test.setCoordinates(1, 1, 0, 0);
		test.calcDistance();
		test.print();
		
			
	}
}