//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab24d
{
	public static void main( String args[] ) throws IOException
	{
		TicTacToe test = new TicTacToe();
		Scanner file = new Scanner(new File ("C:\\Users\\leuma\\Downloads\\Unit14_2016\\Unit14-Assignments\\lab24d.dat"));
		int size = file.nextInt();
		file.nextLine();
		for(int i = 0; i<size; i++)
		{
			String word = file.next();
			test.setTicTacToe(word);
			System.out.println(test);



	   }






	}
}



