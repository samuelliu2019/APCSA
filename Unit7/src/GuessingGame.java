//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;
	private int guesses = 0;

	public GuessingGame(int stop)
	{

		upperBound = stop;
	}

	public void playGame()
	{
		guesses = 0;
		Scanner keyboard = new Scanner(System.in);
		upperBound = keyboard.nextInt();
 		double r = Math.random();
		int whichnumber = (int)(r * upperBound);
		boolean guessed = false;
		do{
			System.out.println("Enter a number between 0 and " + upperBound );
			int input = keyboard.nextInt();
			if (input < 0 || input > upperBound)
			{
				System.out.println("Number out of range!");
			}
			else if (input == whichnumber)
			{
				guesses++;
				if (guesses == 1)
				{
					System.out.println("It took you 1 guess to guess " + whichnumber);
				}
				else
				{
				System.out.println("It took " + guesses + " guesses to guess " + whichnumber);
				}
				guessed = true;
			}
			
			else if (input != whichnumber)
			{
				guesses++;
			}
		}while (guessed == false);


	}

	public String toString()
	{
		String output="You guessed wrong " + (double)(100-(100/guesses)) + " percent of the time."; 
		return output;
	}
}