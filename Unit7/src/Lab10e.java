//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Lab10e
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		GuessingGame test = new GuessingGame(4);
		String playagain = "y";
		do{
		System.out.println("Guessing Game - how many numbers? ");
		test.playGame();
		System.out.println(test);
		System.out.println("Do you want to play again");
		String input = keyboard.next();
 		char a = input.charAt(0);
		if (a == 'y')
		{
			
		}
		else if (a == 'n')
		{
			playagain = "n";
		}
		else
		{
			System.out.println("enter y or n");
		}
		}while(playagain == "y");
 
	}
}